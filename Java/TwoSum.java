import java.util.HashMap;
import java.util.TreeMap;

public class TwoSum{
    public static void main(String[] args) {
        int [] arr ={2,3,5,6,7,10,9,14,4,1};
        int target=5;
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        //Objective to find the pair with target sum.
        //the code is not space optimized , need to be optimized
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int diff = target-arr[i];
            if(!hmap.containsKey(diff)){
                hmap.put(arr[i], i);
            }else{
            map.put(arr[i], diff);
            }
        }
        for(Integer key : map.keySet()){
            System.out.println("pair "+key+" and "+map.get(key));
        }
         
    }
}