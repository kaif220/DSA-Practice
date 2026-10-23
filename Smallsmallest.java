public class Smallsmallest {


    public static int minimum(int number[]){
        int smallest =  Integer.MAX_VALUE;  
        for(int i=0 ; i<number.length;i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    static void main(String args[]) {
        int num[] = {2,1,4,3,5,6,1,0};

        System.out.println("the smallest value is :" + minimum(num));
    }
    
}
