import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Jogo iniciado!");

        ArrayList<Pergunta> perguntas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // PERGUNTAS
        perguntas.add(new Pergunta(
                "Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?",
                "24 horas",
                "365 dias",
                "30 dias",
                "12 horas",
                'a'));

        perguntas.add(new Pergunta(
                "Quem inventou a lâmpada?",
                "Nikola Tesla",
                "Steve Jobs",
                "Kanye West",
                "Thomas Edison",
                'd'));

        perguntas.add(new Pergunta(
                "Qual é o filme de maior bilheteria de todos os tempos?",
                "Moana",
                "Avatar",
                "Vingadores: Ultimato",
                "Titanic",
                'b'));

        perguntas.add(new Pergunta(
                "Quem é a pessoa mais rica de todos os tempos, com uma fortuna imensurável?",
                "Kim Kardashian",
                "Elon Musk",
                "Steve Jobs",
                "Mansa Musa",
                'd'));

        perguntas.add(new Pergunta(
                "Qual é considerado pela maior parte da crítica o melhor álbum do século XXI?",
                "Kid A - Radiohead",
                "To Pimp a Butterfly - Kendrick Lamar",
                "Lemonade - Beyoncé",
                "My Beautiful Dark Twisted Fantasy - Kanye West",
                'c'));

        perguntas.add(new Pergunta(
                "Qual é o nome do maior deserto do mundo?",
                "Deserto do Saara",
                "Deserto de Gobi",
                "Deserto da Antártida",
                "Deserto de Kalahari",
                'c'));

        // Embaralha as perguntas para que a ordem seja diferente a cada jogo
        Collections.shuffle(perguntas);

        int indice = 0;
        int erros = 0;
        int acertos = 0;

        while (indice < perguntas.size()) {

            Pergunta atual = perguntas.get(indice);

            System.out.println("\nPergunta " + (indice + 1));
            System.out.println(atual.pergunta);
            System.out.println("a) " + atual.alternativaA);
            System.out.println("b) " + atual.alternativaB);
            System.out.println("c) " + atual.alternativaC);
            System.out.println("d) " + atual.alternativaD);

            System.out.print("Digite sua resposta: ");
            char resposta = sc.next().toLowerCase().charAt(0);

            // Verifica se a resposta é correta
            if (resposta == atual.respostaCorreta) {
                System.out.println("Acertou!");
                indice++;
                acertos++;
            } else {
                erros++;
                System.out.println("Errou!");
                System.out.println("Erros: " + erros + "/3");
            
            // Se o jogador errar 3 vezes, o jogo é reiniciado
            
                if (erros == 3) {
                    System.out.println("\nVocê errou 3 vezes. O jogo será reiniciado!");
                    indice = 0;
                    erros = 0;
                    acertos = 0;
                    Collections.shuffle(perguntas);
                }
            }
        }

        System.out.println("\nParabéns! Você zerou o jogo!");
        System.out.println("Total de acertos: " + acertos);

        sc.close();
    }
}