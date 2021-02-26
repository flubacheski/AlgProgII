/*
 * Repita o exercício anterior(intersecao), agora deve ser retornado em uma 
 * String os elementos que estão em A[] mas não estão em B[], ou seja, 
 * a diferença de A – B, por exemplo:
 * A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A – B = {7, 8 }
 * A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A – B= {3, 9, 11}
 */
package testadiferenca;

public class TestaDiferenca {

    public static void main(String[] args) {
       int A[] = { 7, 2, 5, 8, 4}; 
       int B[]= {4, 2, 9, 5};
       System.out.println("resposta da interseccao = "+diferenca(A,B));
    }
    public static  String diferenca( int A[], int B[]){
       String resp = "";
       // fazer a verificacao para todos os elementos de A[]
       for( int i=0; i<A.length;i++){
            // para colocar um elemento de A[] na resposta, precisamos verificar se o elemento
            // nao esta no vetor B[]
            boolean esta = false;
            for( int j=0; j<B.length;j++){
                if( A[i] == B[j] )
                    esta = true;
            }
            // depois que verificamos todos os elementos de B[], caso o elemento A[] não esteja
            // em B[] colocamos o elemento A[] na resposta
            if( esta == false )
                // resp += A[i] + " "; 
                resp = resp + A[i] + " ";
       }
       return resp;
    }
    
}
