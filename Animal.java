public class Animal {
	private String nome;
	private String tipo;
	private boolean emitirSom;
		
	public Animal (String n, String t, boolean e){
		this.nome = n;
		this.tipo = t;
		this.emitirSom = e;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public void emitirSom() {
		this.emitirSom = true;
	}
}
