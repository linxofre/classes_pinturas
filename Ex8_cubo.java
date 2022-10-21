package exercicio8_pintura_classes;

//import java.util.Arrays;
import java.math.*;

public class Ex8_cubo {

	int tipo = 0;
	double rendimento = 0;
	double lado = 0;
	
	double a_cubo = 0;
	double v_cubo = 0;
	double d_cubo = 0;
	double b_cubo = 0;
	double litros_tinta = 0;
	double total_latas = 0;
	double total_preco = 0;
	double total_litros = 0;
	double litros_arredondados = 0;
	
	//método para calcular a base
	public double area_base_cubo(){
		return b_cubo = lado * lado;
	}
	
	//método que calcula a área do cubo
	public double area_cubo(){
		return a_cubo = lado * lado;
	}
	
	 //método que calcula o volume do cubo
	public double volume_cubo(){
		return v_cubo = lado * lado *lado;
	}
	
	//método que calcula a diagonal do cubo
	public double diagonal_cubo(){
		return d_cubo = lado * Math.sqrt(3);
	}
	
	/*método que mostra a quantidade de 
	 * tinta que será necessária para pintar 
	 * toda área interna do cubo*/
	public double totalLitros(){
		litros_tinta = (a_cubo * 6 / rendimento);
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
			total_preco = total_latas * 101.9 ; 
		}else if (tipo == 2){
			total_preco = total_latas * 212.45; 
		}else if (tipo == 3){
			total_preco = total_latas * 345.56;
		}
		return total_preco;	
	}
	
	//setters e getters
	
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

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getA_cubo() {
		return a_cubo;
	}

	public void setA_cubo(double a_cubo) {
		this.a_cubo = a_cubo;
	}

	public double getV_cubo() {
		return v_cubo;
	}

	public void setV_cubo(double v_cubo) {
		this.v_cubo = v_cubo;
	}

	public double getD_cubo() {
		return d_cubo;
	}

	public void setD_cubo(double d_cubo) {
		this.d_cubo = d_cubo;
	}

	public double getB_cubo() {
		return b_cubo;
	}

	public void setB_cubo(double b_cubo) {
		this.b_cubo = b_cubo;
	}

	public double getTotal_litros() {
		return total_litros;
	}

	public void setTotal_litros(double total_litros) {
		this.total_litros = total_litros;
	}

	public double getLitros_arredondados() {
		return litros_arredondados;
	}

	public void setLitros_arredondados(double litros_arredondados) {
		this.litros_arredondados = litros_arredondados;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ex8_cubo [tipo=");
		builder.append(tipo);
		builder.append(", rendimento=");
		builder.append(rendimento);
		builder.append(", litros_tinta=");
		builder.append(litros_tinta);
		builder.append(", total_latas=");
		builder.append(total_latas);
		builder.append(", total_preco=");
		builder.append(total_preco);
		builder.append(", lado=");
		builder.append(lado);
		builder.append(", a_cubo=");
		builder.append(a_cubo);
		builder.append(", v_cubo=");
		builder.append(v_cubo);
		builder.append(", d_cubo=");
		builder.append(d_cubo);
		builder.append(", b_cubo=");
		builder.append(b_cubo);
		builder.append(", total_litros=");
		builder.append(total_litros);
		builder.append(", litros_arredondados=");
		builder.append(litros_arredondados);
		builder.append("]");
		return builder.toString();
	}
	
}
