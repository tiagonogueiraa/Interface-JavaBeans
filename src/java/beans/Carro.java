/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author aluno
 */
public class Carro {
    
    private String placa;
    private String nome;
    private String marca;
    private String modelo;
    private double preco;
    private double valorDiariaAluguel;
    private double diasLocacao;
    private boolean situacao = false;

    public Carro() {
    }

    public Carro(String placa, String nome, String marca, String modelo, double preco, double valorDiariaAluguel, double diasLocacao) {
        this.placa = placa;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.valorDiariaAluguel = valorDiariaAluguel;
        this.diasLocacao = diasLocacao;
    }

    public double valorMulta( double diasAlocado){
        double multa = 0;
        if(diasAlocado > getDiasLocacao())
        {
            multa = (0.07 * getValorDiariaAluguel() ) * ( diasAlocado-getDiasLocacao());
            
        }
        return multa;       
    }
    
    public double valorAluguel(double diasAlocado){
     
        double valor = (getValorDiariaAluguel()*getDiasLocacao() + valorMulta(diasAlocado));
        return valor;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorDiariaAluguel() {
        return valorDiariaAluguel;
    }

    public void setValorDiariaAluguel(double valorDiariaAluguel) {
        this.valorDiariaAluguel = valorDiariaAluguel;
    }

    public double getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(double diasLocacao) {
        this.diasLocacao = diasLocacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    
    
    
}
