package br.metodista.poo;

/**
 * @title  POO Aula 08 Exercício 01 - Vetores
 * @since  08.10.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class CaixaDeNumeros {
    public final int[] values;
    
    public CaixaDeNumeros(boolean fixedValues) {
        this.values = new int[15];
        
        if (fixedValues) this.createFixedValues();
        else             this.createRandomValues();
    }
    
    protected void createRandomValues() {
        for (int idx = 0; idx < this.values.length; idx ++) 
            this.values[idx] = (int) (Math.random() * 100);
    }

    protected void createFixedValues() {
        this.values[0]  = 23;
        this.values[1]  = 5;
        this.values[2]  = 676;
        this.values[3]  = 1;
        this.values[4]  = 2;
        this.values[5]  = 33;
        this.values[6]  = 234;
        this.values[7]  = 3;
        this.values[8]  = 34;
        this.values[9]  = 87;
        this.values[10] = 12;
        this.values[11] = 5;
        this.values[12] = 9;
        this.values[13] = 42;
        this.values[14] = -1;
    }
    
    public int getMaxValue() {
        int iMax = this.values[0];
        
        for (int idx = 0; idx < this.values.length; idx++) 
            if (this.values[idx] > iMax)
                iMax = this.values[idx];
        
        return iMax;
    }    
    
    public int getMinValue() {
        int iMin = this.values[0];
        
        for (int idx = 0; idx < this.values.length; idx++) 
            if (this.values[idx] < iMin)
                iMin = this.values[idx];
        
        return iMin;
    }
 
    public int[] getUpsideDownList() {
        int[] upsideDown = new int[this.values.length];
        int invertedIdx  = upsideDown.length - 1;
        
        for (int idx = 0; idx < this.values.length; idx++, invertedIdx--)
            upsideDown[invertedIdx] = this.values[idx];
        
        return upsideDown;
    }

    public String getUpsideDownListS() {
        String result = "";
        int[] inverted = this.getUpsideDownList();
        
        int idx = 0;
        while (idx < inverted.length) {
            result += (inverted[idx] + ", ");
            idx++;
        }
        
        return result;
    }
    
    public int getSum() {
        int iSum = 0;
        
        for (int idx = 0; idx < this.values.length; idx++)
            iSum += this.values[idx];
        
        return iSum;
   }

    public double getAverage() {
        return (this.getSum() / this.values.length);
    }
}