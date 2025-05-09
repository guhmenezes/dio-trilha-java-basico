package br.com.dio;

import br.com.dio.interfaces.Iphone;

public class IphoneImpl implements Iphone{

	@Override
	public void exibirPagina(String url) {
		System.out.println("O Iphone está exibindo a página da url: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("O Iphone está adicionando a nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("O Iphone está atualizando a página.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("O Iphone está ligando para o número: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("O Iphone está atendendo a ligação.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("O Iphone está iniciando o correio de voz.");
	}

	@Override
	public void tocar() {
		System.out.println("O Iphone está tocando a música.");
	}

	@Override
	public void pausar() {
		System.out.println("O Iphone está pausando a música.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("O Iphone está selecionando a música: " + musica);
	}

}


