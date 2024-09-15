birthdayProbability :: Integer -> Integer -> Double
birthdayProbability days range =
  1 - product [(fromIntegral (days - i) - fromIntegral range + 1) / fromIntegral days | i <- [0..2]]

expectedPeople :: Integer -> Integer -> Double
expectedPeople days range =
  sum [fromIntegral i * birthdayProbability days range ^ (i - 1) | i <- [1..]] + 1

main :: IO ()
main = do
  let result = expectedPeople 365 7
  putStrLn $ "The answer for Earth is: " ++ show result
