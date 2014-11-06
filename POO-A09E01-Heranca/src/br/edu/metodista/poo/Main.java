package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 01 - Herança.
 * Classe PRINCIPAL
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Main {
    public static void main(String[] args) {
        Computer pc1;
        Laptop   pc2;
        Desktop  pc3;

        pc1 = new Computer(2048, 4, "Intel");
        System.out.println("PC 01 diz: '" + pc1.selfIntroduce() + "'.\n");

        pc2 = new Laptop(2560, 8, "AMD");
        System.out.println("PC 02 diz: '" + pc2.fullSelfIntroduce() + "'.");
        System.out.println("PC 02 diz: '" + pc2.selfIntroduce() + "'.\n");

        pc2 = new Laptop(2560, 8, "AMD", 2, true);
        System.out.println("PC 02 diz: '" + pc2.fullSelfIntroduce() + "'.");
        System.out.println("PC 02 diz: '" + pc2.selfIntroduce() + "'.\n");

        pc3 = new Desktop(300, 1, "ARM");
        System.out.println("PC 03 diz: '" + pc3.fullSelfIntroduce() + "'.");
        System.out.println("PC 03 diz: '" + pc3.selfIntroduce() + "'.\n");

        pc3 = new Desktop(300, 1, "ARM", "preto", 600);
        System.out.println("PC 03 diz: '" + pc3.fullSelfIntroduce() + "'.");
        System.out.println("PC 03 diz: '" + pc3.selfIntroduce() + "'.\n");
    }
}
