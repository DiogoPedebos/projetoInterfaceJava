package equipamentos.iphone;

import funcoes.aparelhoTelefonico.AparelhoTelefonico;
import funcoes.navegadorNaInternet.NavegadorNaInternet;
import funcoes.reprodutorMusical.ReprodutoMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutoMusical{

	@Override
	public void Tocar() {
		System.out.println("Tocando\n");
		
	}

	@Override
	public void Pausar() {
		System.out.println("Pausado\n");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Musica Selecionada\n");
		
	}

	@Override
	public void ExibirPagina() {
		System.out.println("Pagina Exibida\n");
		
	}

	@Override
	public void AdicionarNovaAba() {
		System.out.println("Nova Aba Adicionada\n");
		
	}

	@Override
	public void AtualizarPagina() {
		System.out.println("Pagina Atualizada\n");
		
	}

	@Override
	public void Ligar() {
		System.out.println("Ligando\n");
		
	}

	@Override
	public void Atender() {
		System.out.println("Atendendo\n");
		
	}

	@Override
	public void IniciarCorreioVoz() {
		System.out.println("Correio De Voz Iniciado\n");
		
	}

}
