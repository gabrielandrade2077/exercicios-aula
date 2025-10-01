package br.com.ex30set_2;

public class Lobo extends Animal{
    private String subespecie;
    public Lobo(String nome, int idade, String subespecie) {
        super(nome, idade);
    this.subespecie=subespecie;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Auuu Auuu Auuu");

    }
    @Override
    public void mover() {
        System.out.println(nome + " está correndo!");
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("SubEspecie: " + subespecie);
    }

}
