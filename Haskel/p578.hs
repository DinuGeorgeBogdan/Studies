import Data.Array

countDecreasingPrimePowers :: Integer -> Integer
countDecreasingPrimePowers n = dp ! (0, fromIntegral n)

primes :: [Integer]
primes = sieve [2..]
  where
    sieve (p:xs) = p : sieve [x | x <- xs, x `mod` p /= 0]

dp :: Array (Integer, Integer) Integer
dp = array ((0, 0), (60, 10000000000000)) [((i, j), count i j) | i <- [0..60], j <- [0..10000000000000]]

count :: Integer -> Integer -> Integer
count i j
  | j == 0    = 1
  | i == 0    = 0
  | otherwise = count (i - 1) j + count i (j - p^i)
  where
    p = primes !! fromIntegral i

main :: IO ()
main = print $ countDecreasingPrimePowers (10^13)
