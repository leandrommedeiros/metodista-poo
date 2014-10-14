package br.metodista.poo;

/**
 * @author Leandro Medeiros - R.A. 250544
 * @since 03-09-2014
 */
public class IMCCalculator {
    public  double Weigth, Heigth;
    private double IMC = 0;
    
    public double calculate() {
        this.IMC = (Weigth / Math.pow(Heigth, 2));
        return this.IMC;
    }
    
    public String getMessage(boolean isMale) {        
        String sMessage;

        if (isMale) sMessage = new String(this.IMC + " - Homem ");            
        else        sMessage = new String(this.IMC + " - Mulher ");
        
        if (this.IMC < 16.0)      sMessage += "com magreza grave.";
        else if (this.IMC < 17.0) sMessage += "com magreza controlada.";
        else if (this.IMC < 18.5) sMessage += "com magreza leve.";
        else if (this.IMC < 25.0) sMessage += "saudável.";
        else if (this.IMC < 30.0) sMessage += "com sobrepeso.";
        else if (this.IMC < 35.0) sMessage += "com obesidade grau I.";
        else if (this.IMC < 40.0) sMessage += "com obesidade grau II (severa).";
        else                      sMessage += "com obesidade mórbida.";
      
        return sMessage;
    }
}
