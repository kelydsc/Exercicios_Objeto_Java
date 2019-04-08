package br.com.digitalhouse_exercicio03;

public class Exercicio3 {

    public static void main(String[] args) {

        //Atleta01:
        Atleta atletaKely = new Atleta();
        atletaKely.setNome("Kely");
        atletaKely.setNivel(5);
        atletaKely.setEnergia(8);

        System.out.println("Atleta 01: " + atletaKely.getNome());

        Prova prova01 = new Prova();
        prova01.setDificuldade(5);
        prova01.setEnergiaNecessaria(8);

        Prova prova02 = new Prova();
        prova02.setDificuldade(7);
        prova02.setEnergiaNecessaria(5);

        Prova prova03 = new Prova();
        prova03.setDificuldade(7);
        prova03.setEnergiaNecessaria(8);

        System.out.println("Pode fazer a prova 01: " + prova01.podeRealizar(atletaKely));
        System.out.println("Pode fazer a prova 02: " + prova02.podeRealizar(atletaKely));
        System.out.println("Pode fazer a prova 03: " + prova03.podeRealizar(atletaKely));

        //Atleta02:
        Atleta atletaMaria = new Atleta();
        atletaMaria.setNome("Maria");
        atletaMaria.setNivel(5);
        atletaMaria.setEnergia(10);

        System.out.println("Atleta 02: " + atletaMaria.getNome());

        prova01.setDificuldade(1);
        prova01.setEnergiaNecessaria(2);

        prova02.setDificuldade(3);
        prova02.setEnergiaNecessaria(4);

        prova03.setDificuldade(3);
        prova03.setEnergiaNecessaria(5);

        System.out.println("Pode fazer a prova 01: " + prova01.podeRealizar(atletaMaria));
        System.out.println("Pode fazer a prova 02: " + prova02.podeRealizar(atletaMaria));
        System.out.println("Pode fazer a prova 03: " + prova03.podeRealizar(atletaMaria));


    }
}
