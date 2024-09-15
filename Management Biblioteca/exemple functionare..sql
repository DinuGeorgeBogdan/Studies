/*Afișare informații despre cărți și autori:*/

SELECT CARTE.titlu_carte, AUTOR.nume_autor
FROM CARTE
JOIN AUTOR ON CARTE.id_carte = AUTOR.it_carte;

/*Găsirea cărților împrumutate de un anumit cititor:*/

SELECT CARTE.titlu_carte, IMPRUMUTURI.data_imprumut, IMPRUMUTURI.data_scadenta
FROM CARTE
JOIN IMPRUMUTURI ON CARTE.id_carte = IMPRUMUTURI.id_carte
JOIN CITITOR ON IMPRUMUTURI.id_cititor = CITITOR.id_cititor
WHERE CITITOR.nume_cititor = 'Joe Smith';

/*Actualizarea adresei unui cititor:*/

UPDATE CITITOR
SET adressa_cititor = '44 Rue Avenue, New York, NY 10010'
WHERE nume_cititor = 'Jane Smith';

/*Ștergerea unei cărți și a copiilor aferenți:*/

DELETE FROM CARTE
WHERE titlu_carte = 'Dune';

DELETE FROM COPIE_CARTE
WHERE id_carte = (SELECT id_carte FROM CARTE WHERE titlu_carte = 'Dune');

/*Afișarea cărților disponibile într-o filială specifică:*/

SELECT CARTE.titlu_carte, COPIE_CARTE.nr_copii
FROM CARTE
JOIN COPIE_CARTE ON CARTE.id_carte = COPIE_CARTE.id_carte
WHERE COPIE_CARTE.id_filiala = 1 AND COPIE_CARTE.nr_copii > 0;

/*Afișare cărți dintr-o anumită editură:*/
SELECT * FROM CARTE WHERE nume_editura = 'DAW Books';

/*Afișare cărți disponibile la o anumită filială:*/
SELECT * FROM COPIE_CARTE WHERE id_filiala = 1 AND nr_copii > 0;

/*Afișare detalii despre un autor specific:*/
SELECT * FROM AUTOR WHERE nume_autor = 'Stephen King';

/*Afișare cărți scrise de un autor specific:*/
SELECT * FROM CARTE WHERE id_carte IN (SELECT id_carte FROM AUTOR WHERE nume_autor = 'J.K. Rowling');

/*Afișare detaliată a împrumuturilor, inclusiv informații despre cărți și cititori:*/
SELECT I.*, C.titlu_carte, CT.nume_cititor
FROM IMPRUMUTURI I
JOIN CARTE C ON I.id_carte = C.id_carte
JOIN CITITOR CT ON I.id_cititor = CT.id_cititor;

/*Afișare toate cărțile împrumutate, cu detalii complete, la o anumită filială:*/
SELECT I.*, C.titlu_carte, CT.nume_cititor
FROM IMPRUMUTURI I
JOIN CARTE C ON I.id_carte = C.id_carte
JOIN CITITOR CT ON I.id_cititor = CT.id_cititor
WHERE I.id_filiala = 1;


/*Afișare numărul total de cărți disponibile la fiecare filială:*/
SELECT id_filiala, COUNT(*) AS 'Numar de Carti Disponibile'
FROM COPIE_CARTE
WHERE nr_copii > 0
GROUP BY id_filiala;


/*Afișare detaliată a tuturor împrumuturilor cu cartea 'The Name of the Wind':*/
SELECT I.*, C.titlu_carte, CT.nume_cititor
FROM IMPRUMUTURI I
JOIN CARTE C ON I.id_carte = C.id_carte
JOIN CITITOR CT ON I.id_cititor = CT.id_cititor
WHERE C.titlu_carte = 'The Name of the Wind';


/*Afișare toate împrumuturile efectuate de un anumit cititor, cu detalii complete despre cărțile împrumutate:*/
SELECT I.*, C.titlu_carte, E.nume_editura
FROM IMPRUMUTURI I
JOIN CARTE C ON I.id_carte = C.id_carte
JOIN EDITURA E ON C.nume_editura = E.nume_editura
WHERE I.id_cititor = 102;

/*Subinterogare: Afișare numărul total de împrumuturi pentru fiecare cititor:*/
SELECT CT.nume_cititor, 
       (SELECT COUNT(*) FROM IMPRUMUTURI WHERE id_cititor = CT.id_cititor) AS 'Numar de Imprumuturi'
FROM CITITOR CT;

/*Subinterogare: Afișare cărți scrise de autori care au scris mai mult de o carte:*/
SELECT C.*
FROM CARTE C
WHERE C.id_carte IN (SELECT A.it_carte FROM AUTOR A GROUP BY A.it_carte HAVING COUNT(A.id_autor) > 1);

/*Utilizare VIEW: Crearea unei viziuni pentru a afișa detalii complete despre împrumuturi:*/
CREATE VIEW DetaliiImprumuturi AS
SELECT I.id_imprumut, I.id_carte, I.id_filiala, I.id_cititor, I.data_imprumut, I.data_scadenta, 
       C.titlu_carte, CT.nume_cititor
FROM IMPRUMUTURI I
JOIN CARTE C ON I.id_carte = C.id_carte
JOIN CITITOR CT ON I.id_cititor = CT.id_cititor;

--Utilizarea viziune
SELECT * FROM DetaliiImprumuturi;

/*Utilizare VIEW: Afișare cărți disponibile la o anumită filială:*/

CREATE VIEW CartiDisponibile AS
SELECT CC.id_carte, C.titlu_carte, CC.id_filiala, CC.nr_copii
FROM COPIE_CARTE CC
JOIN CARTE C ON CC.id_carte = C.id_carte
WHERE CC.nr_copii > 0;

-- Utilizare viziune
SELECT * FROM CartiDisponibile WHERE id_filiala = 1;

/*Subinterogare și VIEW: Afișare numărul total de împrumuturi pentru fiecare carte:*/

CREATE VIEW NumarImprumuturiPeCarte AS
SELECT C.id_carte, C.titlu_carte, COUNT(I.id_imprumut) AS 'Numar de Imprumuturi'
FROM CARTE C
LEFT JOIN IMPRUMUTURI I ON C.id_carte = I.id_carte
GROUP BY C.id_carte, C.titlu_carte;

-- Utilizare subinterogare și viziune
SELECT N.*, E.adresa_editura
FROM NumarImprumuturiPeCarte N
JOIN CARTE C ON N.id_carte = C.id_carte
JOIN EDITURA E ON C.nume_editura = E.nume_editura;
