public class MaxSubArray {
    public static void max_sub_array(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0 ;i<numbers.length;i++){
            for (int j = i; j<numbers.length;j++){
                currsum = 0;
                for (int k = i; k<=j; k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Sum is: " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4};
        max_sub_array(numbers);
    }
}
