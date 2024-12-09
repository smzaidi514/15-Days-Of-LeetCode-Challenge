class Solution {
    public int compress(char[] chars) {
        int wIndex = 0;
        int rIndex = 0;
        while(rIndex < chars.length){
            char currentChar = chars[rIndex];
            int count = 0;

            while(rIndex < chars.length && chars[rIndex] == currentChar){
                rIndex++;
                count++;
            }
            chars[wIndex++] = currentChar;

            if(count > 1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[wIndex++] = c;
                }
            }
        }
        return wIndex;
    }
}