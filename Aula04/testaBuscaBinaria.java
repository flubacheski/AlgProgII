/*
Dado um inteiro x e um vetor v[0..n-1] de inteiros, o problema da busca consiste em encontrar x em v, ou seja, encontrar um índice k tal que v[k] == x.
*/
public class testaBuscaBinaria {
	public static int passos=0;
   public static void main(String[] args) {
       // tamanho do vetor N=8
		 int N=1024;
		 //int A[] = {4,9,15,16,40,47,78,91};
		 int A[] = new int[N];
		 for( int i=0;i<N;i++)
			 A[i]=i;
		
		 
		 System.out.println("busca binaria:"+busca(A, N));
		 System.out.println("N="+N+" passo="+passos);
		 printaVetor(A);
       
   }
	// funcao faz busca binaria e retorna o indice caso o numero seja encontrado
	public static int busca( int v[], int x ){
		int i = 0;
		int f = v.length - 1;

		while(  i <= f ){
			passos++;
			int m = (i+f)/2;
			if( x == v[m]) // achei
				return m; // retorna o indice
			if( x > v[m] ) // se x estiver na parte da direita
				i = m+1; // descarta tudo que está à esquerda
			else if ( x < v[m]) // se x estiver na parte da esquerda
				f = m-1;	// descarta tudo que está à direita
		}
		return -1;
	}
	public static void printaVetor(int V[]){
		System.out.println("Vetor:");
		for( int i=0;i<V.length; i++)
			System.out.print(V[i]+" ");
			
		System.out.println("\nFim impressao");
	}

}

