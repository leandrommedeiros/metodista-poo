package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 02 - Herança.
 * Classe VEÍCULO
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Vehicle {
    private int    wheelsAmount;
    private String fuel;

    /**
     * Construtor
     * @param inWheelsAmount Quantidade de Rodas
     * @param inFuel         Combustível
     */
    public Vehicle(int inWheelsAmount, String inFuel) {
        this.wheelsAmount = inWheelsAmount < 0 ? 1 : inWheelsAmount;
        this.fuel         = inFuel;
    }

    /**
     * Getter
     * @return Quantidade de Rodas
     */
    public int getWheelsAmount() {
        return this.wheelsAmount;
    }

    /**
     * Getter
     * @return Combustível
     */
    public String getFuel() {
        return this.fuel;
    }
}
