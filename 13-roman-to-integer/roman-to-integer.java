class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            int currentValue = getRomanValue(s.charAt(i));

            if(currentValue < prevValue){
                total -= currentValue;
            }else{
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
    private static int getRomanValue(char roman){
        switch(roman){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}