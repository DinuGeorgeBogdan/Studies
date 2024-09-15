isPrime :: Integer -> Bool
isPrime n
    | n <= 1    = False
    | otherwise = all (\k -> n `mod` k /= 0) [2..isqrt n]
    where
        isqrt = floor . sqrt . fromIntegral
primeFactors :: Integer -> [Integer]
primeFactors n
    | n <= 1    = []
    | otherwise = factorize n 2
    where
        factorize x k
            | x == 1         = []
            | x `mod` k == 0 = k : factorize (x `div` k) k
            | otherwise      = factorize x (k + 1)
triangularNumbers :: [Integer]
triangularNumbers = scanl1 (+) [1..]
isSmooth :: Integer -> Integer -> Bool
isSmooth n p = all (\f -> f <= p) (primeFactors n)
findSmoothTriangularNumbers :: Integer -> [Integer]
findSmoothTriangularNumbers p = filter (\n -> isSmooth n p) triangularNumbers

main :: IO ()
main = print $ sum $ findSmoothTriangularNumbers 47
