package EstruturaDeDados;

import EstruturaDeDados.model.ContaBacaria;
import EstruturaDeDados.model.ContaCorrente;
import EstruturaDeDados.model.ContaPoupanca;
import EstruturaDeDados.utils.UtilData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.00); //instanciando.

        System.out.println("Saldo ATUAL da conta: " + conta.getSaldo());

        conta.depositar(250.00);
        System.out.println("Saldo ATUAL da conta: " + conta.getSaldo());

        var saque = conta.sacar(95);
        System.out.println("Saldo ATUAL da conta: " + conta.getSaldo());

        ContaPoupanca conta2 = new ContaPoupanca("0001", "7543", 6, 200.00);
        conta2.transferir(150, conta);
        System.out.println("Saldo da conta de destino R$" + conta2.getSaldo());

        System.out.println("Saldo ATUAL da conta: " + conta.getSaldo());

        System.out.println(conta2.getDataAbertura());

        //STATIC NAO PRECISA ESTANCIAR E PODE CHAMAR DE DENTRO DA CLASSE.
        var formatado = UtilData.converterDateParaDataEHora(conta2.getDataAbertura());
        var formatado2 = UtilData.converterDateParaData(conta2.getDataAbertura());
        var formatado3 = UtilData.converterDateParaHora(conta2.getDataAbertura());
        System.out.println(formatado);
        System.out.println(formatado2);
        System.out.println(formatado3);





    }
}
