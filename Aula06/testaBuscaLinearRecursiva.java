public class testaBuscaLinearRecursiva {
    public static int passos=0;
    public static void main(String[] args) {
      // tamanho do vetor N=8
      int A[] = {5,3,7,4,2,8,4,6}; 
      String vetor[]={"aa", "bb", "c", "cc", "d", "ddd"}
      passos=0;
      System.out.println("busca linear recursiva:"+buscaR(A, 15, 0));
      System.out.println("passo recursiva:"+passos);
      passos=0;
      System.out.println("busca linear iterativa:"+busca(A, 15));
      System.out.println("passo iterativa:"+passos);

    }
    public static int buscaR( int v[], int x, int k){
      
      // caso base
      if (k == v.length)
         return -1;
      passos++;
      if( v[k] == x )
         return k;
      

      return buscaR(v, x, k+1);

    }
      
    // funcao faz busca linear retorna a primeira ocorrência
    public static int busca( int v[], int x ){

     for( int k = 0; k < v.length; k++ ){
        passos++;
        if ( v[k] == x )
           return k; // achou 
     }
     // não achou	
     return -1;
    }
}