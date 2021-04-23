/*
Escreva o algoritmo que recebe um vetor A de tamanho n contendo inteiros e encontra um par de elementos distintos a e b do vetor que fazem com que a diferença absoluta a-b seja a maior possível. A função deve resolver o problema em no máximo n passos (tamanho do vetor) e ao final retornar a maior diferença entre os números a e b.

*/
public class testaBuscaLinear {
	public static int passos=0;

    public static void main(String[] args) {
       
	  int A[] = {65,16, 91, 45, 30, 29, 17, 31, 12, 90, 89}; 
      System.out.println("Diferenca Absoluta:"+buscaDiferenca(A));
      System.out.println("Nr Passos:"+passos);
    }
    public static int buscaDiferenca(int V[]){

      // 1) achar o maior e menor
      int maior=V[0];
      int menor=V[0];
      for( int i=1; i < V.length; i++){
        passos++;
        if( V[i] > maior)
          maior = V[i];
        if( V[i] < menor )
          menor = V[i];
      }
      return maior-menor;
    }
}
}

