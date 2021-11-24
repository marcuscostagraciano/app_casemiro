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
    private int idadeAtual, idadeEntradaEscola, idadeComecouTrabalhar,
            horasPorDia, horasPorMes, horasPorAno, horasEscolaresTotais, horasTrabalhadorBr;
    private double valorInvestidoTotal, valorDeReposicao, valorMensalReposicao, salarioMinimo, salarioMinimoPorHora;
    
    
    public int getIdadeAtual() {
        return idadeAtual;
    }

    public int getIdadeEntradaEscola() {
        return idadeEntradaEscola;
    }
    
    public int getIdadeComecouTrabalhar() {
        return idadeComecouTrabalhar;
    }

    public int getHorasPorDia() {
        setHorasPorDia();
        return horasPorDia;
    }

    public int getHorasPorMes() {
        horasPorMes = getHorasPorDia() * 5 * 4;
        return horasPorMes;
    }

    public int getHorasPorAno() {
        horasPorAno = getHorasPorMes() * 12;
        return horasPorAno;
    }

    public int getHorasEscolaresTotais() {
        horasEscolaresTotais = getHorasPorAno() * getIdadeAtual();
        return horasEscolaresTotais;
    }

    public int getHorasTrabalhadorBr() {        
        return horasTrabalhadorBr = 240;
    }

    public double getValorInvestidoTotal() {
        valorInvestidoTotal = getHorasEscolaresTotais() * getSalarioMinimoPorHora();
        return Math.round(valorInvestidoTotal);
    }

    public double getValorDeReposicao() {
        int diffIdades = getIdadeAtual() - getIdadeComecouTrabalhar();
        if (diffIdades <= 0)
            diffIdades = 1;
        
        valorDeReposicao = getValorInvestidoTotal() / (diffIdades);
        return valorDeReposicao;
    }
    
    public double getValorMensalReposicao() {   
        valorMensalReposicao = getValorDeReposicao()/12;
        return valorMensalReposicao;
    }

    public double getSalarioMinimo() {
        return salarioMinimo = 1100;
    }

    public double getSalarioMinimoPorHora() {
        return salarioMinimoPorHora = getSalarioMinimo() / getHorasTrabalhadorBr();
    }

    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }
    
    public void setIdadeComecouTrabalhar(int idadeComecouTrabalhar) {
        this.idadeComecouTrabalhar = idadeComecouTrabalhar;
    }

    public void setIdadeEntradaEscola(int idadeEntradaEscola) {
        this.idadeEntradaEscola = idadeEntradaEscola;
    }

    public void setHorasPorDia() {
        if(idadeEntradaEscola < 6)
            this.horasPorDia = 10;       
        else
            this.horasPorDia = 6;
    }
    
}