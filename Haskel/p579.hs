import Data.Array
countLatticeCubes :: Integer -> Integer
countLatticeCubes n = dp ! fromIntegral n
dp :: Array Integer Integer
dp = array (0, 5000) [(i, count i) | i <- [0..5000]]

count :: Integer -> Integer
count 0 = 1
count n = countSurface + countInterior
  where
    countSurface = 6 * n^2
    countInterior = n^3

sumLatticePoints :: Integer -> Integer
sumLatticePoints n = sum [countLatticeCubes i | i <- [0..n]]

main :: IO ()
main = print $ sumLatticePoints 5000 `mod` 10^9
