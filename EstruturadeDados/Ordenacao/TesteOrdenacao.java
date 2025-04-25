package Fatec.EstruturadeDados.Ordenacao;
import java.util.Scanner;

import Fatec.EstruturadeDados.Pilha.NossoVetor;

import java.util.Date;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            long ini, fim;
            NossoVetor v = new NossoVetor(t);
            //v.preencheVetor();
            //System.out.println("vetor original\n" + v);
            // Date d = new Date();
            // ini = d.getTime();
            // v.bubbleSort();
            // fim = new Date().getTime();
            // System.out.println("bubble demorou " + (fim-ini) + " milissegundos");
            //System.out.println("vetor ordenado pelo bubble\n" + v);

            // v.preencheVetor();
            // ini = new Date().getTime();            
            // v.insertionSort();
            // fim = new Date().getTime();
            // System.out.println("insertion demorou " + (fim - ini) + " milissegundos");

            v.AutoPreencheVetor();
            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho()-1);
            fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo quick: " + v);
            System.out.println("quick demorou " + (fim - ini) + " milissegundos");

            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho()-1);
            fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo quick: " + v);
            System.out.println("quick ordenado demorou " + (fim - ini) + " milissegundos");


            // ini = new Date().getTime();
            // v.bubbleSort();
            // fim = new Date().getTime();
            // System.out.println("bubble ordenado demorou " + (fim-ini) + " milissegundos");
            
            // ini = new Date().getTime();
            // v.insertionSort();
            // fim = new Date().getTime();
            // System.out.println("insertion ordenado demorou " + (fim-ini) + " milissegundos");
            
            System.out.print("digite o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}



