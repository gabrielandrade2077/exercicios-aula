package br.com.domain;

import org.w3c.dom.ls.LSOutput;

public class Desenvolvedor extends Funcionario {
    private int horasExtras;
    private Double valorHoraExtra;


    public Desenvolvedor(String nome,String matricula, double salarioBase, int horasExtras, double valorHoraExtra ) {
        super(nome,
                matricula,
                salarioBase
        );
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }
public void registarHoraExtra(int horasExtras){
        this.horasExtras +=horasExtras;
}
    @Override
    public double calcularSalario() {
        return salarioBase + (valorHoraExtra * horasExtras);


    }
}
