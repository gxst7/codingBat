package java.warmup1;

/**
 * Warmup-1 > startHi 
 * 
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * 
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 */

public class StartHi {
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
