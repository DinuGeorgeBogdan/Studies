import Data.List

hilbertNumbers :: Integer -> [Integer]
hilbertNumbers limit = filter (\x -> x `mod` 4 == 1) [1..limit]

squares :: [Integer]
squares = map (^2) [1..]

squarefreeHilbertNumbers :: Integer -> [Integer]
squarefreeHilbertNumbers limit = sieve (hilbertNumbers limit) squares
  where
    sieve [] _ = []
    sieve (x:xs) (y:ys)
      | x == y    = sieve xs ys
      | otherwise = x : sieve xs (y:ys)

countSquarefreeHilbertNumbers :: Integer -> Int
countSquarefreeHilbertNumbers limit = length $ squarefreeHilbertNumbers limit

main :: IO ()
main = print $ countSquarefreeHilbertNumbers (10^16)
