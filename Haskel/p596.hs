import Data.List (foldl')

t :: Integer -> Integer
t r = 8 * sum [countQuadruplets x y z | x <- [0..r], y <- [0..r], z <- [0..r], let t = round (sqrt (fromIntegral (r^2 - x^2 - y^2 - z^2))), t^2 + x^2 + y^2 + z^2 <= r^2]

countQuadruplets :: Integer -> Integer -> Integer -> Integer
countQuadruplets x y z = min x (min y (min z (round (sqrt (fromIntegral (x^2 + y^2 + z^2)))))) + 1

result :: Integer -> Integer
result r = t r `mod` 1000000007

main :: IO ()
main = print $ result (10^8)
