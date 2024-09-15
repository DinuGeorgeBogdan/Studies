isPrime :: Integer -> Bool
isPrime n
    | n <= 1    = False
    | otherwise = not $ any (\x -> n `mod` x == 0) [2..floor $ sqrt $ fromIntegral n]

smallestA :: Integer -> Integer
smallestA p = head [a | a <- [1..p-1], let b = p - a, a >= b && a * b `mod` (p - 1) == 0]

s :: Integer -> Integer
s n = sum [smallestA p | p <- [2..n-1], isPrime p]

main :: IO ()
main = print $ s 3800
