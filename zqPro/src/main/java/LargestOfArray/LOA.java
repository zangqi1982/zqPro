package LargestOfArray;

public class LOA {
    static int[] array ={1,2,3,4,5,4,3,2,-1};

    public static void main(String[] Args){
        int result=findLargestValue();
        System.out.println(result);
    }
    public static int findLargestValue(){
        int largestValue=0;
        for(int i=0; i<array.length;i++) {
            if (largestValue < array[i]) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }
}
