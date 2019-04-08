package br.com.digitalhouse_exercicio04;

public class Tripe {

    public Boolean dobrado;
    public float alturaMinima;
    public float alturaMaxima;
    public float alturaAtual;

    public void definirAltura(float novaAltura){

        alturaAtual = novaAltura;
    }

    public void dobrar(){

        dobrado = true;
    }

    public void desdobrar(){

        dobrado = false;
    }

    public Boolean guardar(){

        return dobrado = true && alturaAtual < alturaMinima;
    }

    public Boolean prontoParaGuardar(){

        return dobrado = true && alturaAtual == alturaMinima;

    }

    public Boolean usar(){

        return dobrado = false && (alturaAtual > (alturaMaxima / 2));
    }

    public Boolean prontoParaUsar(){

        return dobrado = false && (alturaAtual == (alturaMaxima / 2));

    }
}
