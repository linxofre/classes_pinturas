package exercicio8_pintura_classes;

import java.math.*;

public class Ex8_piramide {

	int tipo = 0;
	double rendimento = 4.76;
	double l_piramide = 0;
	double altura_p = 0;
	double v_piramide = 0;
	double a_piramide = 0;
	double ab_piramide = 0;
	double b_piramide = 0;
	double a_total = 0;
	double a_base_Ab = 0;
	double litros_tinta = 0;
	double total_latas = 0;
	double total_preco = 0;
	double total_litros = 0;
	
	//método para calcular o lado da piramide
	public double lado_piramide(){
		return l_piramide = (Math.sqrt((ab_piramide * ab_piramide)+(altura_p * altura_p)));
	}
	
	public double base_piramide(){
		return b_piramide = ((ab_piramide + ab_piramide))*((ab_piramide + ab_piramide));
	}
	 
	public double volume_piramide(){
		return v_piramide = ((b_piramide * altura_p)/3);
	}
	public double area_triangulo(){
		return a_piramide = ((ab_piramide + ab_piramide)*altura_p) /2;
		
	} 
	public double area_base_Ab() {
		return a_base_Ab = (a_piramide + a_piramide)*(a_piramide + a_piramide)  ;
	}
	
	public double area_total() {
		return a_total = a_base_Ab + a_piramide;
	}
	
	/*método que mostra a quantidade de 
	 * tinta que será necessária para pintar 
	 * toda área interna do cubo*/
	public double totalLitros(){
		litros_tinta = (a_piramide * rendimento);
		return litros_tinta;
	}
	public double latas_total() {
		total_latas = Math.ceil(litros_tinta / 18);
		return total_latas;
	}
	
	/*metódo para calcular o valor 
	 * gasto e a quantidade de tinta*/
	public double totalValor(){
		if (tipo == 1){
			total_preco = (total_latas * 127.9) ; 
		}else if (tipo == 2){
			total_preco = (total_latas * 258.98); 
		}else if (tipo == 3){
			total_preco = (total_latas * 344.34);
		}
		return total_preco;	
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getL_piramide() {
		return l_piramide;
	}

	public void setL_piramide(double l_piramide) {
		this.l_piramide = l_piramide;
	}

	public double getAltura_p() {
		return altura_p;
	}

	public void setAltura_p(double altura_p) {
		this.altura_p = altura_p;
	}

	public double getV_piramide() {
		return v_piramide;
	}

	public void setV_piramide(double v_piramide) {
		this.v_piramide = v_piramide;
	}

	public double getA_piramide() {
		return a_piramide;
	}

	public void setA_piramide(double a_piramide) {
		this.a_piramide = a_piramide;
	}

	public double getAb_piramide() {
		return ab_piramide;
	}

	public void setAb_piramide(double ab_piramide) {
		this.ab_piramide = ab_piramide;
	}

	public double getB_piramide() {
		return b_piramide;
	}

	public void setB_piramide(double b_piramide) {
		this.b_piramide = b_piramide;
	}

	public double getA_total() {
		return a_total;
	}

	public void setA_total(double a_total) {
		this.a_total = a_total;
	}

	public double getA_base_Ab() {
		return a_base_Ab;
	}

	public void setA_base_Ab(double a_base_Ab) {
		this.a_base_Ab = a_base_Ab;
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

	public double getTotal_preco() {
		return total_preco;
	}

	public void setTotal_preco(double total_preco) {
		this.total_preco = total_preco;
	}

	public double getTotal_litros() {
		return total_litros;
	}

	public void setTotal_litros(double total_litros) {
		this.total_litros = total_litros;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ex8_piramide [tipo=");
		builder.append(tipo);
		builder.append(", rendimento=");
		builder.append(rendimento);
		builder.append(", l_piramide=");
		builder.append(l_piramide);
		builder.append(", altura_p=");
		builder.append(altura_p);
		builder.append(", v_piramide=");
		builder.append(v_piramide);
		builder.append(", a_piramide=");
		builder.append(a_piramide);
		builder.append(", ab_piramide=");
		builder.append(ab_piramide);
		builder.append(", b_piramide=");
		builder.append(b_piramide);
		builder.append(", a_total=");
		builder.append(a_total);
		builder.append(", a_base_Ab=");
		builder.append(a_base_Ab);
		builder.append(", litros_tinta=");
		builder.append(litros_tinta);
		builder.append(", total_latas=");
		builder.append(total_latas);
		builder.append(", total_preco=");
		builder.append(total_preco);
		builder.append(", total_litros=");
		builder.append(total_litros);
		builder.append(", lado_piramide()=");
		builder.append(lado_piramide());
		builder.append(", base_piramide()=");
		builder.append(base_piramide());
		builder.append(", volume_piramide()=");
		builder.append(volume_piramide());
		builder.append(", area_triangulo()=");
		builder.append(area_triangulo());
		builder.append(", area_base_Ab()=");
		builder.append(area_base_Ab());
		builder.append(", area_total()=");
		builder.append(area_total());
		builder.append(", totalLitros()=");
		builder.append(totalLitros());
		builder.append(", latas_total()=");
		builder.append(latas_total());
		builder.append(", totalValor()=");
		builder.append(totalValor());
		builder.append(", getTipo()=");
		builder.append(getTipo());
		builder.append(", getRendimento()=");
		builder.append(getRendimento());
		builder.append(", getL_piramide()=");
		builder.append(getL_piramide());
		builder.append(", getAltura_p()=");
		builder.append(getAltura_p());
		builder.append(", getV_piramide()=");
		builder.append(getV_piramide());
		builder.append(", getA_piramide()=");
		builder.append(getA_piramide());
		builder.append(", getAb_piramide()=");
		builder.append(getAb_piramide());
		builder.append(", getB_piramide()=");
		builder.append(getB_piramide());
		builder.append(", getA_total()=");
		builder.append(getA_total());
		builder.append(", getA_base_Ab()=");
		builder.append(getA_base_Ab());
		builder.append(", getLitros_tinta()=");
		builder.append(getLitros_tinta());
		builder.append(", getTotal_latas()=");
		builder.append(getTotal_latas());
		builder.append(", getTotal_preco()=");
		builder.append(getTotal_preco());
		builder.append(", getTotal_litros()=");
		builder.append(getTotal_litros());
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
