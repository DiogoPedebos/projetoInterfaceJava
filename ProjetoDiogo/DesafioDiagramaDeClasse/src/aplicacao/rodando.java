package aplicacao;

import equipamentos.iphone.Iphone;

public class rodando {
	public static void main(String[] args) {
		
		Iphone ip = new Iphone();
		
		ip.Tocar();
		ip.Pausar();
		ip.SelecionarMusica();
		ip.ExibirPagina();
		ip.AdicionarNovaAba();
		ip.AtualizarPagina();
		ip.Ligar();
		ip.Atender();
		ip.IniciarCorreioVoz();
		
	}
	
}
