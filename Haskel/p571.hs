import Data.List (permutations)

toBaseDigits :: Integer -> Integer -> [Integer]
toBaseDigits 0 _ = []
toBaseDigits n base = toBaseDigits (n `div` base) base ++ [n `mod` base]

isPandigitalInBase :: Integer -> Integer -> Bool
isPandigitalInBase n base = all (`elem` digits) [0..base-1]
  where
    digits = toBaseDigits n base

isNSuperPandigital :: Integer -> Integer -> Bool
isNSuperPandigital n num = all (isPandigitalInBase n) [2..num]

sumNSuperPandigital :: Integer -> Integer -> Integer
sumNSuperPandigital k n = sum $ take (fromIntegral k) $ filter (isNSuperPandigital n) [1..]

main:: IO()
main= sumNSuperPandigital 10 12