public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String n, double p, int q) {
		this.nome = n;
		this.preco = p;
		this.quantidade = q;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setPreco(double p) {
		this.preco = p;
	}
	
	public void setQuantidade(int q) {
		this.quantidade = q;
	}
	
	
}
