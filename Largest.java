
public class Largest{

    public static int  Largests(int number[])

    {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++)
        {

            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 4, 5, 3};

        System.err.println("the largest value is :" + Largests(numbers));
    }

}