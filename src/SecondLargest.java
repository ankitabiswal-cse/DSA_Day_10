public class SecondLargest {
    public static void main(String[] args){

        int[] arr = {12,45,7,45,32,28};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i]  > second) {
                second = arr[i];
                
            }
        }
        if(second == Integer.MIN_VALUE) {
            System.out.println("Second Largest Does Not Exist");
        }else{
            System.out.println("Second Largest = "+second);

        }
    }
}
