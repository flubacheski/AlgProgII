/*
A intercalação é o processo utilizado para construir um vetor ordenado, de tamanho n+m, a partir de dois vetores já ordenados de tamanhos n e m.
Para entender complementemente o MergeSort execute passo a passo no site abaixo
http://www.pythontutor.com/visualize.html#mode=edit
*/
class testaMergeSort {
    public static int passos=0;

    public static void main(String[] args) {
       
      int v[] = {4,3,2,1};
      MergeSort(v,0,v.length);
      
      printaVetor(v);


      System.out.println("Nr Passos:"+passos);
      // passos = N = 11

    }
    public static void MergeSort(int v[], int p, int n){
        // se tiver mais de uma elemento no vetor vetor
        if( p < n-1 ){
            //calcula o meio do vetor
            int q = (p+n)/2;
            MergeSort(v, p, q);
            MergeSort(v, q, n);
            intercalacao(v,p,q,n);
        }
    }
    public static void intercalacao(int v[], int p, int q, int n){
        int w[] = new int[n-p];
        int i=p;
        int j=q;
        int k=0;
        while(i<q && j<n){
            passos++;
            if( v[i] < v[j])
                w[k++] = v[i++];
            else 
                w[k++] = v[j++];
        }
        while( i<q ){ // sobrou elementos no vetor A[]
           passos++;
           w[k++] = v[i++];
        }
        while( j<n ){ // sobrou elementos no vetor B[]
           passos++;
           w[k++] = v[j++];
        }
        for(k=0,i=p; k<w.length; k++, i++)
           v[i]=w[k];
    }
    public static void printaVetor(int V[]){
      System.out.print("Vetor:");
      for( int i=0;i<V.length; i++)
        System.out.print(V[i]+" ");
        
      System.out.println("\nFim impressao");
    }
}