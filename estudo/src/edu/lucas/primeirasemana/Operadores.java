package edu.lucas.primeirasemana;

public class Operadores {
    public static void main(String[] args){
        //Operadores
        // atribuição: representado pelo simbolo de =
        String nome = "lucas";
        int idade = 22;
        double peso = 60.5;
        float gramas = 300.40F;
        char sexo = 'M';
        boolean doadorOrgao = false;

        //Aritmeticos
        //Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
        // + em variaveis de tipo texto é usado para concatenação
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //resto da divisão
        double resultado = (10 * 7) + (20/4);

       // Unários
       /*  Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

        (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana; */

        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
        }
}
