package LinkedList;

public class Node {
    
    private int data;
    private Node next;
    
    public Node() {}
    
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    
    public int getData() { return data; }
    public Node getNext() { return next; }
    
    public int setData(int data) { this.data = data; }
    public Node setNext(Node next) { this.next = next; }
    
    public static void main(String [] args) {
        Node n = new Node();
        System.out.println(n.getData()); // 0
        System.out.println(n.getNext()); // null  
//         n.setNext(...)
    }
}
