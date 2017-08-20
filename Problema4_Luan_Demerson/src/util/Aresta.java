package util;

public class Aresta {
	private float peso;
	private Vertice v;
	private Vertice u;
	
	public Aresta(float peso, Vertice v, Vertice u) {
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
	public Vertice getV() {
		return v;
	}
	public void setV(Vertice v) {
		this.v = v;
	}
	public Vertice getU() {
		return u;
	}
	public void setU(Vertice u) {
		this.u = u;
	}
}
