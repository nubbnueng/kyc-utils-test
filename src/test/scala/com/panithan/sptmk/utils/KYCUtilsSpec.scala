package com.panithan.sptmk.utils

import org.scalatest.wordspec.AnyWordSpec

class KYCUtilsSpec extends AnyWordSpec {
  "getOrdinalNumberStr method" should {
    "return 1st when input is 1" in {
      val expected = "1st"
      val actual = KYCUtils.getOrdinalNumberStr(1)
      assert(expected == actual)
    }
    "return 2nd when input is 2" in {
      val expected = "2nd"
      val actual = KYCUtils.getOrdinalNumberStr(2)
      assert(expected == actual)
    }
    "return 3nd when input is 3" in {
      val expected = "3rd"
      val actual = KYCUtils.getOrdinalNumberStr(3)
      assert(expected == actual)
    }
    "return 4th when input is 4" in {
      val expected = "4th"
      val actual = KYCUtils.getOrdinalNumberStr(4)
      assert(expected == actual)
    }
    "return 88th when input is 88" in {
      val expected = "88th"
      val actual = KYCUtils.getOrdinalNumberStr(88)
      assert(expected == actual)
    }
    "return 111th when input is 111" in {
      val expected = "111th"
      val actual = KYCUtils.getOrdinalNumberStr(111)
      assert(expected == actual)
    }
    "throws IllegalArgumentException when input < 1" in {
      assertThrows[IllegalArgumentException](KYCUtils.getOrdinalNumberStr(0))
      assertThrows[IllegalArgumentException](KYCUtils.getOrdinalNumberStr(-1))
    }
  }

  "getSundayCountFromDateRange method" should {
    "return 1 when inputs are 01-08-2022 and 31-08-2022" in {
      val expected = 4
      val actual = KYCUtils.getSundayCountFromDateRange("01-08-2022", "31-08-2022")
      assert(expected == actual)
    }
    "return 0 when inputs are 01-08-2022 and 06-08-2022" in {
      val expected = 0
      val actual = KYCUtils.getSundayCountFromDateRange("01-08-2022", "06-08-2022")
      assert(expected == actual)
    }
  }

  "getMarkedPersonalInformation method" should {
    "return l*****t@domain-name.com when input is local-part@domain-name.com" in {
      val expected = "l*****t@domain-name.com"
      val actual = KYCUtils.getMarkedPersonalInformation("local-part@domain-name.com")
      assert(expected == actual)
    }
    "return +44 123 456 789 when input is +**-***-**6-789" in {
      val expected = "+44 123 456 789"
      val actual = KYCUtils.getMarkedPersonalInformation("+**-***-**6-789")
      assert(expected == actual)
    }
  }
}
