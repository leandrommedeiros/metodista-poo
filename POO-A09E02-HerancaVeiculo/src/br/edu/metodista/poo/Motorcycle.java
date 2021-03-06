package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 02 - Herança.
 * Classe MOTOCICLETA
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Motorcycle extends Vehicle {
    private int cylinders;
    private int ccPerCylinder;
    private int engineCapacity;

    /**
     * Construtor
     * @param inFuel          Combustível
     * @param inCylinders     Quantidade de Cilindros
     * @param inCCPerCylinder Capacidade (centímetro cúbico) por cilindro
     */
    public Motorcycle(String inFuel, int inCylinders, int inCCPerCylinder) {
        super(2, inFuel);
        
        this.cylinders      = inCylinders     < 1  ? 1  : inCylinders;
        this.ccPerCylinder  = inCCPerCylinder < 50 ? 50 : inCCPerCylinder;
        this.engineCapacity = inCylinders * inCCPerCylinder;
    }

    /**
     * Getter
     * @return Quantidade de Cilindros no Motor
     */
    public int getCylinders() {
        return this.cylinders;
    }

    /**
     * Getter
     * @return Capacidade por cilíndro (Centímetro cúbico)
     */
    public int getCCPerCylinder() {
        return this.ccPerCylinder;
    }

    /**
     * Getter
     * @return Capacidade total do motor
     */
    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    /**
     * Obter Informações (Sobreescrito).
     * @return Texto com dados da moto
     */
    @Override
    public String getInfo() {
        return "Sou uma motocicleta com um motor de " + this.getEngineCapacity()
             + "cc que roda à base de "               + this.getFuel();
    }
}