package Fatec.EstruturadeDados.Pilha;

public class Pilha 
{
    Carta[] baralho;
    int topo;

    public Pilha () 
    {
        baralho = new Carta[52];
        topo = 0;
    }

    public boolean canPush (Carta c) 
    {
        if (isCheia()) {
            return false;
        } 
        else 
        {
            baralho[topo++] = c;
            return true;
        }
    }

    public Carta canPop () 
    {
        if (isVazia()) {
            return null;
        } 
        else {
            return baralho[--topo];
        }
        /*Quando usar cada um?
        Use --topo quando quiser que o índice seja decrementado antes de acessar o array.
        Use topo-- quando quiser acessar primeiro e só depois decrementar. */
    }


    //METODO ESPIA: DEVOLVE A CARTA NO TOPO
    public Carta espiaCarta() 
    {
        if (isVazia()) {
            return null;
        }
        else {
            return baralho[topo - 1];
        }
    }   

    public int search(Carta c) 
    {
        for (int i = topo - 1, pos = 1; i >= 0; i--, pos++) 
        {
            if (c.equals(baralho[i])) {
                return pos;
            } 
        }
        return -1;
    }

    //TAMANHO DA PILHA: DEVOLVE UM INTEIRO
    public int tamanho() {
        return topo;
    }

    public boolean isVazia() {
        return topo == 0;
    }

    public boolean isCheia() {
        return topo == baralho.length;
    }

    @Override
    public String toString() 
    {
        if (isVazia()) {
            return "mao vazia";
        } 
        else 
        {
            String s = "..............................\n";

            for (int i = topo - 1; i >= 0; i--) {
                s += baralho[i] + "\n";
            }
            return s + "..............................\n";
        }
    }
}