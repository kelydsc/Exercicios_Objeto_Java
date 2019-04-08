package br.com.digitalhouse_exercicio03;

public class Prova {

    private Integer dificuldade;
    private Integer energiaNecessaria;

    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Integer getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(Integer energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public Boolean  podeRealizar(Atleta atleta){
        return (atleta.getNivel() >= dificuldade) && (atleta.getEnergia() >= energiaNecessaria);
    }
}