public class BinarySearch {
    public static void main(String[] args){

        int[] arr = {3,8,12,17,21,29,35};

        int target = 21;

        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                index = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid -1;
            }else{
                high = mid+1;
            }
        }
        System.out.println("Index :"+index);
    }
}
