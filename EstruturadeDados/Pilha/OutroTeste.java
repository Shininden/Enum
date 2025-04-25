package Fatec.EstruturadeDados.Pilha;

import java.util.Random;

public class OutroTeste 
{
    public static void main(String[] args) 
    {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();

        for (int i = 1; i <= 100; i++) 
        {
            if (random.nextBoolean()) 
            {
                v.inserir(i);
                System.out.println("inseriu " + i);
            }
            else 
            {
                try {
                    System.out.println(v.remove() + " foi removido");
                }
                catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(v);
            System.out.println("tamanho = " + v.getTamanho());
        }

        try {
            System.out.println("40 esta na posicao " + v.indiceDe(40));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}