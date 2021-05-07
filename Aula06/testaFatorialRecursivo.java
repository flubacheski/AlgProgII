public class testaFatorialRecursivo{
   public static void main(String[] args) {
      System.out.println(fatorial(3));
      
   }
   public static int fatorial( int n ){
      // se chegou instância conhecida do problema (base da recursão) então
      if( n == 0 )
         return 1; // retorne o valor que sabemos calcular de forma direta.
      else{
         int n2 = n - 1;// Reduza a entrada do problema (parametros).
         int n_1 = fatorial(n2); //Faça a chamada da função novamente (chamada recursiva).
	     int resp = n*n_1; // Use o retorno da função para calcular o resultado da solução completa
         return resp;
      }
  
   }
}