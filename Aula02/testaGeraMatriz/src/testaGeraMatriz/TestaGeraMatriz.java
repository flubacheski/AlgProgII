package testaGeraMatriz;

import java.util.*;

public class TestaGeraMatriz {
      public static void main(String[] args) {
        // declara uma variavel que sera uma matriz
        int matriz[][];
        int lin, col;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nr de linhas:");
        lin = ler.nextInt();
        System.out.print("Digite o nr de colunas:");
        col = ler.nextInt();
        matriz = geraMatriz(lin, col);
        imprimeMatriz( matriz );
    }
    public static int [ ][ ] geraMatriz(int lin,int col){ 
        //declara uma matriz local na funcao
        int Mat[][];
        // alocar a matriz com os valores dos parametros (lin,col)
        Mat = new int[lin][col];
        // cria um gerador de numero aleatorio
        Random gera = new Random();
        for(int i=0; i < Mat.length; i++) // anda linha
            for( int j=0; j < Mat[0].length; j++) // anda na coluna
                // gera um numero aleatorio
                Mat[i][j] = gera.nextInt(100);
       
        
        return Mat;
    }
        // imprime uma matriz
    public static void imprimeMatriz( int m[][]){
        for( int i=0; i < m.length;i++){ // indice i anda na linha
            for(int j=0; j<m[0].length;j++){ // indice j anda na coluna
                System.out.printf("%3d",m[i][j]);
            }
            System.out.println();
        }
    }
}
