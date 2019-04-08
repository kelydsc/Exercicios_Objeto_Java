package br.com.digitalhouse_exercicio04;

public class Exercicio4 {

    public static void main(String[] args) {

        Tripe tripe = new Tripe();
        tripe.dobrado = true;
        tripe.alturaMinima = 1.0f;
        tripe.alturaMaxima = 4.0f;
        tripe.alturaAtual = 0.5f;

        System.out.println("Pode guardar o tripe: " + tripe.guardar() );
        System.out.println("O tripe está pronto para guardar: " + tripe.prontoParaGuardar() );
        System.out.println("Pode usar o tripe: " + tripe.usar() );
        System.out.println("O tripe está pronto para usar: " + tripe.prontoParaUsar() );
    }
}
