import Data.Ratio
import Data.List (minimumBy, foldl')

piContinuedFraction :: [Integer]
piContinuedFraction = [3, 7, 15, 1, 292, 1, 1, 1, 2, 1, 3, 1, 14, 2, 1, 1, 2, 2]

convergents :: [Integer] -> [Rational]
convergents [] = []
convergents (x:xs) = 1 % x : map (+ (1 % x)) (convergents xs)

bqa :: Rational -> Integer -> Integer -> (Integer, Integer)
bqa x n d = minimumBy (\(a, b) (c, d) -> compare (abs a + abs b) (abs c + abs d)) candidates
  where
    candidates = [(a, b) | a <- [-n..n], b <- [-n..n], a^2 - d * b^2 == round x]

calculateI_d :: (Integer, Integer) -> Integer
calculateI_d (a, _) = abs a

main :: IO ()
main = print $ sum [calculateI_d (bqa (fromRational pi') (10^13) d) | d <- [2..99], not (isSquare d)]
  where
    pi' = head (convergents piContinuedFraction)
    isSquare x = floor (sqrt (fromIntegral x)) ^ 2 == x