package br.metodista.poo;

/**
 * @title Classe "Calculadora Avançada"
 * @since 17.09.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class AdvancedCalculator {
    
    public int digitCount(int inValue) {
        return String.valueOf(inValue).length();
    }
    
    public int decomposeNumber(int inValue) {
        String sAux = String.valueOf(inValue);
        int iSize   = sAux.length();
        int iResult = 0;
        
        for(int idx = 0; idx < iSize; idx++)
            iResult += Integer.parseInt("" + sAux.charAt(idx));
        
        if (String.valueOf(iResult).length() == 1) return iResult;
        else                                       return this.decomposeNumber(iResult);
    }
    
    public String toBinary(int inValue) {
        return Integer.toBinaryString(inValue);
    }
}