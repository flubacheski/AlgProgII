public class testaFatorialRecursivo{
   public static void main(String[] args) {
      System.out.println(fatorial(3));
      
   }
   public static int fatorial( int n ){
      // se chegou inst�ncia conhecida do problema (base da recurs�o) ent�o
      if( n == 0 )
         return 1; // retorne o valor que sabemos calcular de forma direta.
      else{
         int n2 = n - 1;// Reduza a entrada do problema (parametros).
         int n_1 = fatorial(n2); //Fa�a a chamada da fun��o novamente (chamada recursiva).
	     int resp = n*n_1; // Use o retorno da fun��o para calcular o resultado da solu��o completa
         return resp;
      }
  
   }
}