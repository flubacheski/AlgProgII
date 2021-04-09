/*
Dado um inteiro x e um vetor v[0..n-1] de inteiros, o problema da busca consiste em encontrar x em v, ou seja, encontrar um índice k tal que v[k] == x.
*/
public class testaBuscaLinear {

    public static void main(String[] args) {
       int A[] = {5,3,7,4,2,8,4,6};
		 
		 System.out.println("busca linear:"+busca(A, 9));
       
    }
	 // funcao faz
	 public static int busca( int v[], int x ){

		for( int k = 0; k < v.length; k++ )
			if ( v[k] == x )
				return k; // achou 
		// não achou	
		return -1;
	}
}

