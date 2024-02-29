public class countingNumber {
    public static void main(String[] args) {
        System.out.println("Counting Bits LeetCode Problem");
        int n=5;
        int bitArr[]=new int[n+1];
        bitArr[0]=0;
        bitArr[1]=1;
        System.out.println(Integer.toBinaryString(n));
        for (int i = 2; i <=n; i++) {
            if (n%!=0) {
                bitArr[i]=bitArr[i/2]+1;
            }
            else{
                bitArr[i]=bitArr[i/2];
            }
        }
    }
}
