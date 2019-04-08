package br.com.digitalhouse_exercicio01;

public class Exercicio1 {

    public static void main(String[] args) {

        //criação do cliente 01:
        Cliente clienteKely = new Cliente();

        clienteKely.setNome("Kely");
        clienteKely.setSobrenome("dos Santos");

        Conta contaKely = new Conta();
        contaKely.setNumeroDaConta(123);
        contaKely.setSaldo(0.00);
        contaKely.setTitular(clienteKely);
        System.out.println("Cliente: " + contaKely.getTitular().getNome());

        contaKely.deposito(0.00);
        contaKely.getSaldo();
        contaKely.saque(200.00);

        //criação do cliente 02:

        Cliente clienteJoaquim = new Cliente();

        clienteJoaquim.setNome("Joaquim");
        clienteJoaquim.setSobrenome("dos Santos");


        Conta contaJoaquim = new Conta();
        contaJoaquim.setNumeroDaConta(456);
        contaJoaquim.setSaldo(200.00);
        contaJoaquim.setTitular(clienteJoaquim);
        System.out.println("Cliente: " + contaJoaquim.getTitular().getNome());

        contaJoaquim.getSaldo();
        contaJoaquim.deposito(100.00);
        contaJoaquim.saque(100.00);
    }
}