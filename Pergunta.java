public class Pergunta {
    String pergunta;
    String alternativaA;
    String alternativaB;
    String alternativaC;
    String alternativaD;
    char respostaCorreta;

    public Pergunta(String pergunta, String alternativaA, String alternativaB, String alternativaC, String alternativaD, char respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.respostaCorreta = respostaCorreta;
    }
}
