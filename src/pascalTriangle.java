import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal Triangle LeetCode Problem");
        int numRows=1;
        numRows++;
        List<List<Integer>> lst=new ArrayList<>();
        int calc=0;
        List<Integer> subList=new ArrayList<>();
        subList.add(1);
        lst.add(subList);
        for (int i = 1; i < numRows; i++) {
            System.out.println("For Loop Running for i="+i);
            List<Integer> subList1=new ArrayList<>();
            subList1.add(1);
           for (int j = 1; j < lst.get(i-1).size(); j++) {
            int elem1=lst.get(i-1).get(j-1);
            int elem2=lst.get(i-1).get(j);
            subList1.add(elem1+elem2);
           }
           subList1.add(1);
            
            lst.add(subList1);
            
        }
        System.out.println(lst.get(numRows-1));
    }
}
