class Solution {
    public int balancedStringSplit(String s) {               
        int lcounter = 0;
        int rcounter = 0;
        int balancedCounter = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'L') {
                lcounter++;
            } else {
                rcounter++;
            }
            if (lcounter == rcounter)
                balancedCounter++;                        
        }
        return balancedCounter;
    }
}