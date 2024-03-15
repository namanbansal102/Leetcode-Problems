import java.util.ArrayList;

public class heap {
    static void add(ArrayList<Integer> lst,int elem){
        // Implementing The Code For Min Heap
        lst.add(elem);
        int x=lst.size()-1;
        int parent=(x-1)/2;
        while (lst.get(x)<lst.get(parent)) {
            int temp=lst.get(x);
            lst.set(x, lst.get(parent));
            lst.set(parent, temp);
            x=parent;
            parent=(x-1)/2;
        }
    }
    public int peek(ArrayList<Integer> lst){
        return lst.get(0);
    }
    public static void heapify(ArrayList<Integer> lst,int i){
        // Initializing The Left Pointer and Right Pointer
        int x=lst.size()-1;
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;
        // Condition For Min Heap
        if (left<=x && lst.get(left)<lst.get(minIdx)) {
            minIdx=left;
        }
        if (right<=x && lst.get(right)<lst.get(minIdx)) {
            minIdx=right;
        }
        if (minIdx!=i) {
            int temp=lst.get(i);
            lst.set(i, lst.get(minIdx));
            lst.set(minIdx, temp);
            heapify(lst, minIdx);
        }
    }
    public static int remove(ArrayList<Integer> lst){
        int data=lst.get(0);
        // Remove The Last Element in ArrayList
        // Swapping The First Element and Last Element In The Tree
        int x=lst.size()-1;
        int temp=lst.get(0);
        lst.set(0, lst.get(x));
        lst.set(x, temp);
        lst.remove(x);
        heapify(lst, 0);
        return data;

    }
    public static void main(String[] args) {
        System.out.println("Heap Data Structure");
        ArrayList<Integer> lst=new ArrayList<>();
        // Adding Element in the Heap
        add(lst, 2);
        add(lst, 3);
        add(lst, 4);
        add(lst, 5);
        add(lst, 10);
        add(lst, 6);
        int k=remove(lst);
        System.out.println(k); 
        System.out.println(lst);
        

    }
}
