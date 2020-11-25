class Solution {
    public String freqAlphabets(String str) {
        StringBuilder s = new StringBuilder(str); 
        HashMap<String, String> map = new HashMap<String, String>();
        for (int j = 1; j < 10; j++) {
            map.put("" + j, String.valueOf((char)(j + 96)));
        }
        for (int i = 10; i < 27;i ++) {
            map.put("" + i + "#", String.valueOf((char)(i+96)));             
        }
    
        // Converts to j-z
        for (int i = 10; i < 27;i ++) {            
            s = new StringBuilder(s.toString().replaceAll("" + i + "#", map.get("" + i + "#")));
        }
        // Converts to a-i
        for (int j = 0; j < 10; j++) {            
            s = new StringBuilder(s.toString().replaceAll(String.valueOf(j), map.get("" + j)));
        }        
        return s.toString();
    }
    
       
}