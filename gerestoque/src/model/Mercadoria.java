package model;

import java.util.Date;


public abstract class Mercadoria {
	
	//Usando encapsulamento protected porque private nao dá acesso para as outras classes
	protected String nome;
	protected int quantidade;
	protected double valor;
	protected String codigoMercadoria;
	protected String descricao;
	protected Date dataValidade;
	protected String fornecedor;
	
		public Mercadoria() {
			super();
		}
		
	//Metodos autogerados:
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public String getCodigo() {
			return codigoMercadoria;
		}
		public void setCodigo(String codigo) {
			this.codigoMercadoria = codigo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Date getDataValidade() {
			return dataValidade;
		}
		public void setDataValidade(Date dataValidade) {
			this.dataValidade = dataValidade;
		}
		public String getFornecedor() {
			return fornecedor;
		}
		public void setFornecedor(String fornecedor) {
			this.fornecedor = fornecedor;
		}
		
		@Override
		public String toString() {
			return "Mercadoria [nome=" + nome + ", quantidade=" + quantidade 
					+ ", valor=" + valor + ", codigo=" + codigoMercadoria
					+ ", descricao=" + descricao + ", dataValidade=" + dataValidade 
					+ ", fornecedor=" + fornecedor
					+ "]";
		}
}




