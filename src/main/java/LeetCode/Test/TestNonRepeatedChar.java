package LeetCode.Test;

import LeetCode.NonRepeatedChar;
import org.junit.Test;

import static org.junit.Assert.*;

/* Test class for non repeated character */
public class TestNonRepeatedChar {

    @Test
    public void testNonRepeatedChar() {
        assertEquals('r', NonRepeatedChar.nonRepeatedChar("teeter"));
        assertEquals('b', NonRepeatedChar.nonRepeatedChar("abcdefghija"));
        assertEquals('h', NonRepeatedChar.nonRepeatedChar("hello"));
        assertEquals('J', NonRepeatedChar.nonRepeatedChar("Java"));
        assertEquals('i', NonRepeatedChar.nonRepeatedChar("simplest"));
    }

}
