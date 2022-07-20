import java.util.HashMap;

class Example{

    public static void main(String [] args){
       // arr1 ={3,2,1,6}
       //arr2 ={6,5,2,9}
       int arr1[] = {3,2,1,6,2};
       int arr2[] ={6,5,2,9,2};
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<arr1.length;i++){
            if(!hm.containsKey(arr1[i])){
                hm.put(arr1[i], 1);
            }else{
                Integer val=hm.get(arr1[i]);
                hm.put(arr1[i], val+1);
            }
        }

        for(int j=0;j<arr2.length;j++){
            if(hm.containsKey(arr2[j])){
            if(hm.get(arr2[j])>1){
                System.out.println(arr2[j]);
                Integer val1=hm.get(arr2[j]);
                hm.put(arr2[j],val1-1);
            }else if((hm.get(arr2[j])==1)){
                System.out.println(arr2[j]);
            }
        }
        }




    }
}



