package util;

public class Aresta {
	private float peso;
	private Vertice v;
	private Vertice u;
	
	public Aresta(Vertice v, Vertice u, float peso) {
		this.peso = peso;
		this.v = v;
		this.u = u;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Vertice getOrigem() {
		return v;
	}
	public void setOrigem(Vertice v) {
		this.v = v;
	}
	public Vertice getDestino() {
		return u;
	}
	public void setDestino(Vertice u) {
		this.u = u;
	}
}
