package Tabuleiro;

import Imovel.Imovel;

public class MainTabuleiro {
	
	
	
	public static void main(String[] args) {

		
		TabuleiroLista tabuleiro = new TabuleiroLista();
		
		// NOME IMOVEL, VALOR IMOVEL,ALUGUEL IMOVEL, TIPOCONSTRUCAO, ALUGUEL CONSTRUCAO,
		// IMPOSTO CONSTRUCAO

		Imovel imovelPrisao = new Imovel("Prisão");
		Imovel imovelFim = new Imovel("Fim");
		Imovel imovelInicio = new Imovel("Inicio");
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
		
				
		//INSERE INICIO, FIM E PRISÃO
		tabuleiro.InsereInicioImovel(imovelInicio);
		tabuleiro.InsereImovelNoFim(imovelFim);
		
		// INSERE IMOVEIS E NOTICIAS
		tabuleiro.inserePosImovel(imovel1, 1);
		tabuleiro.inserePosImovel(imovel2, 2);
		tabuleiro.inserePosNoticia(null, 3);
		tabuleiro.inserePosImovel(imovel3, 4);
		tabuleiro.inserePosImovel(imovel4, 5);
		tabuleiro.inserePosNoticia(null, 6);
		tabuleiro.inserePosImovel(imovel5, 7);
		tabuleiro.inserePosImovel(imovel6, 8);
		tabuleiro.inserePosImovel(imovel7, 9);
		tabuleiro.inserePosImovel(imovelPrisao, 10);
		tabuleiro.inserePosNoticia(null, 11);
		tabuleiro.inserePosImovel(imovel8, 12);
		tabuleiro.inserePosImovel(imovel9, 13);
		tabuleiro.inserePosImovel(imovel10, 14);
		tabuleiro.inserePosNoticia(null, 15);
		tabuleiro.inserePosImovel(imovel11, 16);
		tabuleiro.inserePosImovel(imovel12, 17);
		tabuleiro.inserePosImovel(imovel13, 18);
		tabuleiro.inserePosImovel(imovel14, 19);
		tabuleiro.inserePosNoticia(null, 20);
		
		System.out.println("---Tabuleiro---");
		
		/*while (!tabuleiro.Vazio()) {
			System.out.print(tabuleiro.RetiraInicio() + " --> ");
			System.out.print(" ");
		}*/
		System.out.println(" ");
		
		/*System.out.println(tabuleiro.retiraNaPos(2));*/
		/*System.out.println(tabuleiro.mostraImovelPos(2).getNomeImovel());*/
	}
}
