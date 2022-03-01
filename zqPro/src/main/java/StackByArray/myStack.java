package StackByArray;

public class myStack {
    private int size;
    private int top;
    private int[] myArray;
    public myStack(int stackSize){
        this.size=stackSize;
        this.top=0;
        this.myArray=new int[size];
    }
    boolean push(int pushValue){
        if(myArray==null) {
            System.out.println("Stack is null!");
            return false;
        }
        if(top==size) {
            System.out.println("Stack is full!");
            return false;
        }
        myArray[top] = pushValue;
        top=top+1;
        return true;
    }
    int pop(){
        if(top==0){
            System.out.println("The Stack is empty!");
            return -1;
        }
        top=top-1;
        return myArray[top];    }
    int count(){
        if(myArray==null){
            System.out.println("The Stack is null!");
            return 0;
        }
        return top;
    }
}
