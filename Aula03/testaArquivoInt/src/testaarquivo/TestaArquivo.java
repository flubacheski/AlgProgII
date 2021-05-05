
package testaarquivo;

import java.io.*;

public class TestaArquivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // abertura
        FileReader lerArquivo = new FileReader("texto.txt");
        // bufferizar a leitura (ler em um buffer=sequencia de caracteres)
        BufferedReader lerBuffer = new BufferedReader(lerArquivo);
        // leitura
        while( true ){ // while infinito
            // le uma linha do arquivo
            String linha = lerBuffer.readLine();

            if( linha == null )
                break; // quebra o laco
            
            // dividir a linha considerando como caracter de separacao o espaco
            String vetorString[] = linha.split(" ");
            int vetorInteiro[] = new int[vetorString.length];
            // como copiar as Strings do vetorString para vetorInteiro ??
            for( int i=0;i<vetorString.length;i++){
                // converter uma string em inteiro ?
                vetorInteiro[i]=Integer.parseInt(vetorString[i]);
                System.out.print(vetorInteiro[i]%3+" ");
            }
        }
        
        // fechamento
        lerBuffer.close();
        System.out.println("fim de programa.");
    }
    
}
