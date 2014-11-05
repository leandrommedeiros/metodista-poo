package br.edu.metodista.poo;

/**
 * POO - Aula 09 Exercício 01 - Herança.
 * Classe DESKTOP
 * @since  05.11.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Desktop extends Computer{
    private String color;
    private int    powerACDC;

    /**
     * Construtor
     * @param inProcessorSpeed       Velocidade do Processador
     * @param inMemoryAmount         Quantidade de Memória
     * @param inProcessorManufacture Fabricante do Processador
     */
    public Desktop(int inProcessorSpeed, int inMemoryAmount, String inProcessorManufacture) {
        super(inProcessorSpeed, inMemoryAmount, inProcessorManufacture);
        this.color     = "Branco";
        this.powerACDC = 400;
    }

    /**
     * Construtor
     * @param inProcessorSpeed       Velocidade do Processador
     * @param inMemoryAmount         Quantidade de Memória
     * @param inProcessorManufacture Fabricante do Processador
     * @param inColor                Cor do Gabinete
     * @param inACDCPower            Potência da Fonte
     */
    public Desktop(int inProcessorSpeed, int inMemoryAmount, String inProcessorManufacture,
                  String inColor, int inACDCPower) {
        super(inProcessorSpeed, inMemoryAmount, inProcessorManufacture);
        this.color     = inColor;
        this.powerACDC = inACDCPower < 0 ? 0 : inACDCPower;
    }

    /**
     * Getter
     * @return Cor do Gabinete
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Getter
     * @return Possui TouchPad
     */
    public int getACDCPower() {
        return this.powerACDC;
    }

    /**
     * Auto-Apresentação
     * @return Retorna um texto com as caracteristicas do objeto criado
     */
    public String fullSelfIntroduce() {
        return "Sou um notebook. Meu processador "          + this.getProcessorManufacture()
             + " trabalha à uma velocidade de "             + this.getProcessorSpeed()
             + "Mhz utilizando meus "                       + this.getMemoryAmount()
             + "GB de memória RAM. Sou "                    + this.getColor()
             + " e necessito de uma fonte com potência de " + this.getACDCPower() + "W.";
    }
}