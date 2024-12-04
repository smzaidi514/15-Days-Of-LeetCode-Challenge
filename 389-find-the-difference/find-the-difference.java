class Solution {
    public char findTheDifference(String s, String t) {
        int charSums = 0;
        int charSumt = 0;

        for(char c: s.toCharArray()){
            charSums += c;
        }

        for(char c: t.toCharArray()){
            charSumt += c;
        }
        return (char) (charSumt - charSums);
    }
}