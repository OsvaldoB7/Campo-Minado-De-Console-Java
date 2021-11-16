package br.com.cm;

import br.com.cm.modelo.Tabuleiro;
import br.com.cm.visao.TabuleiroTerminal;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (6, 6, 6);
		
		new TabuleiroTerminal(tabuleiro);
		
	}

}
