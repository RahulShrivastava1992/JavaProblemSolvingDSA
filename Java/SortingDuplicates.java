
import java.util.Arrays;
import java.util.HashMap;

public class SortingDuplicates {
    public static void main(String[] args) {
        int array[]={1,4,4,8,6,7,9,8,8};
        Arrays.sort(array);
        //ArrayList<Integer> list= new ArrayList<>();
        int count=0;
        int hitcount=0;
        HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();

        for(int i=0;i<array.length;i++){
            if(!hmap.containsKey(array[i])){
                hmap.put(array[i], 1);
            }else{
                Integer val = hmap.get(array[i]);
                hmap.put(array[i],val+1);
                hitcount++;
            }
        }
        if(hitcount==0){
        int arr[]= new int[1];
        arr[0]=-1;
        System.out.println(arr[0]);
        }
        int i=0;
        for(Integer key: hmap.keySet()){
            if(hmap.get(key)>=2)
           count++ ;
        }
       // System.out.println(count);
        int arr[]=new int[count];
        
        for(Integer key: hmap.keySet()){
            if(hmap.get(key)>=2){
           arr[i]=key ;
           i++;
            }
        }
        for (int j=0;j<arr.length;j++) {
            System.out.println(arr[j]);
        }    
    }
}
