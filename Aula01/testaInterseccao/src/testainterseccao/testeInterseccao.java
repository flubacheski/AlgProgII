
package testainterseccao;

/**
 *
 * @author fabio
 */
public class testeInterseccao {
   public static void main(String[] args) {
       int A[] = { 7, 2, 5, 8, 4}; 
       int B[]= {4, 2, 9, 5};
       System.out.println("resposta da interseccao = "+interseccao(A,B));
   }
   
   public static  String interseccao( int A[], int B[]){
       String resp = "";
       // 1 - Para cada elemento do vetor A[] – andar nas posições do vetor A[] (for ou while)
       for( int i = 0; i < A.length; i++ ){
           // 2 - olhar se o elemento de A[] consta no vetor B[], 
           // para um elemento de A[] verificar todos os elementos de B[]
           for( int j=0; j < B.length; j++){
               // 3 - se constar o elemento de A[] no vetor B[] 
               // fará parte da resposta.
               if( A[i] == B[j])
                 resp = resp + " "+A[i];  
           }
       }
       
       return resp;
   }
   
}
