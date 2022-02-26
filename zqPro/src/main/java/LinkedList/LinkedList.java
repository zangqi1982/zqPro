package LinkedList;

public class LinkedList {

    public static Node head=null;
    public static void main(String[] Args){
        boolean result;
        appendNode(new Node(1));
        appendNode(new Node(2));
        appendNode(new Node(3));
        appendNode(new Node(4));
        appendNode(new Node(5));
        showLinedList(head);
        result=selectNode(3);
        result=selectNode(0);
        result=deleteNode(4);
        result=deleteNode(0);
        result=insertNode(new Node(33),3);
        result=insertNode(new Node(44),4);
        reversedLinkedList();
        showLinedList(head);
    }
    public static void appendNode(Node targetNode){
        Node currNode=head;
        if(head==null){
            head=targetNode;
            showLinedList(head);
        } else{
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=targetNode;
            showLinedList(head);
        }
    }
    public static boolean insertNode(Node targetNode, int nodeValue) {
        Node currNode=head;
        while(currNode!=null){
            if(currNode.data!=nodeValue){
                currNode=currNode.next;
            }else{
                targetNode.next= currNode.next;
                currNode.next=targetNode;
                showLinedList(head);
                return true;
            }
        }
        System.out.println("Can's find specific value from the Linked List!");
        return false;
    }
    public static boolean selectNode(int nodeValue){
        Node currNode=head;
        int i=0;
        while(currNode!=null){
            i++;
            if(currNode.data!=nodeValue){
                currNode=currNode.next;
            }else{
                System.out.println("The value node is in position: "+i);
                return true;
            }
        }
        System.out.println("Can's find specific value from the Linked List!");
        return false;
    }
    public static boolean deleteNode(int nodeValue){
        Node currNode=head;
        Node prevNode=head;
        while(currNode!=null){
            if(currNode.data!=nodeValue){
                prevNode=currNode;
                currNode=currNode.next;
            }else{
                prevNode.next=currNode.next;
                System.out.println("The value node is deleted successfully");
                return true;
            }
        }
        System.out.println("Can's find specific value from the Linked List!");
        return false;
    }
    public static void reversedLinkedList(){
        Node prevNode=null;
        Node nextNode=null;
        while(head.next!=null){
            nextNode=head.next;
            head.next=prevNode;
            prevNode=head;
            head=nextNode;
        }
        head.next=prevNode;
    }
    public static void showLinedList(Node headNode){
        while(headNode!=null){
            System.out.println("The LinkedList is: "+headNode.data+"->");
            headNode=headNode.next;
        }
    }


}
