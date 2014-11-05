package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 01 - Herança.
 * Classe COMPUTADOR
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Computer {
    private int processorSpeed;
    private int memoryAmount;
    private String processorManufacture;

    /**
     * Construtor
     * @param inProcessorSpeed       Velocidade do Processador
     * @param inMemoryAmount         Quantidade de Memória
     * @param inProcessorManufacture Fabricante do Processador
     */
    public Computer(int inProcessorSpeed, int inMemoryAmount, String inProcessorManufacture) {
        this.processorSpeed       = inProcessorSpeed;
        this.memoryAmount         = inMemoryAmount;
        this.processorManufacture = inProcessorManufacture;
    }

    /**
     * Getter
     * @return Velocidade do Processador
     */
    public int getProcessorSpeed() {
        return this.processorSpeed;
    }

    /**
     * Getter
     * @return Quantidade de Memória
     */
    public int getMemoryAmount() {
        return this.memoryAmount;
    }

    /**
     * Getter
     * @return Fabricante do Processador
     */
    public String getProcessorManufacture() {
        return this.processorManufacture;
    }

    /**
     * Auto-Apresentação
     * @return Retorna um texto com as caracteristicas do objeto criado
     */
    public String selfIntroduce() {
        return "Sou um computador. Meu processador " + this.getProcessorManufacture()
             + " trabalha à uma velocidade de "      + this.getProcessorSpeed()
             + "Mhz utilizando meus "                + this.getMemoryAmount()
             + "GB de memória RAM.";
    }
}