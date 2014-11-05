package br.metodista.poo;

/**
 * @title Classe "Jogo da Velha"
 * @since 10.09.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class TicTacToe {
    private int currentPlayer = 1;
    public String currentMarker = "X";

    public String player1 = "Jogador 1", 
                  player2 = "Jogador 2";
    
    private String A1 = "1", A2 = "2", A3 = "3",
                   B1 = "4", B2 = "5", B3 = "6",
                   C1 = "7", C2 = "8", C3 = "9";
    
    public String getCurrentPlayerName() {
        if (this.currentPlayer == 1) return this.player1;
        else                         return this.player2;
    }
    
    public String getLastPlayerName() {
        if (this.currentPlayer == 1) return this.player2;
        else                         return this.player1;
    }
    
    private boolean moveA(int index) {
        if (index == 1) {
            this.A1 = this.currentMarker;
            return true;
        }
        
        else if (index == 2) {
            this.A2 = this.currentMarker;
            return true;
        }
        
        else if (index == 3) {
            this.A3 = this.currentMarker;
            return true;
        }
        
        else {
            return false;
        }
    }
    
    private boolean moveB(int index) {
        if (index == 1) {
            this.B1 = this.currentMarker;
            return true;
        }
        
        else if (index == 2) {
            this.B2 = this.currentMarker;
            return true;
        }
        
        else if (index == 3) {
            this.B3 = this.currentMarker;
            return true;
        }
        
        else {
            return false;
        }
    }
    
    private boolean moveC(int index) {
        if (index == 1) {
            this.C1 = this.currentMarker;
            return true;
        }
        
        else if (index == 2) {
            this.C2 = this.currentMarker;
            return true;
        }
        
        else if (index == 3) {
            this.C3 = this.currentMarker;
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public boolean move(int x, int y) {
        if (this.currentPlayer == 1) {
            this.currentMarker = new String("X");
            this.currentPlayer = 2;
        }        
        else {
            this.currentMarker = new String("O");
            this.currentPlayer = 1;
        }
        
        switch(x) {
            case 1:
                return this.moveA(y);
            
            case 2:
                return this.moveB(y);
                
            case 3:
                return this.moveC(y);
                
            default:
                return false;                        
        }
    }
    
    public boolean hasWinner() {
        return (//Verificação das horizontais
                (this.A1.equals(this.A2) && this.A2.equals(this.A3)) ||
                (this.B1.equals(this.B2) && this.B2.equals(this.B3)) ||
                (this.C1.equals(this.C2) && this.C2.equals(this.C3)) ||

                // Verificação das verticais
                (this.A1.equals(this.B1) && this.B1.equals(this.C1)) ||
                (this.A2.equals(this.B2) && this.B2.equals(this.C2)) ||
                (this.A3.equals(this.B3) && this.B3.equals(this.C3)) ||

                // Verificação das diagonais
                (this.A1.equals(this.B2) && this.B2.equals(this.C3)) ||
                (this.A3.equals(this.B2) && this.B2.equals(this.C1)));
    }
    
    private boolean isMarked(String move) {
        return (move.equals("X") || move.equals("O"));
    }
    
    public boolean isTied() {
        return (this.isMarked(this.A1) &&
                this.isMarked(this.A2) &&
                this.isMarked(this.A3) &&
                this.isMarked(this.B1) &&
                this.isMarked(this.B2) &&
                this.isMarked(this.B3) &&
                this.isMarked(this.C1) &&
                this.isMarked(this.C2) &&
                this.isMarked(this.C3));
    }
}