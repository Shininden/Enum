package Fatec.EstruturadeDados.Exercicios.Pilha;

import Fatec.EstruturadeDados.Pilha.NossoVetor;

public class Testo 
{
    public static void main(String[] args) 
    {
        NossoVetor pilha = new NossoVetor(10);

        System.out.println(pilha.toString());
        pilha.inserir(12);
        pilha.inserir(24);
        pilha.inserir(45);
        pilha.inserir(90);
        pilha.inserir(87);

        System.out.println(pilha.toString());

        pilha.remove();

        System.out.println(pilha.toString());

        pilha.inserir(7);

        System.out.println(pilha.toString());
        pilha.inserir(5);
        pilha.inserir(6);
        pilha.inserir(7);
        pilha.inserir(8);
        pilha.inserir(9);

        System.out.println(pilha.divide_Evens(pilha));
        System.out.println(pilha.divide_Odds(pilha));
    }  
}