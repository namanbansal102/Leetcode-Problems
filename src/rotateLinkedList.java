public class rotateLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public  void insert(int data){
        if (head==null) {
            head=new Node(data);
            return;
        }
        Node nextNode=head;
        while (nextNode.next!=null) {
            nextNode=nextNode.next;
        }
        nextNode.next=new Node(data);
        

    }
    public void printList(){
        if (head==null) {
            System.out.println("List Is Empty");
        }
        Node nextNode=head;
        while (nextNode!=null) {
            System.out.print(nextNode.data+"->");
            nextNode=nextNode.next;
            
        }
        System.out.println("Null");
    }
    public void rotateList(int k){
        Node curr=head;
        int length=0;
        while (curr.next!=null) {
            length++;
            curr=curr.next;
        }
        length++;
        int get=length-k%length-1;
        curr.next=head;
        curr=head;
        Node getter=null;
        while (get>=1) {
            curr=curr.next;
            get--;
        }
        head=curr.next;
        curr.next=null;
        System.out.println("Current Data is"+curr.data);

    }
     public static void main(String[] args) {
        System.out.println("Rotate Linked List Porblem");
        rotateLinkedList l1=new rotateLinkedList();
        l1.insert(0);
        l1.insert(1);
        l1.insert(2);
        l1.rotateList( 2000000000);
        l1.printList();
        
        
    }
}
