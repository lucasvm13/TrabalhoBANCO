package Tabuleiro;

import Jogador.Jogador;
import Noticias.MainNoticias;
import Noticias.Noticia;

public class MainTabuleiro {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro();
		
		// NOME IMOVEL, VALOR IMOVEL,ALUGUEL IMOVEL, TIPOCONSTRUCAO, ALUGUEL CONSTRUCAO,
		// IMPOSTO CONSTRUCAO
		
		Imovel imovel1 = new Imovel("Leblon", 20000);
		Imovel imovel2 = new Imovel("Avenida Presidente Vargas", 30000);
		
		Imovel imovel3 = new Imovel("Avenida Brigadeiro Faria Lima", 30000);
		Imovel imovel4 = new Imovel("Avenida 9 de Julho", 25000);
		
		Imovel imovel5 = new Imovel("Copacabana", 60000);
		Imovel imovel6 = new Imovel("Ipanema", 55000);
				
		Imovel imovel7 = new Imovel("Avenida Europa", 450000);
		Imovel imovel8 = new Imovel("Rua Augusta", 40000);
		
		Imovel imovel9 = new Imovel("Morumbi", 100000);
		Imovel imovel10 = new Imovel("Interlagos", 75000);
		
		Imovel imovel11 = new Imovel("Av. Brasil", 50000);
		Imovel imovel12 = new Imovel("Jardim Europa", 55000);
		
		Imovel imovel13 = new Imovel("Jardim Paulista", 45000);
		Imovel imovel14 = new Imovel("Brooklin", 50000);
		

		// INSERE OS IMOVEIS E AS NOTICIAS NO TABULEIRO
		tabuleiro.InsereInicioImovel(imovel1);
		tabuleiro.InsereInicioNoticia(null);
		tabuleiro.InsereInicioImovel(imovel2);
		tabuleiro.InsereInicioImovel(imovel3);
		tabuleiro.InsereInicioImovel(imovel4);
		tabuleiro.InsereInicioNoticia(null);
		tabuleiro.InsereInicioImovel(imovel5);
		tabuleiro.InsereInicioImovel(imovel6);
		tabuleiro.InsereInicioImovel(imovel7);
		tabuleiro.InsereInicioNoticia(null);
		tabuleiro.InsereInicioImovel(imovel8);
		tabuleiro.InsereInicioImovel(imovel9);
		tabuleiro.InsereInicioImovel(imovel10);
		tabuleiro.InsereInicioNoticia(null);
		tabuleiro.InsereInicioImovel(imovel11);
		tabuleiro.InsereInicioImovel(imovel12);
		tabuleiro.InsereInicioImovel(imovel13);
		tabuleiro.InsereInicioNoticia(null);
		tabuleiro.InsereInicioImovel(imovel14);

				
		Noticia noticia = new Noticia();
		noticia.empilhaNoticia("Você perdeu 50R$ !");
		noticia.empilhaNoticia("Volte 1 casas !");
		noticia.empilhaNoticia("Você ganhou 200R$ !");
		noticia.empilhaNoticia("Avançe 3 casas !");
		noticia.empilhaNoticia("Você ganhou 50R$ !");
		noticia.empilhaNoticia("Você ganhou 300R$ !");
		noticia.empilhaNoticia("Você foi para a prisão !");
		noticia.empilhaNoticia("Você perdeu 300R$ !");
		noticia.empilhaNoticia("Volte 2 casas !");
		noticia.empilhaNoticia("Você perdeu 200R$ !");
		noticia.empilhaNoticia("Volte ganhou um vale saída da prisão !");
		noticia.empilhaNoticia("Avançe 2 casas !");
		noticia.empilhaNoticia("Você ganhou 100R$ !");
		noticia.empilhaNoticia("Avançe 1 casas !");
		noticia.empilhaNoticia("Volte 3 casas !");
		noticia.empilhaNoticia("Você perdeu 100R$ !");
	
		/*if(tabuleiro.inicio.proximo.valor=="[Retire uma Noticia]") {
			noticia.desempilhaNoticia();
		}*/

		/*while (!tabuleiro.Vazio()) {
			System.out.println(tabuleiro.RetiraInicio());
			System.out.println("");
			
		}*/
		
		
		Jogador j1 = new Jogador("Lucas");
		tabuleiro.InsereInicioJogador(j1);;
		System.out.println(tabuleiro.fim.proximo.valor);
		System.out.println(imovel1.nomeImovel);
	}
}
