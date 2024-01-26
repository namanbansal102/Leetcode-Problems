public class sqrtBST {
    public static void main(String[] args) {
        System.out.println("Valid Square Root Problem");
        int num=2147483647;
        int st=0;
        int end=num;
        while (st<=end) {
            int mid=(st+end)/2;
            int val=mid*mid;
            if (val==num) {
                System.out.println("Valid Sqaure Root of val="+val);
                break;
            }
            if (val<num) {
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
