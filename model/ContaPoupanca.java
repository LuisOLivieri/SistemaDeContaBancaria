package EstruturaDeDados.model;

public class ContaPoupanca extends ContaBacaria{ //CONTA POUPANCA ESTA HERDANDO TUDO QUE TEM DENTRO DE CONTA BANCARIA
    public ContaPoupanca(String agencia, String conta, int digito, double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
    }
}
