public class Solution {
    public static void main(String []args) {
        String str = "race a car";
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
public static boolean isPalindrome(String s){
    String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return palindromeChecker(st, 0, st.length()-1);
}
public static boolean palindromeChecker(String s, int low, int high) {
    if (low >= high) {
        return true;
    }
    if (s.charAt(low) != s.charAt(high)) {
        return false;
    }
    return palindromeChecker(s, low + 1, high - 1);
}
    }
