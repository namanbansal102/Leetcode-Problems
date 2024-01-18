public class repeatedStringM {
    public static int repeatedStringMatch(String a, String b) {
        int count=1;
        String copya=a;
        int repeat=b.length()/a.length();
        for(int i=0;i<repeat+2;i++){
            if(a.contains(b)){
                return count;
            }
            else{
                a+=copya;
                count++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Repeated String Match Problem");
        String a="abcd";
        String b="cdabcdab";
        int s=repeatedStringMatch(a,b);
        System.out.println(s);
        
        
    }
}
