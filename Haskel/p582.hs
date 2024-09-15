countTriangles :: Integer -> Integer
countTriangles limit = sum [1 | a <- [1..limit], b <- [a..min (a + 100) limit], is120DegreeTriangle a b]
  where
    is120DegreeTriangle a b = cSquared == aSquared + bSquared && a <= b && b <= c && b - a <= 100
      where
        aSquared = a^2
        bSquared = b^2
        cSquared = (a + b)^2
        c = a + b

main :: IO ()
main = print $ countTriangles (10^100)
