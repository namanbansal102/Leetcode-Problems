import java.util.ArrayList;
import java.util.Collections;

public class jobSequencingProb {
    static class job{
        int deadline;
        int profit;
        int jobId;
        job(int d,int p,int j){
            this.deadline=d;
            this.profit=p;
            this.jobId=j;
        }
    }
    public static void main(String[] args) {
        System.out.println("Job Sequencing LeetCode Problem");
        int jobArr[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> lst=new ArrayList<>();
        for (int i = 0; i < jobArr.length; i++) {
            lst.add(new job(jobArr[i][0], jobArr[i][1], i));
        }
        Collections.sort(lst,(obj1,obj2)->obj2.profit-obj1.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
       
        for (int i = 0; i < jobArr.length; i++) {
            job curr=lst.get(i);
            if (curr.deadline>time) {
                seq.add(curr.jobId);
                time++;
                
            }
        }
System.out.println(seq);
    }
}
