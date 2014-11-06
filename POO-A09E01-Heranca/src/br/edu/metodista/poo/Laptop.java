package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 01 - Herança.
 * Classe LAPTOP
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Laptop extends Computer{
    private int     speakers    = 0;
    private boolean hasTouchPad = false;

    /**
     * Construtor
     * @param inProcessorSpeed       Velocidade do Processador
     * @param inMemoryAmount         Quantidade de Memória
     * @param inProcessorManufacture Fabricante do Processador
     */
    public Laptop(int inProcessorSpeed, int inMemoryAmount, String inProcessorManufacture) {
        super(inProcessorSpeed, inMemoryAmount, inProcessorManufacture);
        this.speakers    = 0;
        this.hasTouchPad = false;
    }

    /**
     * Construtor
     * @param inProcessorSpeed       Velocidade do Processador
     * @param inMemoryAmount         Quantidade de Memória
     * @param inProcessorManufacture Fabricante do Processador
     * @param inSpeakers             Quantidade de Auto-falantes
     * @param inHasTouchPad          Possui TouchPad
     */
    public Laptop(int inProcessorSpeed, int inMemoryAmount, String inProcessorManufacture,
                  int inSpeakers, boolean inHasTouchPad) {
        super(inProcessorSpeed, inMemoryAmount, inProcessorManufacture);
        this.speakers    = inSpeakers < 0 ? 0 : inSpeakers;
        this.hasTouchPad = inHasTouchPad;
    }

    /**
     * Getter
     * @return Quantidade de Auto-falantes
     */
    public int getSpeakersAmount() {
        return this.speakers;
    }

    /**
     * Getter
     * @return Possui TouchPad
     */
    public boolean getHasTouchPad() {
        return this.hasTouchPad;
    }

    /**
     * Auto-Apresentação
     * @return Retorna um texto com as caracteristicas do objeto criado
     */
    public String fullSelfIntroduce() {
        return "Sou um notebook. Meu processador " + this.getProcessorManufacture()
             + " trabalha à uma velocidade de "    + this.getProcessorSpeed()
             + "Mhz utilizando meus "              + this.getMemoryAmount()
             + "GB de memória RAM. Possuo "        + this.getSpeakersAmount()
             + " auto-falantes e " + (this.getHasTouchPad() ? "" : "não ")
             + "possuo um TouchPad.";
    }
}