/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.DecimalFormat;
import utilitarios.Calculadora;

/**
 *
 * @author Marcus
 */
public class Controle {
    private Calculadora calc;
    
    /*private int 
    idadeAtual, 
    idadeEntradaEscola,
    horasPorDia, 
    horasPorMes, 
    horasPorAno, 
    horasEscolaresTotais, 
    horasTrabalhadorBr;
    
    valorInvestidoTotal, 
    valorDeReposicao, 
    salarioMinimo, 
    salarioMinimoPorHora;*/
    
    public Controle(){
        calc = new Calculadora();        
    }
    DecimalFormat df = new DecimalFormat("###.##");
    
    public void setIdadeAtual(String idadeAtual){
        calc.setIdadeAtual(Integer.parseInt(idadeAtual));
    }
    
    public void setIdadeEntradaEscola(String idadeEntrada){
        calc.setIdadeEntradaEscola(Integer.parseInt(idadeEntrada));
    }
    
    public void setIdadeComecouTrabalhar(String idadeComecouTrabalhar){
        calc.setIdadeComecouTrabalhar(Integer.parseInt(idadeComecouTrabalhar));
    }
    
    public String getIdadeAtual(){
        return String.valueOf(calc.getIdadeAtual());
    }
    
    public String getIdadeEntradaEscola(){
        return String.valueOf(calc.getIdadeEntradaEscola());
    }
    
    public String getIdadeComecouTrabalhar() {
        return String.valueOf(calc.getIdadeComecouTrabalhar());
    }
    
    public String getHorasPorDia(){
        return String.valueOf(calc.getHorasPorDia());
    }
    
    public String getHorasPorMes(){
        return String.valueOf(calc.getHorasPorMes());
    }
    
    public String getHorasPorAno(){
        return String.valueOf(calc.getHorasPorAno());
    }
    
    public String getHorasEscolaresTotais(){
        return String.valueOf(calc.getHorasEscolaresTotais());
    }
    
    public String getHorasTrabalhadorBr() {        
        return String.valueOf(calc.getHorasTrabalhadorBr());
    }
    
    public String getSalarioMinimo() {
        return "R$ " + df.format(calc.getSalarioMinimo());
    }
    
    public String getSalarioMinimoPorHora() {
        return "R$ " + df.format(calc.getSalarioMinimoPorHora());
    }

    public String getValorInvestidoTotal() {
        return "R$ " + df.format(calc.getValorInvestidoTotal());
    }

    public String getValorDeReposicao() {
        return "R$ " + df.format(calc.getValorDeReposicao());
    }
    
    public String getValorMensalReposicao() {        
        return "R$ " + df.format(calc.getValorMensalReposicao());
    }
        
}