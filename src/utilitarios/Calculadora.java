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
    private int idadeAtual, idadeEntradaEscola,
            horasPorDia, horasPorMes, horasPorAno, horasEscolaresTotais, horasTrabalhadorBr;
    private double valorInvestidoTotal, valorDeReposicao, salarioMinimo, salarioMinimoPorHora;
    
    
    public int getIdadeAtual() {
        return idadeAtual;
    }

    public int getIdadeEntradaEscola() {
        return idadeEntradaEscola;
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
        return valorInvestidoTotal = getHorasEscolaresTotais() * getSalarioMinimoPorHora();
    }

    public double getValorDeReposicao() {
        valorDeReposicao = getValorInvestidoTotal() / (70 - getIdadeAtual());
        return valorDeReposicao;
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