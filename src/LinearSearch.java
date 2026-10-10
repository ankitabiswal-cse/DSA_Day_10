public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {23,45,67,89,34,56,78,90,80,60};

        int target = 78;
        int index = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        System.out.println("Index ="+index);
    }
}
