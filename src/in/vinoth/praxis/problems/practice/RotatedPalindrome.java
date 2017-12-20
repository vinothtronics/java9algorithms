package in.vinoth.praxis.problems.practice;

import java.util.stream.IntStream;

/**
 * This problem is defined in programmingpraxis.com
 * I am using here to practice
 */
public class RotatedPalindrome {

    public boolean isRotatablePalindrome(String input) {
        return input != null
                && IntStream.range(0, input.length())
                    .anyMatch(i -> isPalindrome(
                            new StringBuilder(input.substring(i, input.length()))
                                    .append(input.substring(0, i))
                                    .toString()
                    ));
    }

    private boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }

    public static void main(String[] args) {
        String one = "abcdedcba";
        RotatedPalindrome tester = new RotatedPalindrome();
        System.out.println(tester.isRotatablePalindrome(one));
        String two = "dedcbaabc";
        System.out.println(tester.isRotatablePalindrome(two));
    }
}
