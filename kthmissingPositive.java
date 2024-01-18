public class kthmissingPositive {
    public static void main(String[] args) {
        System.out.println("Kth Missing Positive");
        int arr[]={1,2};
        int k=1;
        int n=arr.length;
        int res[]=new int[10001];
        for (int val : arr) {
            res[val]++;
        }
        for (int i = 1; i <res.length; i++) {
            System.out.print(res[i]+" ");
        }
        int count=0;
        for (int i = 1; i <=res.length; i++) {
            if (res[i]==0) {
                count++;
            }
            if (count==k) {
                System.out.println("Value of i is:"+i);
                break;
            }

        }

        }
}
