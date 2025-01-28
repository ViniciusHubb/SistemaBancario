package senac.pe.faculdade;

import senac.pe.faculdade.entidades.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Construtor 1 (uma forma de criar o objeto)
        Endereco endMarcos;
        endMarcos = new Endereco(
                "Av Cabugá",
                "Boa Viagem",
                "Recife",
                "PE",
                100,
                "Apartamento 301",
                "59000-000");
        //pede para a classe Endereco modificar a cidade (forma correta)
        endMarcos.setCidade("Olinda");

        System.out.println(endMarcos);

        //Construtor 2 (outra forma de criar o objeto)
        Endereco endMiguel = new Endereco(
                "Av Dois",
                "Boa Viagem",
                "Recife",
                "PE",
                101,
                "59000-000");
        System.out.println(endMiguel);

        Endereco endAgSenac = new Endereco(
                "Rua do Pombal",
                "Santo Amaro",
                "Recife",
                "PE",
                811,
                "51111-111");

        Agencia agSenac = new Agencia(
                1234,
                "Senac PE",
                21213232,
                "senac.pe@email.com",
                endAgSenac
        );

        System.out.println(agSenac);

        Cliente miguel = new Cliente(
                "Miguel",
                "123.456.789-00",
                endMiguel,
                new Date(95, 06, 16),
                123456789,
                "miguel@email.com",
                "(81)92323-2323"
        );
        System.out.println(miguel);

        Cliente charles = new Cliente(
                "Charles",
                "144.444.789-00",
                endMiguel,
                new Date(95, 06, 16),
                123456789,
                "miguel@email.com",
                "(81)92323-2323"
        );

        Conta contaMiguel = new ContaCorrente(
                miguel,
                78544,
                agSenac,
                new Date(98, 01, 20),
                1400,
                true,
                2500
        );

        Conta contaCharles = new Poupanca(
                charles,
                58544,
                agSenac,
                new Date(98, 01, 20),
                1400,
                true,
                2.05
        );

        System.out.println(contaMiguel.depositar(200));
        System.out.println(contaMiguel.sacar(100));
        contaCharles.transferir(400, contaMiguel);

        System.out.println(contaCharles.imprimirExtrato());
    }
}