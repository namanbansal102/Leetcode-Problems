import java.util.Arrays;

public class eliminateMonsters {
    public static void main(String[] args) {
        System.out.println("Eliminate Number of Monsters LeetCode Problem");
        int dist[]={3,2,4};
        int speed[]={5,3,2};
        int timepassed=0;
        int count=0;
        int time[]=new int[dist.length];
        for (int i = 0; i < time.length; i++) {
            time[i]=(int)Math.ceil((float)dist[i]/speed[i]);
            System.out.print(time[i]+".");
        }
        System.out.println();
        Arrays.sort(time);
        for (int i = 0; i < speed.length; i++) {
            System.out.println(time[i]);
            if (time[i]-timepassed<=0) {
                System.out.println("For Loop Breaks");
                break;
            }
            count++;
            timepassed++;

        }
        System.out.println(count);
    }
}
