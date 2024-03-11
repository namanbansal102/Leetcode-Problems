import java.util.ArrayList;
import java.util.List;

public class splitStringBySep {
    public static void main(String[] args) {
        System.out.println("Split String By Separator LeetCode Problem");
        String words[]={"stars.bars.$"};
        char separator='.';
        ArrayList<String> lst=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String curr=words[i];
            String s="";
            for (int j = 0; j < curr.length(); j++) {
                char ch=curr.charAt(j);
                if (j==curr.length()-1 && ch!=separator) {
                    if (s.length()!=0) {
                        
                        lst.add(s+ch);
                    }
                }
                if (ch==separator) {
                    if (s.length()!=0) {
                        
                        lst.add(s);
                    }
                    s="";
                }else{

                    s=s+ch;
                }
            }
        }
        System.out.println(lst);
        
    }
}
