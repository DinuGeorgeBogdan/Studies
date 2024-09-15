import Data.List (transpose)

isIdempotent :: [[Integer]] -> Bool
isIdempotent m = matrixMult m m == m

matrixMult:: Num a=> [[a]]->[[a]]->[[a]]
matrixMult a b = [[sum $ zipWith (*) row col | col <- (transpose b)] | row <- a]

generateMatrices :: Integer -> [[Integer]]
generateMatrices n = [[a,b,c] | a <- [-n..n], b <- [-n..n], c <- [-n..n]] ++
                     [[d,e,f] | d <- [-n..n], e <- [-n..n], f <- [-n..n]] ++
                     [[g,h,i] | g <- [-n..n], h <- [-n..n], i <- [-n..n]]

countIdempotentMatrices :: Integer -> Int
countIdempotentMatrices n = length $ filter isIdempotent $ generateMatrices n

main :: IO ()
main = do
    let result = countIdempotentMatrices 200
    putStrLn $ "C(200) = " ++ show result