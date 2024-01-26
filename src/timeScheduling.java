import java.util.Scanner;

public class timeScheduling {
    public static void main(String[] args) {
        System.out.println("First Come First Serve Algorithm");
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Process Do You Have?\n");
        int n=sc.nextInt();
        char prArr[]=new char[n];
        int arrivalT[]=new int[n];
        // Execution Time in CPU is called burst Time
        int burstT[]=new int[n];
        // Completion Time 
        int completionT[]=new int[n];
        int turnAroundT[]=new int[n];
        int waitT[]=new int[n];
        prArr[0]='A';
        prArr[1]='B';
        prArr[2]='C';
        arrivalT[0]=0;
        arrivalT[1]=1;
        arrivalT[2]=2;
        burstT[0]=20;
        burstT[1]=2;
        burstT[2]=2;
        System.out.println(Math.p);

    }
}
