/*
Implementacao do algoritmo bolha
*/
class testaMetodobolha {
    public static int passos=0;

    public static void main(String[] args) {
       
      int A[] = {6, 8, 3, 7, 1, 4, 2, 5}; 
      bolha(A);
      printaVetor(A);


      System.out.println("Nr Passos:"+passos);
      // passos = (N-1)+(N-2)+(N-3)...2
      // passos = 7+6+5+4+3+2+1=28 (Soma e PA)
      // passos = ((N-1)+1)*(N-1)/2 = N*(N-1)/2 = (N^2-N)/2=28
      // N = 100 passos = (100^2 - 100)/2 = 4950
    }
    public static void bolha(int V[]){
      for(int k = 1; k < V.length; k++){
        for( int i = 0; i < V.length - k; i++){
          passos++;
          if(V[i]>V[i+1]){
            int temp = V[i];
            V[i] = V[i+1];
            V[i+1] = temp;
          }
        }
      }
    }
    public static void printaVetor(int V[]){
      System.out.print("Vetor:");
      for( int i=0;i<V.length; i++)
        System.out.print(V[i]+" ");
        
      System.out.println("\nFim impressao");
    }

}