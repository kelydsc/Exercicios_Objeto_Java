package br.com.digitalhouse_exercicio02;

public class JogadorDeFutebol {

    private String nome;
    private Integer energia;
    private Integer alegria;
    private Integer gols;
    private Integer experiencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getAlegria() {
        return alegria;
    }

    public void setAlegria(Integer alegria) {
        this.alegria = alegria;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void fazerGol(){

        energia = energia - 5;
        alegria = alegria + 10;
        gols = gols + 1;
        System.out.println("GOOOOL!" );
    }

    public  void correr(){

        energia = energia - 10;
        System.out.println("Cansei");
    }
}
