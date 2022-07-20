import java.util.Arrays;
import java.util.Collections;
class Sample {
    public static int coinChange(Integer[] coins, int amount) {
        Arrays.sort(coins, Collections.reverseOrder());
        //int amount=0;
        //int i=0;
        int count=0;
        if(coins.length==1 && amount-coins[0]==0)
        return 0;
        for(int i=0;i<coins.length;i++){
            //count++;
            amount=amount-coins[i];
            if(amount>=0){
                count++;
                 i--;
            //continue;
            
               //System.out.println("increment"); 
            }
            else{
                //i++;
                //count++;
                //System.out.println("else");
                //count++; 
            }
            //count++;         
        }
        return count;
    }

    public static void main(String[] args){
Integer arr[] ={5,2,1};
System.out.println(Sample.coinChange(arr, 11));
    }
}