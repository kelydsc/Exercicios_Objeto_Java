package br.com.digitalhouse_exercicio02;

public class SessaoDeTreinamento {

    private Integer experiência;

    public Integer getExperiência() {
        return experiência;
    }

    public void setExperiência(Integer experiência) {
        this.experiência = experiência;
    }

    public void  treinarA(JogadorDeFutebol jogadorDeFutebol){

        System.out.println("Experiencia inicial: " + experiência);

        jogadorDeFutebol.correr();
        jogadorDeFutebol.fazerGol();
        jogadorDeFutebol.correr();

        experiência = experiência + 1;
        System.out.println("Experiencia final: " + experiência);
    }
}
