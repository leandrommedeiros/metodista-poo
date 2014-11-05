package br.metodista.poo;

/**
 * @title "Projeto Orientado à Objetos - Aula 05 Exercício 03"
 * @author Leandro Medeiros - R.A. 250544
 * @since 03-09-2014
 */
public class Quadrilatero {
    //Atributos
    private double altura, largura;
    
    
    /**
     * Setters
     * Os atributos devem sempre ser positivos
     */
    public void setAltura(double novaAltura) {
        if (novaAltura < 0) novaAltura *= -1;
        
        this.altura = novaAltura;
    }
    
    public void setLargura(double novaLargura) {
        if (novaLargura < 0) novaLargura *= -1;
        
        this.largura = novaLargura;
    }
    
    //Cálculos
    public double calcularAreaQuadrilatero() {
        return (this.altura * this.largura);
    }
    
    public double calcularAreaParalelepidedoRetangulo() {
        return (this.altura * this.largura * 6);
    }
    
    public boolean ehQuadradoOuCubo() {
        return (this.altura == this.largura);
    }
}