package StackByArray;


public class StackByArray {
    public static boolean result=false;
    //stack max size
    public static int size=4;
    //stack top position
    public static int top=0;
    //Stack data content
    public static int[] myArray;
    public static void main(String[] Args){
        myArray=new int[size];
        result=push(myArray,1);
        result=push(myArray,2);
        result=push(myArray,3);
        result=push(myArray,4);
        System.out.println("The Stack count now is: "+count(myArray));
        result=push(myArray,5);
        System.out.println("The Stack count now is: "+count(myArray));
        System.out.println("Stack pop value is: "+pop(myArray));
        System.out.println("Stack pop value is: "+pop(myArray));
        System.out.println("Stack pop value is: "+pop(myArray));
        System.out.println("Stack pop value is: "+pop(myArray));
        System.out.println("Stack pop value is: "+pop(myArray));
    }
    public static boolean push(int[] myArray, int value){
        if(myArray==null) {
            System.out.println("Stack is null!");
            return false;
        }
        if(top==size) {
            System.out.println("Stack is full!");
            return false;
        }
        myArray[top] = value;
        top=top+1;
        return true;
    }
    public static int pop(int[] myArray){
        if(top==0){
            System.out.println("The Stack is empty!");
            return -1;
        }
        top=top-1;
        return myArray[top];
    }
    public static int count(int[] myArray){
        if(myArray==null){
            System.out.println("The Stack is null!");
            return 0;
        }
        return top;
    }
}
