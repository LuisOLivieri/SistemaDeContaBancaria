package EstruturaDeDados.model;

import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBacaria { //ABSTRACT = MODELO. NAO PODE MAIS INSTANCIAR.
    private String agencia;
    private String conta;
    private int digito;
    private double saldo;

    private Date dataAbertura;
    private double VALOR_MINIMO_DEPOSITO = 10.0;

    public ContaBacaria(String agencia, String conta, int digito, double saldoInicial) { //Construtor
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public String getAgencia() { //Metodos de acesso.
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    //Métodos - geram comportamentos.
    public void depositar(double valor){ //VERIFICA SE CUMPRE A EXIGENCIA DO DEPOSITOV MINIMO
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de depósito é R$: " + VALOR_MINIMO_DEPOSITO);
        } else {
            this.saldo += valor;
        }

    }
    public double sacar(double valor){ //VERIFICA SE TEM SALDO PARA SACAR BASEADO NO SALDO INICIAL.
        if (valor > this.saldo){
            throw new InputMismatchException("SALDO PARA SAQUE INSUFICIENTE.");
        } else {
           this.saldo -= valor; //REMOVE O VALOR DE SAQUE DA CONTA
        }
        return valor; //RETORNA O VALOR SACADO AO USUARIO
    }
    public void transferir (double valor, ContaBacaria contaDestino){
        this.sacar(valor); //chama o metodo sacar acima e efetua o saque na conta atual
        contaDestino.depositar(valor); // efuta o deposito na cnta de destino.
    }


}
