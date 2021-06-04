/*
A intercalação é o processo utilizado para construir um vetor ordenado, de tamanho n+m, a partir de dois vetores já ordenados de tamanhos n e m.
*/
class testaIntercalacao {
    public static int passos=0;

    public static void main(String[] args) {
       
      int A[] = {3,5,11,13,17}; 
      int B[] = {1,4,7,14,15,16};
      int C[] = intercalacao(A,B);
      printaVetor(C);


      System.out.println("Nr Passos:"+passos);
      // passos = (N-1)+(N-2)+(N-3)...2
      // passos = 7+6+5+4+3+2+1=28 (Soma e PA)
      // passos = ((N-1)+1)*(N-1)/2 = N*(N-1)/2 = (N^2-N)/2=28
      // N = 100 passos = (100^2 - 100)/2 = 4950
    }
    public static int [] intercalacao(int A[], int B[]){
        int n= A.length;
        int m= B.length;
        int C[] = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            passos++;
            if( A[i] < B[j])
                C[k++]=A[i++];
            else 
                C[k++] = B[j++];
        }
        while( i<n ){ // sobrou elementos no vetor A[]
           passos++;
           C[k++]=A[i++];
        }
        while( j<m ){ // sobrou elementos no vetor B[]
           passos++;
           C[k++] = B[j++];
        }
        
        
        return C;

    }
    public static void printaVetor(int V[]){
      System.out.print("Vetor:");
      for( int i=0;i<V.length; i++)
        System.out.print(V[i]+" ");
        
      System.out.println("\nFim impressao");
    }
}