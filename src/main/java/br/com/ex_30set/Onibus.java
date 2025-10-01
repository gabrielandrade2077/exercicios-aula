package br.com.ex_30set;

public class Onibus extends Veiculo {
    private int numeroPortas;
    private int maximoDePassageiros;
    private boolean arCondicionado;

    public Onibus(String marca, String modelo, int ano, int numeroPortas, int maximoDePassageiros, boolean arCondicionado) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.maximoDePassageiros = maximoDePassageiros;
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + numeroPortas);
        System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
        System.out.println("Maximo de passageiros: " + maximoDePassageiros);
    }
}