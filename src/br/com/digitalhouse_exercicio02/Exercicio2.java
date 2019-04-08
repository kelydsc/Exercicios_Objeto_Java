package br.com.digitalhouse_exercicio02;

public class Exercicio2 {

    public static void main(String[] args) {

        //jogador 01:
        JogadorDeFutebol jogadorKely = new JogadorDeFutebol();
        jogadorKely.setNome("Kely");
        jogadorKely.setEnergia(40);
        jogadorKely.setAlegria(4);
        jogadorKely.setGols(2);
        jogadorKely.setExperiencia(4);

        SessaoDeTreinamento treinamentoKely = new SessaoDeTreinamento();
        treinamentoKely.setExperiência(2);
        System.out.println("Jogador 01: " + jogadorKely.getNome());

        treinamentoKely.treinarA(jogadorKely);

        //jogador 02:
        JogadorDeFutebol jogadorMaria = new JogadorDeFutebol();
        jogadorMaria.setNome("Maria");
        jogadorMaria.setEnergia(2);
        jogadorMaria.setAlegria(1);
        jogadorMaria.setGols(5);
        jogadorMaria.setExperiencia(3);

        SessaoDeTreinamento treinamentoMaria = new SessaoDeTreinamento();
        treinamentoMaria.setExperiência(1);

        System.out.println("Jogador 02: " + jogadorMaria.getNome());
        treinamentoMaria.treinarA(jogadorMaria);
    }
}
