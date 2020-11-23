class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morsAl = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };

        
        // Create a set 
        Set<String> set = new HashSet<String>(); 
        String morsWord = "";
        for (String word : words) {
            
            for (int i = 0; i < word.length(); i++) {
                int letter = (int)word.charAt(i) - 97;               
                morsWord += morsAl[letter];
            }
            set.add(morsWord);
            morsWord = "";
        }

        
        return set.size();
    }
    
}