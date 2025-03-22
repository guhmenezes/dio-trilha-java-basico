package br.com.dio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("----------------- Nova Conta -----------------");

        criarConta(scanner, conta);
        
        scanner.close();
    }

    public static void criarConta(Scanner scanner, Conta conta) {
    	
    	  while (true) {
              try {
                  System.out.print("\nPor favor, digite o número da agência: ");
                  conta.setAgencia(scanner.nextInt());
                  scanner.nextLine();
                  break;
              } catch (InputMismatchException e) {
                  System.out.println("Entrada inválida. Por favor, digite um número inteiro para a agência.");
                  scanner.nextLine();
              } catch (IllegalArgumentException e) {
                  System.out.println(e.getMessage());
              }
          }

          System.out.print("Por favor, digite o número da conta: ");
          conta.setNumeroConta(scanner.nextLine());

          while (true) {
              try {
                  System.out.print("Por favor, digite o nome do cliente: ");
                  String nomeCliente = scanner.nextLine();
                  conta.setNomeCliente(nomeCliente);
                  break;
              } catch (IllegalArgumentException e) {
                  System.out.println(e.getMessage());
              }
          }

          while (true) {
              try {
                  System.out.print("Por favor, digite o saldo da conta: ");
                  conta.setSaldo(scanner.nextDouble());
                  break;
              } catch (InputMismatchException e) {
                  System.out.println("Entrada inválida. Por favor, digite um número para o saldo.");
                  scanner.nextLine();
              } catch (IllegalArgumentException e) {
                  System.out.println(e.getMessage());
              }
          }

          System.out.println(conta);
          System.out.println("\n----------------------------------------------------------");
    }
}