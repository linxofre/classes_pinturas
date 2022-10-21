package exercicio8_pintura_classes;

import java.util.Scanner;

public class Ex8_cubo_main {

	public static void main(String[] args) {
		/* Crie um sistema que calcule a área a ser 
		 * pintada em um cubo, litros de tinta gastos,
		 * latas compradas (arredondando o valor para o
		 * inteiro superior) e valor total*/
		
		Scanner entrada = new Scanner(System.in);
		
		double a = 0;
		double rend = 0;
		int tipo_tinta = 0;
		
		System.out.println("Informe o tipo da tinta: ");
		tipo_tinta = entrada.nextInt();
		System.out.println("Informe o tamanho do lado(metros quadrados): ");
		a = entrada.nextDouble();
		System.out.println("Informe o rendimento da tinta: ");
		rend = entrada.nextDouble();
		
		
		while ((tipo_tinta!=1)&&(tipo_tinta!=2)&&(tipo_tinta!=3)){
				System.out.println("escolha um tipo correto de tintas (1, 2 ou 3)");
				System.out.println("Informe o tipo da tinta: ");
				tipo_tinta = entrada.nextInt();
		}
		while (a <= 0){
			System.out.println("lado incorreto (precisa ser maior que zero)");
			System.out.println("Informe o lado(A): ");
			a = entrada.nextDouble();
		}
		while (rend <= 0){
			System.out.println("rendimento incorreto (precisa ser maior que zero)");
			System.out.println("Informe o rendimento: ");
			rend = entrada.nextDouble();
		}
		
		entrada.close();
		
		Ex8_cubo areaCubo = new Ex8_cubo();
		
		areaCubo.setLado(a);
		areaCubo.setRendimento(rend);
		areaCubo.setTipo(tipo_tinta);
		
		areaCubo.area_base_cubo();
		areaCubo.area_cubo();
		areaCubo.volume_cubo();
		areaCubo.diagonal_cubo();
		areaCubo.totalLitros();
		areaCubo.latas_total();
		areaCubo.totalValor();
		
		System.out.println("CUBO");
		System.out.println("----------------");
		System.out.println("Lado: "+ a);
		System.out.println("Rendimento: "+ rend);
		System.out.println("Tipo da tinta: "+ tipo_tinta);
		System.out.println("----------------");
		System.out.println("Área da Base: "+areaCubo.b_cubo);
		System.out.println("Área Total: "+ (6 * areaCubo.a_cubo));
		System.out.println("Volume: "+areaCubo.v_cubo);
		System.out.println("Diagonal do Cubo: "+ areaCubo.d_cubo);
		System.out.println("Litros de tinta: "+ areaCubo.litros_tinta);
		System.out.println("Latas de Tinta: "+ Math.ceil(areaCubo.total_latas));
		System.out.println("Valor total: "+areaCubo.total_preco);
	}

}
