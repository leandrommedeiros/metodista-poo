/*
1   -> Planta - Classe
2.1 -> Cidade - Memoria
2.2 -> Terreno - Tamanho minimo igual ao especificado na casa - Variavel = espaco que voce tem controle na memoria
3   -> Contratar uma construtora - new
4   -> Mandar construir

-----------------------
|   Classe (nome)     |
|----------------------
|-> Estado            |
|Atributos (Variáveis)|
|----------------------
|-> Comportamento     |
|Métodos              |
-----------------------

int(inteiro) - Valores inteiros -65536..65535
boolean - Verdadeiro / Falso - True/False - 1/0
double - Valores reais - Permite casas decimais
char - caractere - Guarda uma única letra ou número

 */
/**
 *
 * @author leandro
 */
public class Casa {
    boolean temGaragem = false;
    int     andares = 1;
    int     quartos = 1;
    double  tamanhoFrente;
    double  tamanhoFundo;
}