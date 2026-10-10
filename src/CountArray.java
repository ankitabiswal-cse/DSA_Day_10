public class CountArray {
    public static void main(String[] args){

        int[] arr = {-4,0,7,-2,9,0,3};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > 0){
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println("Positive Count ="+positive);
        System.out.println("Negative Count ="+negative);
        System.out.println("Zero Count ="+zero);
        }
    }

