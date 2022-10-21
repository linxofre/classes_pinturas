package exercicio8_pintura_classes;

import java.math.*;

public class Ex8_cone {

		final double PI = 3.14;
		final double rendimento = 3.45;
		
		double litros_tinta = 0;
		double total_latas = 0;
		int tipo = 0;
		double total_preco = 0;
		double raio = 0;
		double area_total_cone = 0;

		double altura = 0;
		double f_cone = 0;
		double geratriz = 0;
		double area_lateral_cone = 0;
		double total_litros = 0;
		double litros_arredondados = 0;
		
		//método que calcula o fundo do cone
		public double area_fundo_cone () {
			return f_cone = raio * raio * PI;
		}
		 //método que calcula a geratriz
		public double valor_geratriz() {
			return geratriz = Math.sqrt((altura * altura) + (raio * raio));
		}
		//método que calcula a área total do cone
		public double areaLateral_cone(){
			return area_lateral_cone = geratriz*(PI * raio);
		}
		public double totalCone(){
			return area_total_cone = area_lateral_cone + f_cone;
		}
		/*método que mostra a quantidade de 
		 * tinta que será necessária para pintar 
		 * toda área interna do cone*/
		public double totalLitros() {
			litros_tinta = f_cone + area_lateral_cone;
			return litros_tinta;
		}
		public double latas_total_cone() {
			total_latas = Math.ceil(litros_tinta / 18);
			return total_latas;
		}
		/*metódo para calcular o valor 
		 * gasto e a quantidade de tinta*/
		public double totalValor() {
			if (tipo == 1){
				total_preco = total_latas * 238.9; 
			}else if (tipo == 2){
				total_preco = total_latas * 467.98; 
			}else if (tipo == 3){
				total_preco = total_latas * 758.34;
			}
			return total_preco;	
		}
		public double getLitros_tinta() {
			return litros_tinta;
		}
		public void setLitros_tinta(double litros_tinta) {
			this.litros_tinta = litros_tinta;
		}
		public double getTotal_latas() {
			return total_latas;
		}
		public void setTotal_latas(double total_latas) {
			this.total_latas = total_latas;
		}
		public int getTipo() {
			return tipo;
		}
		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		public double getTotal_preco() {
			return total_preco;
		}
		public void setTotal_preco(double total_preco) {
			this.total_preco = total_preco;
		}
		public double getRaio() {
			return raio;
		}
		public void setRaio(double raio) {
			this.raio = raio;
		}
		public double getArea_total_cone() {
			return area_total_cone;
		}
		public void setArea_total_cone(double area_total_cone) {
			this.area_total_cone = area_total_cone;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getF_cone() {
			return f_cone;
		}
		public void setF_cone(double f_cone) {
			this.f_cone = f_cone;
		}
		public double getGeratriz() {
			return geratriz;
		}
		public void setGeratriz(double geratriz) {
			this.geratriz = geratriz;
		}
		public double getArea_lateral_cone() {
			return area_lateral_cone;
		}
		public void setArea_lateral_cone(double area_lateral_cone) {
			this.area_lateral_cone = area_lateral_cone;
		}
		public double getTotal_litros() {
			return total_litros;
		}
		public void setTotal_litros(double total_litros) {
			this.total_litros = total_litros;
		}
		public double getPI() {
			return PI;
		}
		public double getRendimento() {
			return rendimento;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Ex8_cone [PI=");
			builder.append(PI);
			builder.append(", rendimento=");
			builder.append(rendimento);
			builder.append(", litros_tinta=");
			builder.append(litros_tinta);
			builder.append(", total_latas=");
			builder.append(total_latas);
			builder.append(", tipo=");
			builder.append(tipo);
			builder.append(", total_preco=");
			builder.append(total_preco);
			builder.append(", raio=");
			builder.append(raio);
			builder.append(", area_total_cone=");
			builder.append(area_total_cone);
			builder.append(", altura=");
			builder.append(altura);
			builder.append(", f_cone=");
			builder.append(f_cone);
			builder.append(", geratriz=");
			builder.append(geratriz);
			builder.append(", area_lateral_cone=");
			builder.append(area_lateral_cone);
			builder.append(", total_litros=");
			builder.append(total_litros);
			builder.append(", area_fundo_cone()=");
			builder.append(area_fundo_cone());
			builder.append(", valor_geratriz()=");
			builder.append(valor_geratriz());
			builder.append(", areaLateral_cone()=");
			builder.append(areaLateral_cone());
			builder.append(", totalCone()=");
			builder.append(totalCone());
			builder.append(", totalLitros()=");
			builder.append(totalLitros());
			builder.append(", totalLatas()=");
			
			builder.append(", totalValor()=");
			builder.append(totalValor());
			builder.append(", getLitros_tinta()=");
			builder.append(getLitros_tinta());
			builder.append(", getTotal_latas()=");
			builder.append(getTotal_latas());
			builder.append(", getTipo()=");
			builder.append(getTipo());
			builder.append(", getTotal_preco()=");
			builder.append(getTotal_preco());
			builder.append(", getRaio()=");
			builder.append(getRaio());
			builder.append(", getArea_total_cone()=");
			builder.append(getArea_total_cone());
			builder.append(", getAltura()=");
			builder.append(getAltura());
			builder.append(", getF_cone()=");
			builder.append(getF_cone());
			builder.append(", getGeratriz()=");
			builder.append(getGeratriz());
			builder.append(", getArea_lateral_cone()=");
			builder.append(getArea_lateral_cone());
			builder.append(", getTotal_litros()=");
			builder.append(getTotal_litros());
			builder.append(", getPI()=");
			builder.append(getPI());
			builder.append(", getRendimento()=");
			builder.append(getRendimento());
			builder.append(", getClass()=");
			builder.append(getClass());
			builder.append(", hashCode()=");
			builder.append(hashCode());
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}		
}
