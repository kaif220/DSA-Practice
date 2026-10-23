public class SubArray {

    public static void printsub_array(int numbers[]){
        for (int i = 0; i<numbers.length;i++){
            for (int j = i; j<numbers.length;j++){
                
                for (int k = i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("");
            }           
        }
    }
    public static void main(String []agrs){
        int numbers[] = {1,2,3,4,5};

        printsub_array(numbers);

    }
}
