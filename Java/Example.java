import java.util.ArrayList;
import java.util.Arrays;

//Str s1 ="Rahul"
// Str s2 = new String("Rahul");
class Example{
//0,1,2,0,1,2,01,2,0,1,2
//0,1,2,0,1,2,0,1,2,0,1,2
    public static void main(String [] args){
        //ArrayList<Integer> list =Arrays.asList(0,1,2,0,1,2,0,1,2,0,1,2);
        String s1="Rahul";
        String s2 =new String("Rahul");
        String str = "abc123def345ghi213";

    //System.out.println(s1.hashCode()==s2.hashCode());
Integer max=-1;
Integer number=0; 
    for(int i=0;i<str.length();i++ ){

        if(Character.isDigit(str.charAt(i))){
            number = number*10+str.charAt(i)-'0';
        }
        else{
            if(max<number){
                max=number;
            }
            number=0;
        }
    }

    System.out.println(max);
    //List<Integer> list = list.stream().map(i=>i).reduce(i1,i2) -> i1<i2).collect(collectors.toList());
    }
}



