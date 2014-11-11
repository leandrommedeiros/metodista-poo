import java.util.Scanner;

/*
1   -> Planta - Classe
2.1 -> Cidade - Memoria
2.2 -> Terreno - Tamanho minimo igual ao especificado na casa - Variavel = espaco que voce tem controle na memoria
3   -> Contratar uma construtora - new
4   -> Mandar construir

-----------------------
|   Classe (nome)     |
|----------------------
|-> Estado            |
|Atributos (Variáveis)|
|----------------------
|-> Comportamento     |
|Métodos              |
-----------------------

I/O
Input/Output

 */
public class Principal {
    public static void main(String[] args) {
        String  rua;
        int     numero;
        Scanner teclado;
        Casa    house;
        char    garagem;
        
        
        teclado = new Scanner(System.in);

        System.out.println("Digite o nome da sua rua: ");
        rua    = teclado.nextLine();

        System.out.println("Digite o número do terreno: ");
        numero = teclado.nextInt();

        System.out.println("Sua casa será situada à rua "
                          + rua
                          + " à altura do número "
                          + numero + "!");

        System.out.println("Sua casa tem garagem? (S/N)");
        garagem = teclado.next().charAt(0);
        
        house   = new Casa();

        if (garagem == 'S'){
            house.temGaragem = true;
        }
        else {
            house.temGaragem = false;
        }

    }
}