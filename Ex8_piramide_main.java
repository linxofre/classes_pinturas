package exercicio8_pintura_classes;

import java.util.Scanner;

public class Ex8_piramide_main {

	public static void main(String[] args) {
		/* Crie um sistema que calcule a área a ser 
		 * pintada em um cubo, litros de tinta gastos,
		 * latas compradas (arredondando o valor para o
		 * inteiro superior) e valor total*/
		
		Scanner entrada = new Scanner(System.in);
		
		double h = 0;
		double ab = 0;
		int type_tinta = 0;
		
		System.out.println("Informe o tipo da tinta: ");
		type_tinta = entrada.nextInt();
		System.out.println("Informe a altura(h): ");
		h = entrada.nextDouble();
		System.out.println("Informe o area base do triângulo (ab): ");
		ab = entrada.nextDouble();
		
		
		while ((type_tinta!=1)&&(type_tinta!=2)&&(type_tinta!=3)){
			System.out.println("escolha um tipo correto de tintas (1, 2 ou 3)");
			System.out.println("Informe o tipo da tinta: ");
			type_tinta = entrada.nextInt();
		}
		while (h <= 0){
			System.out.println("altura precisa ser maior que zero");
			System.out.println("Informe o altura(h): ");
			h = entrada.nextDouble();
		}
		while (ab <= 0){
			System.out.println("área base precisa ser maior que zero");
			System.out.println("Informe o area base do triângulo (ab): ");
			ab = entrada.nextDouble();
		}
		
		entrada.close();
		
		Ex8_piramide areaPiramide = new Ex8_piramide();
		
		areaPiramide.setAltura_p(h);
		areaPiramide.setAb_piramide(ab);
		areaPiramide.setTipo(type_tinta);
		
		areaPiramide.area_triangulo();
		areaPiramide.lado_piramide();
		areaPiramide.base_piramide();
		areaPiramide.volume_piramide();
		areaPiramide.totalLitros();
		areaPiramide.latas_total();
		areaPiramide.totalValor();
		areaPiramide.area_base_Ab();
		areaPiramide.area_total();
		
		System.out.println("PIRAMIDE");
		System.out.println("-----------------");
		System.out.println("ab: "+ areaPiramide.ab_piramide);
		System.out.println("altura (h): " + areaPiramide.altura_p);
		System.out.println("al: " + areaPiramide.l_piramide);
		System.out.println("Área do Triângulo: "+ areaPiramide.a_piramide);
		System.out.println("Área da Base: " + areaPiramide.b_piramide);
		System.out.println("Área Total: " + areaPiramide.a_base_Ab);
		System.out.println("Tipo de Tinta: " + type_tinta);
		System.out.println("Litros de tinta: " + areaPiramide.litros_tinta);
		System.out.println("Latas de Tinta: "+areaPiramide.total_latas);
		System.out.println("Valor total: "+areaPiramide.total_preco);
		System.out.println("Volume: "+ areaPiramide.v_piramide);
	}

}
