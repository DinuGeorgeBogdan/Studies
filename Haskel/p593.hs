import Data.List (sort)

nthPrime :: Int -> Integer
nthPrime k = head $ drop (k - 1) $ filter isPrime [2..]

isPrime :: Integer -> Bool
isPrime n = n > 1 && all (\d -> n `mod` d /= 0) [2..floor (sqrt (fromIntegral n))]

sequenceS :: Int -> [Integer]
sequenceS n = take n $ map (\k -> nthPrime k ^ k `mod` 10007) [1..]

sequenceS2 :: Int -> [Integer]
sequenceS2 n = zipWith (+) (sequenceS n) (0 : sequenceS2 (n `div` 10000 + 1))

median :: [Integer] -> Double
median xs
  | odd len = fromIntegral $ sorted !! mid
  | even len = 0.5 * fromIntegral (sorted !! mid + sorted !! (mid - 1))
  where
    sorted = sort xs
    len = length sorted
    mid = len `div` 2

sumF :: Int -> Int -> Double
sumF n k = sum $ map (median . take k) $ take (n - k + 1) (iterate tail (sequenceS2 n))

main :: IO ()
main = print $ sumF (10^7) (10^5)
