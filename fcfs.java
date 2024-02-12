import java.util.Arrays;

public class fcfs {
    public static void main(String[] args) {
        System.out.println("First Come First Serve Algorithm in Java");
        int n=4;
        int pid[]={1,2,3,4};
        int at[]={2,1,0,4};
        int bt[]={6,8,3,4};
        int ct[]=new int[n];
        int tat[]=new int[n];
        Arrays.sort(at);
        // After Sorting at becomes
        // at[]={0,1,2,4}
        for (int i = 0; i < n; i++) {
            if (i==0) {
                ct[i]=at[i]+bt[i];
            }
        }
        
    }
}
