public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d, int m, int a) {
		this.dia = d;
		this.mes = m; 
		this.ano = a;
	}
	
	public int getdia() {
		return dia;
	}
	
	public int getmes() {
		return mes;
	}
	
	public int getano() {
		return ano;
	}
	
	public void setdia(int d) {
		this.dia = d;
	}
	
	public void setmes (int m) {
		this.mes = m;
	}
	
	public void setano(int a) {
		this.ano = a;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}

