package jogodavelha;

import java.util.Scanner;

public class JogodaVelha {
    public static void main(String[] args) {
        // funcao principal do jogo
        game();
        
    }
    public static void game(){
        // declara a matriz que serah o tabuleiro
        char matriz[][];
        // declara o jogador
        char jogador = 'O';
        // variavel para receber o status do game
        int gameloop = -1;
        
        // declara o scanner para fazer a leitura
        Scanner ler = new Scanner(System.in);
        // inicializa a matriz
        matriz = initialize();
        // imprime matriz uma vez
        print(matriz);
        System.out.println("\nDigite a linha e coluna, separada por espaco, para fazer a jogada");
        System.out.println("linha ou coluna igual a -1 sai do game.\n");
        // game loop
        while( gameloop == -1 ){
            // trata a entrada, ou seja, le a jogado do jogador
            System.out.print("Vez do Jogador ["+jogador+"]:");
            int linha  = ler.nextInt();
            int coluna = ler.nextInt();
            if( linha==-1 || coluna == -1 )
                break; // quebra o laco nesse ponto
            
            // faz simulação, ou seja, verifica se pode fazer a jogada e faz a jogado
            if( step(matriz, linha, coluna, jogador) == true){
                // testa o status do game
                gameloop = status(matriz, jogador);
                if( jogador == 'O')
                    jogador = 'X';
                else
                    jogador = 'O';

            }
            else
                System.out.println("Posicao invalida, jogue novamente !");
            

            // imprime o cenario do game, ou seja, o tabuleiro
            print(matriz);
            // aqui tambem vamos verificar se podemos prosseguir no game
        }
        if( gameloop == 0 )
            System.out.println("deu Velha !!!!");
        if( gameloop == 1 )
            System.out.println("Jogador [O] venceu !!!");
        if( gameloop == 2 )
            System.out.println("Jogador [X] venceu !!!");
        
        System.out.println("Game over !!!");
    }
    public static char [][] initialize( ){
        char tabuleiro [][] = new char [3][3];
        
        // preenche
        for( int i=0; i < tabuleiro.length; i++)
            for( int j=0; j< tabuleiro[0].length; j++)
                tabuleiro[i][j] = ' ';
        // retorna
        return tabuleiro;
    }
    public static void print(char M[][]){
        for( int i=0; i < M.length; i++){
            for( int j=0; j < M[0].length; j++)
                System.out.printf("[%c]",M[i][j]);
            System.out.println(":"+i);
        }
        System.out.println(" 0  1  2");
    }
   public static boolean step(char M[][], int lin, int col, char gamer){
      // testa se a posicao esta livre
      if( M[lin][col] == ' '){
        M[lin][col] = gamer;
        return true;
      }
      
      return false;
   }
   public static int status(char M[][], char jogador ){
       int retStatus;
       if( jogador == 'O')  
           retStatus = 1;
       else 
           retStatus = 2;
       // verifica se um jogador ganhou
       // verifica as linhas
       for(int i=0;i<M.length;i++)
           if(M[i][0]==jogador &&M[i][1]==jogador &&M[i][2]==jogador)
               return retStatus;
       // verifica as colunas
       for(int i=0;i < M[0].length;i++)
           if(M[0][i]==jogador && M[1][i]==jogador && M[2][i]==jogador)
               return retStatus;
       // verifica as diagonal principal
       if(M[0][0]==jogador && M[1][1]==jogador && M[2][2]==jogador)
               return retStatus;
       // verifica as diagonal principal
       if(M[0][2]==jogador && M[1][1]==jogador && M[2][0]==jogador)
               return retStatus;
       // verificar se estao todas as posicoes preenchidas, se tiver
       // alguma vazia o jogo pode continuar (-1)
       for(int i=0; i < M.length; i++)
           for( int j=0; j < M[0].length; j++)
               if( M[i][j]==' ')
                   return -1;
       
       return 1; // jogo empatado (1)
   } 
}
