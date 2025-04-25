package Fatec.EstruturadeDados.Pilha;

public class Carta 
{
    private String naipe;
    private String valor;
    
    public Carta(String naipe, String valor) 
    {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public boolean equals (Object obj) 
    {
        if (this == obj) {
            return true;
        } 
        else 
        {
            Carta carta = (Carta) obj;

            return carta.getNaipe().equals(this.getNaipe())  &&  carta.getValor().equals(this.getValor());
        }

    }

    public String getNaipe() {
        return naipe;
    }
    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta [naipe = " + naipe + ", valor = " + valor + "]";
    }
}