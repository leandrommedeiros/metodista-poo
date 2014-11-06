package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 02 - Herança.
 * Classe CARRO
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Car extends Vehicle {
    private String manufacture;
    private String model;
    private int    year;

    /**
     * Construtor
     * @param inFuel        Combustível
     * @param inManufacture Fabricante
     * @param inModel       Modelo
     * @param inYear        Ano de Fabricação
     */
    public Car(String inFuel, String inManufacture, String inModel, int inYear) {
        super(4, inFuel);
        this.manufacture = inManufacture;
        this.model       = inModel;
        this.year        = inYear;
    }

    /**
     * Getter
     * @return Fabricante
     */
    public String getManufacture() {
        return this.manufacture;
    }

    /**
     * Getter
     * @return Modelo
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Getter
     * @return Ano de Fabricação
     */
    public int getYear() {
        return this.year;
    }
}