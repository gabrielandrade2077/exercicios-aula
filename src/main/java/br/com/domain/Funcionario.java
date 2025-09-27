package br.com.domain;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(String nome, String matricula, Double salarioBase){
        this.nome=nome;
        this.matricula=matricula;
        this.salarioBase=salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //metodo para ser implementado nas subclasses
    public abstract double calcularSalario();

    //metodo abstrato deve ser implementado pelas subclasses
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario base: " + salarioBase);

        System.out.println("Salario final R$: "+ calcularSalario());

    }
}
