public class maxBalancedString {
    public static void main(String[] args) {
        System.out.println("Max Balanced String");
        String str="RLRRRLLRLL";
        int var=0;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (var==0) {
                count++;
            }
            if (ch=='L') {
                var++;
            }
            else{
                var--;
            }
        }
        System.out.println(count);
    }
}
