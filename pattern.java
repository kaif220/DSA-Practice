public class pattern {

    public static void Inverted_Half_pyramids(int n){
        
        for (int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    
        Inverted_Half_pyramids(4);
        }
}
