package br.metodista.poo;

/**
 * @title  POO - Aula 08 Exercício 02 - Conta Letras
 * @since  09.10.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class Words {
    private final char[] chars;
    private final boolean caseSensitive;
    
    /**
     * Construtor
     * @param newValue: Palavra a ser verificada
     * @param caseSensitive: Define comportamento da verificação, quando falso
     * considera caracteres maiúsculos e minúsculos como iguais
     */
    public Words(String newValue, boolean caseSensitive) {
        this.caseSensitive = caseSensitive;                                     //Guardo o parâmetro no atributo privado para futura referência
        this.chars         = new char[newValue.length()];                       //e instancio um vetor de caracteres do mesmo tamanho que a palavra recebida
        
        if (!this.caseSensitive)                                                //Se o usuário quiser desconsiderar diferenças entre minúsculos e maiúsculos
            newValue = newValue.toLowerCase();                                  //converto a string de entrada em minúsculo
        
        int idx = 0;                                                            //Inicializo uma variável para controle do loop
        while (idx < this.chars.length) {                                       //que se repetirá enquanto o índice for menor do que a largura da palavra
            this.chars[idx] = newValue.charAt(idx);                             //À cada iteração guardo o caracter correspondente ao índice no vetor
            idx++;                                                              //e incremento o próprio índice
        }
    }
    
    /**
     * Contador de Caracteres
     * @param inCharacter: Caractere à ser contado
     * @return Inteiro correspondente ao número de ocorrências do caractere
     * desejado dentro do texto informado no construtor.
     */
    public int countChar(char inCharacter) {
        int iResult = 0;                                                        //Inicializo a variável de retorno
            
        if (!this.caseSensitive)                                                //Se a instância não estiver configurada como Case Sensitive
            inCharacter = Character.toLowerCase(inCharacter);                   //Converto o caracter desejado também em minúsculo
        
        for (int idx = 0; idx < this.chars.length; idx++)                       //itero o vetor e
            if (this.chars[idx] == inCharacter)                                 //comparo cada caractere guardado com aquele informado
                iResult++;                                                      //caso aja correspondência, incremento a variável de retorno
        
        return iResult;                                                         //ao fim do laço retorno a variável
    }
}
/******************************************************************************/