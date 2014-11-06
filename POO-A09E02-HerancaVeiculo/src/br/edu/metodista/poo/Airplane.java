package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 02 - Herança.
 * Classe AVIÃO
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Airplane extends Vehicle {
    private int seats;

    /**
     * Construtor
     * @param inWheelsAmount Quantidade de Rodas
     * @param inFuel         Combustivel
     * @param inSeats        Quantidade de Assentos
     */
    public Airplane(int inWheelsAmount, String inFuel, int inSeats) {
        super(inWheelsAmount, inFuel);

        this.seats = inSeats < 0 ? 0 : inSeats;
    }

    /**
     * Getter
     * @return Quantidade de Assentos
     */
    public int getSeats() {
        return this.seats;
    }

    /**
     * Obter Informações
     * @return Texto com dados do veículo
     */
    @Override
    public String getInfo() {
        return "Sou uma aeronave que possui "                    + this.getWheelsAmount()
             + " rodas como trem de pouso, com capacidade para " + this.getSeats()
             + " passageiros e que meu motor funciona com "      + this.getFuel();
    }
}