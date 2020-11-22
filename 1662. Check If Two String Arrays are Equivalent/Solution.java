class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String concatw1 = "";
        String concatw2 = "";
        for (String word : word1)
            concatw1 += word;
        for (String word: word2)
            concatw2 += word;
        if (concatw2.equals(concatw1))
            return true;
        else
            return false;
    }
}