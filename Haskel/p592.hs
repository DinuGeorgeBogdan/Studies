import Data.Char (intToDigit)
import Numeric (showHex)

lastTwelveHexDigits :: Integer -> String
lastTwelveHexDigits n = reverse . take 12 . reverse . showHex (factorial n) $ ""

factorial :: Integer -> Integer
factorial n = product [1..n]

main :: IO ()
main = putStrLn $ lastTwelveHexDigits 20
