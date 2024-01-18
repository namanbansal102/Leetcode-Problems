import java.util.Arrays;

public class paintersProblem {
    public static boolean isPossibleSol(int arr[],int m,int a){
        int pbc=0;
        int painters=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>m) {
                return false;
            }
            if (arr[i]+pbc<=m) {
                pbc=pbc+arr[i];
            }
            else{
                painters++;
                if (painters>a) {
                    return false;
                }
                pbc=arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Painters Partition Problem");
        int arr[]={3,2,2,4,1,4};
        int low=0;
        int high=0;
        int res=-1;
        int a=3;
        for (int i = 0; i < arr.length; i++) {
            high+=arr[i];
        }
        System.out.println(high);
        while (low<=high) {
            int mid=(low+high)/2;
            if (isPossibleSol(arr, mid, a)) {
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(res);

    }
}
