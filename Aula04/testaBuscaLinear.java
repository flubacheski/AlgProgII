/*
Dado um inteiro x e um vetor v[0..n-1] de inteiros, o problema da busca consiste em encontrar x em v, ou seja, encontrar um índice k tal que v[k] == x.
*/
public class testaBuscaLinear {

    public static void main(String[] args) {
       int A[] = {5,3,7,4,2,8,4,6};
		 
		 //System.out.println("busca linear:"+busca(A, 9));
		 //System.out.println("busca linear criticar:"+buscaCriticar(A, 2));
		 System.out.println("busca linear (ultimo):"+buscaUltimo(A, 4));
       
    }
	 // funcao faz busca linear retorna a primeira ocorrência
	 public static int busca( int v[], int x ){

		for( int k = 0; k < v.length; k++ )
			if ( v[k] == x )
				return k; // achou 
		// não achou	
		return -1;
	}
	// funcao faz busca linear retorna a ultima ocorrencia
	 public static int buscaUltimo( int v[], int x ){
		int i=-1;
		for( int k = 0; k < v.length; k++ )
			if ( v[k] == x )
				i = k; 
		// não achou	
		return i;
	}
	public static int buscaCriticar( int v[], int x) {
    int m = 0;
    // nao funciona pois a função considera que o vetor esta em ordem crescente
    while (m < v.length && v[m] < x ) 
       m++;
     
     if (m < v.length && v[m] == x) 
       return m;
     else 
       return -1;
	}

}

