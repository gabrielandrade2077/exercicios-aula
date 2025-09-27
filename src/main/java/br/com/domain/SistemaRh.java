package br.com.domain;

public class SistemaRh {
    public static void main(String[] args) {
        //criando funcionarios - polimorfismo
        Funcionario[] funcionarios = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor("Ana", "DEV001", 5000, 50, 145.0);
        dev.registarHoraExtra(10);
        funcionarios[0] = dev;

        Gerente gerente = new Gerente("Carlos", "GER001", 8000);
        gerente.setbonusPerformance(1000);
        gerente.setcomissao(500);
        funcionarios[1] = gerente;

        Estagiario estagiario = new Estagiario("Pedro","EST001",15.00);
    estagiario.registrarHoras(35);
    funcionarios[2]=estagiario;

    }

}
