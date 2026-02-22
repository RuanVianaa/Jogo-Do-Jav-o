import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Jogo iniciado!");

        ArrayList<Pergunta> perguntas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Pergunta p1 = new Pergunta(
                "Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?",
                "24 horas",
                "365 dias",
                "30 dias",
                "12 horas",
                'a');

        perguntas.add(p1);
        
        Pergunta p2 = new Pergunta(
                "Quem inventou a lâmpada?",
                "Nikola Tesla",
                "Steve Jobs",
                "Kanye West",
                "Thomas Edison",
                'd');

        perguntas.add(p2);
        
        Pergunta p3 = new Pergunta(
                "Qual é o filme de maior bilheteria de todos os tempos?",
                "Moana",
                "Avatar",
                "Vingadores: Ultimato",
                "Titanic",
                'b');
        
        perguntas.add(p3);

        Pergunta p4 = new Pergunta(
                "Quem é a pessoa mais rica de todos os tempos, com uma fortuna imensurável?",
                "Kim Kardashian",
                "Elon Musk",
                "Stive Jobs",
                "Mansa Musa",
                'd');

        perguntas.add(p4);
        int indice = 0;
        int erros = 0;
        while (indice < perguntas.size()) {

            Pergunta atual = perguntas.get(indice);

            System.out.println(atual.pergunta);
            System.out.println("a) " + atual.alternativaA);
            System.out.println("b) " + atual.alternativaB);
            System.out.println("c) " + atual.alternativaC);
            System.out.println("d) " + atual.alternativaD);

            System.out.print("Digite sua resposta: ");
            char resposta = sc.next().toLowerCase().charAt(0);

            if (resposta == atual.respostaCorreta) {
                System.out.println("Acertou!");
                indice++;
            } else {
                System.out.println("Errou!");
                erros++;

                if (erros == 3) {
                    System.out.println("Você errou 3 vezes. O jogo será reiniciado.");
                    indice = 0;
                    erros = 0;
                }
            }
        }
    }
}