import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findDuplicate {
    public static void main(String[] args) {
        System.out.println("find Duplicate in file System Leetcode Problem");
        String paths[]={"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for (String path : paths) {
            String token[]=path.split(" ");
            String dir=token[0];
            for (int i = 1; i < token.length; i++) {
                int index=token[i].indexOf('(');
                String fileName=token[i].substring(0,index);
                String content=token[i].substring(index+1,token[i].length()-1);
                String totalName=dir+'/'+fileName;
                map.computeIfAbsent(content,l-> new ArrayList<>()).add(totalName);
            }
        }
        System.out.println(map);
        List<List<String>> lst=new ArrayList<>();
        for (Map.Entry<String,ArrayList<String>> entry:map.entrySet()) {
            String key=entry.getKey();
            ArrayList<String> value=entry.getValue();
            lst.add(value);
        }
        System.out.println(lst);

    }
}
