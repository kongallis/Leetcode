class Solution {
    public int maximum69Number (int num) {
        int thous = num / 1000;
        int hunds = (num % 1000) / 100;
        int decs = ((num % 1000) % 100) / 10;
        int units = ((num % 1000) % 100) % 10;
        if (thous == 6) 
            thous = 9;            
         else if (hunds == 6) 
            hunds = 9;
         else if (decs == 6) 
            decs = 9;
         else if (units == 6) 
            units = 9;
        
                
        return reconstructMaxNumber(thous, hunds, decs, units);
        
    }
    
    public int reconstructMaxNumber(int t, int h, int d, int u) {
        return (t * 1000) + (h * 100) + (d * 10) + u;
    }
}