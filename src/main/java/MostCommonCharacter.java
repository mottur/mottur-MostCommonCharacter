import java.util.HashMap;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char mostCommon = str.charAt(0);
        int maxOccurrences = 1;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = hm.get(c);
            if(val != null) {
                hm.replace(c, val += 1);
                if(val + 1 > maxOccurrences) {
                    maxOccurrences = val + 1;
                    mostCommon = c;
                }
            } else {
                hm.put(c, 1);
            }
        }
        return mostCommon;
    }
}
