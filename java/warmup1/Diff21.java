package java.warmup1;

/**
 * Warmup-1 > diff21 
 * 
 * Given an int n, return the absolute difference between n and 21, except return double the 
 * absolute difference if n is over 21.
 * 
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */

public class Diff21 {
    public int diff21(int n) {
        return n > 21 ? (n - 21) * 2 : 21 - n;
      }
}
