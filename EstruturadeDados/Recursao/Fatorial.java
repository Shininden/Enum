package Fatec.EstruturadeDados.Recursao;

public class Fatorial {

    //FATORIAL
    static int fatorial (int n) 
    {
        if (n < 2) return 1; //caso de parada
        return n * fatorial(n - 1);
    }
    
    //FATORIAL DUPLO 
    static int fatorialDuplo (int numero) 
    {
        if (numero % 2 != 1) {
            return 0;
        } 
        if (numero < 3) {
            return 1;
        }
        return numero * fatorial(numero - 2);
    }

    //FIBONACCI
    static int fibonacci (int n) 
    {
        if (n < 3) return 1;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //POTENCIACAO
    static double potencia (double base, int expoente) 
    {
        if (expoente == 0) return 1;

        if (expoente < 0) 
        {
            base = 1 / base;
            expoente *= -1;
        }


        double pot = base;
        for (int i = 1; i < expoente; i++) {
            pot *= base;
        }

        return pot;
    }

    //POTENCIAS RECURSIVAS
    static int potenciaRecursiva (int base, int i, int expoente) 
    {
        if (i == expoente) return base;
        
        return base * potenciaRecursiva(base, i+1, expoente);
    }
    static int potenciaRecursiva2 (int base, int expoente) 
    {
        if (expoente == 0) return 2; 

        return base * potenciaRecursiva2(base, expoente-1);
    }

    //FAZER UM METODO RECURSIVO PARA SOMAR VALORES DE 1 A N
    static int somaRecursiva (int n) 
    {
        if (n <= 1) return n;

        return n + somaRecursiva(n-1);
    }

    //FAZER METODO INTERATIVO PARA SOMAR OS DIGITOS DE UM NUMERO 
    static double descascar (int numero) 
    {
        int sominha = 0;
        while (numero > 0) 
        {
            sominha +=  numero % 10;
            numero = numero / 10;
        }
        return sominha;
    }

    //CONSTRUIR METODO RECURSIVO PARA SOMAR OS DIGITOS DE UM NUMERO
    static int descascarRecursiva (int numero) 
    {
        if (numero == 0) return 0;

        return numero % 10 + descascarRecursiva(numero/10);
    }

    //SOMA DOS ELEMENTOS DE UM VETOR - DE FORMA RECURSIVA
    static int somaVetor(int[] v, int pos) 
    {   //pos = indice (ou i)
        if (pos == v.length-1) return v[v.length-1];

        return v[pos] + somaVetor(v, pos+1);
    }

    public static void main (String[] args) 
    {
        /* //FATORIAL
        for (int i=0; i<13; i++){
            System.out.println("fatorial de " + i + " = " + fatorial(i));
        } */

        //FIBONACCI
        /*for (int i=1; i<=32; i++) {
            System.out.println("fibonacci em " + i + " = " + fibonacci(i));
        } */

        //POTENCIACAO - EXERCICIO - COM RECURSIVA
        //System.out.println("3 a quarta: " + potencia(3, 4));
        //System.out.println("3 a -4: " + potencia(3, -4)); //PELA CAPACIDADE DO COMPILADOR, O RESULTADO EH DIFERENTE;
        //System.out.println("potencia recursiva 1: " + potenciaRecursiva(3, 1, 4)); //RECURSIVIDADE 1;
        //System.out.println("potencia recursiva 2: " + potenciaRecursiva2(3, 4)); //RECURSIVIDADE 2;
        

          //SOMA RECURSIVA
          //System.out.println("Soma de 1 a N: " + somaRecursiva(10));
        

        /* //SOMANDO OS DIGITOS - RECURSAO INCLUSA
        System.out.println("Soma dos digitos: " + descascar(351));
        System.out.println("Soma dos digito (feito de forma recursiva): " + descascarRecursiva(297));
        */

        //FATORIAL DUPLO
        //System.out.println("Fatorial duplo do numero escolhido: " + fatorialDuplo(7));
    }
}

