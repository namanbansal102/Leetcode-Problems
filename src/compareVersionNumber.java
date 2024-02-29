public class compareVersionNumber {
    public static void main(String[] args) {
        System.out.println("Compare Version Number LeetCode Problem");
            String version1 = "1.0.1";
            String version2 = "1";
            String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
        int i=0;
        int j=0;
        while (i<v1.length || j<v2.length) {
            int num1=0;
            int num2=0;
            if (j<v2.length) {
                num2=Integer.parseInt(v2[j]);
                
            }
            if (i<v1.length) {
                num1=Integer.parseInt(v1[i]);
                
            }
            if (num1>num2) {
                System.out.println("1");
                break;
            }
            if (num1<num2) {
                System.out.println("-1");
                break;
            }
            i++;
            j++;
        }

    }
}
