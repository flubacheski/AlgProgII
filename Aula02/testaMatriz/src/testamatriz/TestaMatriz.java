
package testamatriz;

import java.util.Scanner;


public class TestaMatriz {
    public static void main(String[] args) {
        // declara uma variavel que sera uma matriz
        int matriz[][];
        int num = 10;
        // aloca ou inicializa ou cria  a matriz 
        matriz = new int[3][2];
        
        // fazer a leitura de elementos para a matriz
        leMatriz( matriz, num );
        System.out.println("valor de num:"+num);
        imprimeMatriz( matriz );
    }
    // le uma matriz
    public static void leMatriz( int m[][], int num){
        Scanner ler = new Scanner(System.in);
        for( int i=0; i < m.length;i++){ // indice i anda na linha
            for(int j=0; j<m[0].length;j++){ // indice j anda na coluna
                 System.out.print("digite o elemento matriz["+i+"]["+j+"]:");
                 m[i][j]=ler.nextInt();
            }
        }
        num =  m.length*m[0].length;
    }
    // imprime uma matriz
    public static void imprimeMatriz( int m[][]){
        for( int i=0; i < m.length;i++){ // indice i anda na linha
            for(int j=0; j<m[0].length;j++){ // indice j anda na coluna
                 System.out.println("matriz["+i+"]["+j+"]:"+m[i][j]);
            }
        }
    }
}
