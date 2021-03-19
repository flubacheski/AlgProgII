
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
            char vetorCaracter[] = new char[vetorString.length];
            vetorCaracter[0] = vetorString[0].charAt(0);
            vetorCaracter[1] = vetorString[1].charAt(0);
            vetorCaracter[2] = vetorString[2].charAt(0);
            System.out.println(linha);
        }
        
        // fechamento
        lerBuffer.close();
        System.out.println("fim de programa.");
    }
    
}
