isIntegralEnvelope :: Integer -> Integer -> Integer -> Integer -> Integer -> Bool
isIntegralEnvelope a b c d e =
    isIntegralSide a && isIntegralSide b && isIntegralSide c &&
    isIntegralSide d && isIntegralSide e &&
    isIntegralDiagonal (a + d) && isIntegralDiagonal (b + e) &&
    isIntegralDiagonal (c + d + e) && isIntegralDiagonal (c + e)

isIntegralSide :: Integer -> Bool
isIntegralSide x = x > 0 && x == fromIntegral (round (fromIntegral x))

isIntegralDiagonal :: Integer -> Bool
isIntegralDiagonal x = isIntegralSide x && isSquare (x^2 - 1) where
    isSquare n = round (sqrt (fromIntegral n))^2 == n

sumHeronEnvelopesPerimeter :: Integer -> Integer
sumHeronEnvelopesPerimeter limit = sum [a + b + c + d + e | a <- [1..limit], b <- [a..limit],
    c <- [b..limit], d <- [1..limit], e <- [d..limit],
    a + b + c + d + e <= limit, isIntegralEnvelope a b c d e]

main :: IO ()
main = print $ sumHeronEnvelopesPerimeter (10^7)
