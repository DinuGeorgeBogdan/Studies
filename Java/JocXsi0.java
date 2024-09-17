
public class TicTacToe {
    // —> Definesc variabilele jocului:
var piesa; // {0: gol, 1: X, 2: 0}
var juc_crt; // {1: X, 2: 0}
var cx; // {1, 2, 3, …, 10}
var cy; // {1, 2, 3, …, 10}
var stare_joc; // {1: in desfasurare, 2: terminat egal, 3: terminat victorie X, 4: terminat victorie 0}
var nr_mutare; // {1, 2, 3, …, 10}
// —> Definesc functiile necesare:
function AprindeNrCul(x, y, nc)
{
  if (nc == 0)
    Aprinde(x, y, ALB);
  else if (nc == 1)
    Aprinde(x, y, NEGRU);
  else if (nc == 2)
    Aprinde(x, y, ROSU);
  else if (nc == 3)
    Aprinde(x, y, VERDE);
  else if (nc == 4)
    Aprinde(x, y, ALBASTRU);
  else if (nc == 5)
    Aprinde(x, y, GRI);
  else if (nc == 6)
    Aprinde(x, y, GALBEN);
  else if (nc == 7)
    Aprinde(x, y, TURCOAZ);
}
function DeseneazaEcranJoc()
{
  // Deseneaza tabla
  var nr_culoare = 0;
  if (stare_joc == 1)
    nr_culoare = 5;
  else if (stare_joc == 2)
    nr_culoare = 1;
  else if (stare_joc == 3)
    nr_culoare = 4;
  else if (stare_joc == 4)
    nr_culoare = 3;
  var i;
  i = 1;
  while (i<=10)
  {
    // liniile orizontale
    AprindeNrCul(i, 1, nr_culoare);
    AprindeNrCul(i, 4, nr_culoare);
    AprindeNrCul(i, 7, nr_culoare);
    AprindeNrCul(i, 10, nr_culoare);
    // liniile verticale
    AprindeNrCul(1, i, nr_culoare);
    AprindeNrCul(4, i, nr_culoare);
    AprindeNrCul(7, i, nr_culoare);
    AprindeNrCul(10, i, nr_culoare);
    i = i+1;
  }
  // Deseneaza piesele
  var l;
  var c;
  l = 0;
  while (l < 3)
  {
    c = 0;
    while (c < 3)
    {
      nr_culoare = 0;
      if (piesa[l][c] == 0)
        nr_culoare = 0;
      else if (piesa[l][c] == 1)
        nr_culoare = 4;
      else if (piesa[l][c] == 2)
        nr_culoare = 3;
      AprindeNrCul(2+c*3, 9-l*3, nr_culoare);
      AprindeNrCul(2+c*3+1, 9-l*3, nr_culoare);
      AprindeNrCul(2+c*3, 9-l*3-1, nr_culoare);
      AprindeNrCul(2+c*3+1, 9-l*3-1, nr_culoare);
      c = c+1;
    }
    l = l+1;
  }
  // Deseneaza cursorul
  if (stare_joc == 1)
  {
    Aprinde(cx, cy, ROSU);
  }
}
function CalcDiv(A, B)
{
  var rest = A % B;
  var cat = (A-rest)/B;
  return cat;
}
function PunePiesa()
{
  var c = CalcDiv(cx-2, 3);
  var l = CalcDiv(9-cy, 3);
  if (piesa[l][c] == 0)
  {
    piesa[l][c] = juc_crt;
    return 1;
  }
  else
  {
    return 0;
  }
}
function VerificaVictorie()
{
  if ( ( (piesa[0][0]==1)&&(piesa[0][1]==1)&&(piesa[0][2]==1) ) ||
        ( (piesa[1][0]==1)&&(piesa[1][1]==1)&&(piesa[1][2]==1) ) ||
        ( (piesa[2][0]==1)&&(piesa[2][1]==1)&&(piesa[2][2]==1) ) ||
        ( (piesa[0][0]==1)&&(piesa[1][0]==1)&&(piesa[2][0]==1) ) ||
        ( (piesa[0][1]==1)&&(piesa[1][1]==1)&&(piesa[2][1]==1) ) ||
        ( (piesa[0][2]==1)&&(piesa[1][2]==1)&&(piesa[2][2]==1) ) ||
        ( (piesa[0][0]==1)&&(piesa[1][1]==1)&&(piesa[2][2]==1) ) ||
        ( (piesa[2][0]==1)&&(piesa[1][1]==1)&&(piesa[0][2]==1) ) )
  {
    stare_joc = 3;
  }
  if ( ( (piesa[0][0]==2)&&(piesa[0][1]==2)&&(piesa[0][2]==2) ) ||
        ( (piesa[1][0]==2)&&(piesa[1][1]==2)&&(piesa[1][2]==2) ) ||
        ( (piesa[2][0]==2)&&(piesa[2][1]==2)&&(piesa[2][2]==2) ) ||
        ( (piesa[0][0]==2)&&(piesa[1][0]==2)&&(piesa[2][0]==2) ) ||
        ( (piesa[0][1]==2)&&(piesa[1][1]==2)&&(piesa[2][1]==2) ) ||
        ( (piesa[0][2]==2)&&(piesa[1][2]==2)&&(piesa[2][2]==2) ) ||
        ( (piesa[0][0]==2)&&(piesa[1][1]==2)&&(piesa[2][2]==2) ) ||
        ( (piesa[2][0]==2)&&(piesa[1][1]==2)&&(piesa[0][2]==2) ) )
  {
    stare_joc = 4;
  }
}
function FunctieTaste(ev)
{
  var tasta = TastaApasata(ev);
  // mutare cursor
  if ( (tasta == 'a') && (cx >= 5) )
    cx = cx-3;
  if ( (tasta == 'd') && (cx <= 5) )
    cx = cx+3;
  if ( (tasta == 's') && (cy >= 6) )
    cy = cy-3;
  if ( (tasta == 'w') && (cy <= 6) )
    cy = cy+3;
  // plasare piesa
  if (tasta == 'p')
  {
    var rez = PunePiesa();
    // efectueaza mutare
    if (rez == 1)
    {
      juc_crt = 3-juc_crt;
      nr_mutare = nr_mutare+1;
      VerificaVictorie();
      // daca n-a fost victorie, verifica remiza
      if ( (stare_joc < 3) && (nr_mutare == 10) )
      {
        stare_joc = 2;
      }
    }
  }
  // reimprospatare ecran
  DeseneazaEcranJoc();
  if (stare_joc != 1)
  {
    AscultaTaste();
  }
}
// —> Programul propriu-zis:
// Initializez variabilele
piesa = Matrice(3, 3);
piesa[0][0] = 0; piesa[0][1] = 0; piesa[0][2] = 0;
piesa[1][0] = 0; piesa[1][1] = 0; piesa[1][2] = 0;
piesa[2][0] = 0; piesa[2][1] = 0; piesa[2][2] = 0;
juc_crt = 1;
cx = 2; cy = 9;
stare_joc = 1;
nr_mutare = 1;
// Desenez ecranul initial
DeseneazaEcranJoc();
// Asculta apasarea tastelor
AscultaTaste(FunctieTaste);
}
