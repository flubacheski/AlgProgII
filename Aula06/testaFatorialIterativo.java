public class testaFatorialIterativo{
   public static void main(String[] args) {
        System.out.println(fatorial(3));
   }
   public static int fatorial( int n ){
        int fat = 1; 
        for( int termo = 1; termo <= n; termo++ ){
            fat = fat * termo;
        }
        return fat;
   }
}