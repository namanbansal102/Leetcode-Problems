import java.util.PriorityQueue;
public class priorityQueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student obj){
            return this.rank-obj.rank;
        }
    }
    public static void main(String[] args) {
        System.out.println("Priority Queue Data Structure");
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("naman", 100));
        pq.add(new Student("abc", 200));
        pq.add(new Student("xyz", 300));
        pq.add(new Student("xyz", 30));
        System.out.println(pq);
        while(!pq.isEmpty()) {
            Student sub=pq.poll();
            System.out.println(sub.name+"------>"+sub.rank);
        }

    }
}
