import Data.Array

modulus :: Int
modulus = 10^9

lcm1ToN :: Int -> Int
lcm1ToN n = foldl lcm 1 [1..n]

hl :: Int -> Int
hl n = hArray ! n
  where
    hArray = listArray (1, n) [calculateHL i | i <- [1..n]]

    calculateHL k = sum [hArray ! (n `div` k) | n <- [k, 2*k..n], k == lcm1ToN n `div` k `div` k]

main :: IO ()
main = print $ hl 50000 `mod` modulus
