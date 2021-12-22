/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author Marcus
 */
public class Calculadora {    
        private int idadeAtual, idadeEntradaEscola, idadeComecouTrabalhar, idadeEstudando, 
                idadeParaAposentar, horasPorDia;
    
    private double valorInvestidoTotal, valorDeReposicao, valorMensalReposicao, valorPago,
                   valorRestituir, horasPorMes, horasPorAno, horasEscolaresTotais,
                   salarioMinimo , salarioMinimoPorHora; 

    final int horasTrabalhadorBr = 240;  
    
    // Setters de idade //
    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }

    public void setIdadeEntradaEscola(int idadeEntradaEscola) {
        this.idadeEntradaEscola = idadeEntradaEscola;
        setHorasPorDia(idadeEntradaEscola);
    }
    
    public void setIdadeComecouTrabalhar(int idadeComecouTrabalhar) {
        this.idadeComecouTrabalhar = idadeComecouTrabalhar;
    }
    
    public void setIdadeEstudando(int idadeEstudando){
        this.idadeEstudando = idadeEstudando;
    }

    public void setHorasPorDia(int idade) {
        if(idade < 6) {
            this.horasPorDia = 10; 
        } else {
            this.horasPorDia = 6;}
    }
    
    public void setSalarioMinimo(double salario) {
        this.salarioMinimo = salario;
    }

    // Getters de idades //
    public int getIdadeAtual() {
        return idadeAtual;
    }

    public int getIdadeEntradaEscola() {
        return idadeEntradaEscola;
    }
    
    public int getIdadeComecouTrabalhar() {
        return idadeComecouTrabalhar;
    }
    
    public int getIdadeEstudando(){
        return idadeEstudando;
    }
    
    public int getIdadeParaAposentar(){
        if (getIdadeAtual() < 65){
           idadeParaAposentar = 65 - getIdadeAtual();} 
        else 
            {idadeParaAposentar = 1;}
        
        return idadeParaAposentar;
    }  

    // Getters de horas //
    public int getHorasPorDia() {
        return horasPorDia;
    }

    public double getHorasPorMes() {
        horasPorMes = getHorasPorDia()* 5 * 4.5;
        return horasPorMes;
    }

    public double getHorasPorAno() {
        horasPorAno = getHorasPorMes() * 12;
        return horasPorAno;
    }

    public double getHorasEscolaresTotais() {
        horasEscolaresTotais = getHorasPorAno() * getIdadeEstudando();
        return horasEscolaresTotais;
    }

    public int getHorasTrabalhadorBr() {        
        return horasTrabalhadorBr;
    }  

    // Getter de valores //    
    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public double getSalarioMinimoPorHora() {
        salarioMinimoPorHora = getSalarioMinimo() / getHorasTrabalhadorBr();
        return salarioMinimoPorHora;
    }

    public double getValorInvestidoTotal() {
        valorInvestidoTotal = getHorasEscolaresTotais() * getSalarioMinimoPorHora();
        return Math.round(valorInvestidoTotal);
    }
    
    public double getValorPago(){
        if (getIdadeAtual() == getIdadeComecouTrabalhar()){
            valorPago = 0;} 
        else {
            valorPago = Math.abs((getIdadeAtual() - getIdadeComecouTrabalhar())) * getSalarioMinimo();}
        
        return valorPago;
    }
    
    public double getValorRestituir(){
        valorRestituir = Math.abs(getValorInvestidoTotal() - getValorPago());
        return valorRestituir;
    }

    public double getValorDeReposicao() {
        valorDeReposicao = getValorRestituir() / getIdadeParaAposentar();
        return valorDeReposicao;
    }
    
    public double getValorMensalReposicao() {   
        valorMensalReposicao = getValorDeReposicao()/12;
        return valorMensalReposicao;
    }
}