package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 02 - Herança.
 * Classe PRINCIPAL
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Main {
    /**
     * Método Principal - Início da Aplicação
     * @param args
     */
    public static void main(String[] args) {
        Vehicle veiculo;

        //Genérico
        veiculo = new Vehicle(3, "Etanol");
        System.out.println(veiculo.getInfo());

        //Learjet 40 2006
        veiculo = new Airplane(3, "ATF - Aviation Turbine Fuel", 7);
        System.out.println(veiculo.getInfo());

        //Porsche 911
        veiculo = new Car("Gasolina", "Porsche", "911 GT3 Turbo", 2014);
        System.out.println(veiculo.getInfo());

        //Honda 1000RR
        veiculo = new Motorcycle("Gasolina", 4, 250);
        System.out.println(veiculo.getInfo());
    }
}
