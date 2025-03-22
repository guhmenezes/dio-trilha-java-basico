package br.com.dio;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe que representa uma conta bancária.
 * 
 * @author guhmenezes
 */
public class Conta {

    private String numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    public Conta() {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.isEmpty()) {
            throw new IllegalArgumentException("Número da conta não pode ser vazio.");
        }
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            throw new IllegalArgumentException("Agência deve ser um número positivo.");
        }
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio.");
        }
        
        if (!nomeCliente.matches("[a-zA-ZÀ-ÿ\\s]+")) {
            throw new IllegalArgumentException("Nome do cliente não pode conter números ou caracteres especiais.");
        }
        
        if (!nomeCliente.matches("^(?=\\S)(?=\\S.*\\S)(?:\\S{2,} \\S{2,})+$")) {
            throw new IllegalArgumentException("Digite o nome completo.");
        }
        
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String getSaldoFormatado() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatoMoeda.format(saldo);
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
               "sua agência é " + agencia + ", conta " + numeroConta + 
               " e seu saldo " + getSaldoFormatado() + " já está disponível para saque.";
    }
}