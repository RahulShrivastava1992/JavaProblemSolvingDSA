import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collector;
import java.util.HashSet;

class FindingDigits{
public static void main(String[] args) {
    List<Integer> intLst=new ArrayList<Integer>(); 
    intLst.add(100);
    intLst.add(200);
    intLst.add(300);
    intLst.add(400);
    List<String> strLst=new ArrayList<String>();
        strLst.add("100");
        strLst.add("200");
        strLst.add("Mrinalini");
        strLst.add("ABC");
        Set<Integer> intSet=new HashSet<Integer>(intLst);
        List<String> data = strLst.stream().dropWhile(d -> (d.matches("-?\\d+(.\\d+)?"))).collect(Collectors.toList());;
//System.out.println(data);

}

}