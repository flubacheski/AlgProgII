package testeaula01;
/**
 *
 * @author fabio
 */
public class TesteAula01 {
    // funcao cliente que chama a solucao
    public static void main(String[] args) {
        int vetor[] = {1,5,6,2,10,17};
        System.out.println("quantidade de pares no vetor="+countEvens(vetor));
    }
    // solucao usando for
    public static int countEvens(int[] nums) {
      int contaPares = 0 ;
      for( int i=0;  i < nums.length; i++){
       if (nums[i] % 2 == 0 ) // testa se eh par 
          contaPares ++;
      }
      return contaPares;
    }
}
