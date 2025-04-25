package Fatec.EstruturadeDados.Pilha;

public class TesteCarta 
{
    public static void main(String[] args) 
    {
        Pilha p = new Pilha();        
        Carta c1 = new Carta("ouros", "sete");

        System.out.println("Naipe da c1: " + c1.getNaipe());
        System.out.println("Numero da c1: " + c1.getValor());
        c1.setValor("Valete");


        System.out.println("Pilha instanciada: " + p);
        p.canPush(c1);
        System.out.println("empilhamos c1:\n" + p);

        p.canPush( new Carta("copas", "rainha") );
        System.out.println("empilhamos a rainha:\n" + p);

        System.out.println(p.canPop() + " foi desempilhada");
        System.out.println("desempilhamos uma carta, o naipe ficou como: \n" + p);

        System.out.println(p.canPop() + " foi desempilhada");
        System.out.println(p);

        System.out.println(p.canPop() + " foi desempilhada");
        System.out.println(p);

        Carta desempilhada = p.canPop();

        if (desempilhada != null) 
        {
            System.out.println(p.canPop() + " foi desempilhada");
            System.out.println(p);
        } 
        else {
            System.out.println("acabou o jogo");
        }
    }    
}

