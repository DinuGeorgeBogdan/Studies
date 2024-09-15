import Control.Monad

hexagonCount :: Integer -> Integer
hexagonCount n = sum [div (k * (k - 1)) 2 | k <- [3..n]]

main :: IO ()
main = print $ sum [hexagonCount n | n <- [3..12345]]
