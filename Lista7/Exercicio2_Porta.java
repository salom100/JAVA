package br.edu.ifcvideira.Lista7;

public class Exercicio2_Porta {
	private boolean estado;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	public void mudaEstado(){
		if (this.isEstado()){
			this.setEstado(false);
		}else{
			this.setEstado(true);
		}
	}
	
	public String retornaEstado(){
		if(this.isEstado()){
			return "Aberta";
		}else{
			return "Fechado";
		}
	}
	
	
}
