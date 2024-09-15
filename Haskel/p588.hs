import Data.Array

binomial :: Int -> Int -> Integer
binomial n k = binomArray ! (n, k)
  where
    binomArray = array ((0, 0), (n, n)) [((i, j), calcBinomial i j) | i <- [0..n], j <- [0..i]]
    calcBinomial i j
      | j == 0 || j == i = 1
      | otherwise = binomArray ! (i - 1, j - 1) + binomArray ! (i - 1, j)

quintinomial :: Int -> Integer
quintinomial k = sum [binomial k i | i <- [0, 4..k]]

countOddCoefficients :: Int -> Int
countOddCoefficients k = length $ filter odd $ map (fromIntegral . quintinomial) [0..k]

main :: IO ()
main = print $ sum [countOddCoefficients (10^k) | k <- [1..18]]
