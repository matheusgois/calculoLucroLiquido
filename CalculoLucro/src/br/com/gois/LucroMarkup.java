package br.com.gois;

import java.util.Scanner;

public class LucroMarkup {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a porcentagem de comissão para o vendedor: ");
		double comVend = scan.nextDouble();
		
		System.out.println("Informe o percentual de lucro sobre o produto: ");
		double lucro = scan.nextDouble();
		
		System.out.println("Informe o preço de custo");
		double precoCusto = scan.nextDouble();
		
		double icms = 18;
		double pis = 4.65;
		double despesas = 6;
		double precoVenda = 100;
		
		double custoTotalVenda = icms + pis + comVend + despesas + lucro;	
		double mkpDivisor = (precoVenda - custoTotalVenda) / 100;
		precoVenda = precoCusto / mkpDivisor;
		double percentCusto = (100 * precoCusto) / precoVenda;
		double valorIcms = (precoVenda * icms) / 100;
		double valorPis = (precoVenda * pis) / 100;
		double valorComissao = (precoVenda * comVend) / 100;
		double valorDespesas = (precoVenda * despesas) / 100;
		
		double lucroLiquido = precoVenda - precoCusto - valorIcms - valorPis - valorComissao - valorDespesas;
		double percentLucro = (lucroLiquido / precoVenda) * 100;
		
		
		System.out.println("Preço Venda = R$"+ Math.ceil(precoVenda) + " ----- " + "100%");
		System.out.println("(-)Preço Custo = R$"+ precoCusto + " ----- " + percentCusto+"%");
		System.out.println("(-)ICMS Venda = R$"+ Math.ceil(valorIcms) + " ----- " + icms+"%");
		System.out.println("(-)Pis/Cofins = R$"+ Math.ceil(valorPis) + " ----- " + pis+"%");
		System.out.println("(-)Comissão Vendedor = R$"+ Math.ceil(valorComissao) + " ----- " + comVend+"%");
		System.out.println("(-)Despesas Administrativas = R$"+ Math.ceil(valorDespesas) + " ----- " + despesas+"%");
		System.out.println("-----------------------------------------------------------");
		System.out.println("(=)Lucro = R$"+ Math.ceil(lucroLiquido) + " ----- " + percentLucro+"%");
		
	
	}

}
