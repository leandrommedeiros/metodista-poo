package reforco.poo;

import java.util.Scanner;

/**
 I/O
 Input/Output
 * 
 * jocacia.souzasp@live.com
 * cleisia.oliveira@neolider.net.br
 * @author Cleisia de Oliveira Galvão 248594
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
        rua = teclado.nextLine();
        
        System.out.println("Digite o número do terreno: ");
        numero = teclado.nextInt();
        
        System.out.println("Sua casa será situada à rua "
                          + rua
                          + "\nà altura do número "
                          + numero + "!");
        
        System.out.println("Sua casa tem garagem? (S/N)");
        garagem = teclado.next().charAt(0);
      
        house   = new Casa();
        
        if (garagem == 'S') {
            house.temGaragem = true;
        }
        
        else {
            house.temGaragem = false;
        }
    }
}