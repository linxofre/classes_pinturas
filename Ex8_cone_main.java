package exercicio8_pintura_classes;

import java.util.Scanner;

public class Ex8_cone_main {

	public static void main(String[] args) {
		/* Crie um sistema que calcule a área a ser 
		 * pintada em um cone, litros gastos, latas 
		 * compradas (arredonde esse valor para o 
		 * inteiro superior) e valor total.*/
		
		Scanner entrada = new Scanner(System.in);
		
		double z = 0;
		double r = 0;
		int tipo = 0;
		
		System.out.println("Informe o tipo da tinta: ");
		tipo = entrada.nextInt();
		System.out.println("Informe o raio(R): ");
		r = entrada.nextDouble();
		System.out.println("Informe a altura(Z): ");
		z = entrada.nextDouble();
		
		
		while ((tipo!=1)&&(tipo!=2)&&(tipo!=3)){
				System.out.println("escolha um tipo correto de tintas (1, 2 ou 3)");
				System.out.println("Informe o tipo da tinta: ");
				tipo = entrada.nextInt();
		}
		while (z <= 0){
			System.out.println("altura incorreta");
			System.out.println("Informe a altura(Z): ");
			z = entrada.nextDouble();
		}
		while (r <= 0){
			System.out.println("raio incorreto");
			System.out.println("Informe o raio(R): ");
			r = entrada.nextDouble();
		}
		entrada.close();
		Ex8_cone area_cone = new Ex8_cone();
		
		area_cone.setAltura(z);
		area_cone.setRaio(r);
		area_cone.setTipo(tipo);
		
		area_cone.area_fundo_cone();
		area_cone.valor_geratriz();
		area_cone.areaLateral_cone();
		area_cone.totalLitros();
		area_cone.latas_total_cone();
		area_cone.totalValor();
		
		System.out.println("CONE");
		System.out.println("----------------");
		System.out.println("Raio: "+r);
		System.out.println("Altura: "+z);
		System.out.println("Tipo da tinta: "+tipo);
		System.out.println("----------------");
		System.out.println("Geratriz: "+area_cone.geratriz);
		System.out.println("----------------");
		System.out.println("Área do Fundo: "+area_cone.f_cone);
		System.out.println("Área Lateral do Cone: "+area_cone.area_lateral_cone);
		System.out.println("Área Total: "+(area_cone.f_cone + area_cone.area_lateral_cone));
		System.out.println("---------------");
		System.out.println("Litros: "+area_cone.litros_tinta * 3.45);
	
		System.out.println("Latas: "+Math.ceil(((area_cone.litros_tinta) * 3.45) / 18));
		System.out.println("----------------");
		System.out.println("Preço total: "+area_cone.total_preco);
	}

}
