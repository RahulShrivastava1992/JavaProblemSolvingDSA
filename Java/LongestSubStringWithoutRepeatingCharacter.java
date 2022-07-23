import java.util.HashMap;
import java.util.HashSet;

class LongestSubStringWithoutRepeatingChatracter{
public static void main(String[] args) {
    String str ="gbbcdeeffab";
    HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
    int start=0;
    int maxlength=Integer.MIN_VALUE;
    
    for(int end=0;end<str.length();end++){
        if(hmap.containsKey(str.charAt(end))){
            start=Math.max(start, hmap.get(str.charAt(end))+1);
        }
        hmap.put(str.charAt(end), end);
        maxlength=Math.max(maxlength, end-start+1);
    }
    System.out.println(maxlength);

}

}