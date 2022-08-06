package com.panithan.sptmk.utils

object KYCUtils {
  // Write a function that takes an Integer and returns it as a string with the correct ordinal indicator suffix (in English). Examples: 1 => 1st, 2 => 2nd.
  def getOrdinalNumberStr(number: Int): String = {
    require(number > 0, "Ordinal number must be positive")
    // https://en.wikipedia.org/wiki/Ordinal_indicator#English
    val isExceptionalNumber = List(11, 12, 13).contains(number % 100)
    val lastDigit = number % 10
    val suffix =
      (lastDigit, isExceptionalNumber) match {
        case (1, false) => "st"
        case (2, false) => "nd"
        case (3, false) => "rd"
        case _ => "th"
      }
    s"$number$suffix"
  }

  // Write a function that takes two dates (date_from, date_to, in dd-mm-yyyy format) and returns the number of Sundays in that range. Example: (‘01-05-2021’, ‘30-05-2021’) => 5.
  def getSundayCountFromDateRange(from: String, to: String): Int = ???

  // Mask personal information: create a function that takes a String as input and returns it partly obfuscated. The function only recognizes emails and phone numbers, any other String that doesn’t match these types results in an error
  // Emails: emails need to be in a valid email format. To obfuscate it, it should be converted to lowercase and all characters in the local-part between the first and last should be replaced by 5 asterisks (*). Example: local-part@domain-name.com => l*****t@domain-name.com.
  // Phone numbers: a phone number consists of at least 9 digits (0-9) and may contain these two characters (‘ ‘, ‘+’) where ‘+’ is only accepted when is the first character. To obfuscate it, spaces (‘ ‘) are converted to dashes (‘-’), any digit is converted to an asterisk (‘*’) except for the last 4, which remain unchanged and the plus sign (‘+’) also remains unchanged (if present). Example: +44 123 456 789 => +**-***-**6-789.
  def getMarkedPersonalInformation(personalInformation: String): String = ???
}
