package br.com.dio.exception;

public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException() {
		super("O segundo parâmetro deve ser maior que o primeiro.\n");
	}
}
