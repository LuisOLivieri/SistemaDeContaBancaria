package EstruturaDeDados.model;
//HERENÇA
public class ContaCorrente extends ContaBacaria{ //CONTA CORRENTE ESTA HERDANDO TUDO QUE TEM DENTRO DE CONTA BANCARIA
    public ContaCorrente(String agencia, String conta, int digito, double saldoInicial) {
        //Necessário usar o contrutor do pai.
        super(agencia, conta, digito, saldoInicial); //Passando os valores da conta Bancaria.
    }

}
