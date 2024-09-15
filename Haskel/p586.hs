import qualified Data.Set as Set

solve :: Int -> Int -> [(Int, Int)]
solve n r = [(k, countWays k) | k <- [1..n], countWays k == r]
  where
    countWays k = length $ filter (\(_, ways) -> ways == r) $ generateSolutions k

generateSolutions :: Int -> [(Int, Int)]
generateSolutions k = [(a, b) | a <- [1..isqrt k], b <- [1..a-1], a^2 + 3*a*b + b^2 == k]

isqrt :: Int -> Int
isqrt = floor . sqrt . fromIntegral

f :: Int -> Int -> Int
f n r = length $ Set.toList $ Set.fromList [k | (k, _) <- solve n r]

main :: IO ()
main = print $ f (10^15) 40
