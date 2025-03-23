package br.com.dio;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import br.com.dio.exception.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);
    String osName = System.getProperty("os.name");

    while (true) {
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);

            System.out.println("\nDeseja realizar outra contagem? (S/N)");
            String executaNovamente = scanner.next();
            
            if (!executaNovamente.toUpperCase().equals("S")) {
                break;
            }


        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite números inteiros.\n");
            scanner.nextLine();
        } catch (NoSuchElementException e) {
        	String atalhoEof = System.getProperty("os.name") == null ? "" :
                (System.getProperty("os.name").toLowerCase().startsWith("windows") ? " (Ctrl+Z)" : " (Ctrl+D)");
        	
            System.out.println("Entrada finalizada pelo usuário." + atalhoEof);
            break;
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
            break;
        }
    }

    scanner.close();

	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;

		for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + (i+1) + ": " + (parametroUm+i));
		}
	
	}
}