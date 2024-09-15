e :: Int -> Int -> Double
e m n = fromIntegral (m * (m - n) * (120 * m - 2 * n * (m + n - 1))) / fromIntegral (2 * (m * (m - 1) - n * (n - 1)))

s :: Int -> Double
s k = sum [e m n | m <- [2..k], n <- [1..m-1]]

main :: IO ()
main = print $ roundToTwoDecimals $ s 100

roundToTwoDecimals :: Double -> Double
roundToTwoDecimals x = fromIntegral (round $ x * 100) / 100