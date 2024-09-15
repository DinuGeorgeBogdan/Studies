import Data.Ratio


probability :: Integer -> Integer -> Rational
probability n k = 2 * min k (n - k) % (n * (n + 1))

expectedStartingNumber :: Integer -> Rational
expectedStartingNumber n = sum [fromIntegral k * probability n k | k <- [1..n]]
main :: IO ()
main = do
    let result = expectedStartingNumber 1000000
    print $ round $ (fromRational result :: Double) * 10000 / 1e4 / 1e4
