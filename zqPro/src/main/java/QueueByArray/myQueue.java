package QueueByArray;

public class myQueue {
    private int size;
    private int top;
    private int bottom;
    private int[] myArray;
    public myQueue(int queueSize){
        this.size=queueSize;
        this.top=0;
        this.bottom=0;
        this.myArray=new int[size];
    }
    boolean push(int pushValue){
        if(myArray==null) {
            System.out.println("Queue is null!");
            return false;
        }
        if(top-bottom==size) {
            System.out.println("Queue is full!");
            return false;
        }
        myArray[top] = pushValue;
        top=top+1;
        return true;
    }
    int pop(){
        if(top==bottom){
            System.out.println("Queue is empty!");
            return -1;
        }
        bottom=bottom+1;
        return myArray[bottom-1];    }
    int count(){
        if(myArray==null){
            System.out.println("Queue is null!");
            return 0;
        }
        return top-bottom;
    }
}
