public class testaFatorialRecursivoOtimizado{
   public static void main(String[] args) {
      System.out.println(fatorial(3));
      
   }
   public static int fatorial( int n ){
    //base da recursão (condição de parada)
    if( n == 0 )
      return 1;
    else
      return n * fatorial(n-1);
   }
}