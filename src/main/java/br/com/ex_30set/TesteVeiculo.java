package br.com.ex_30set;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true,false),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true,true),
                new Carro("Fiat","Fastback",2025,4,true,true),
                new Onibus("Marcopolo Torino","Mercedes-Benz OF-1721",2018,2,60,false)
        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);
            System.out.println("!Transito intenso!");
            veiculo.frear(30);
            System.out.println("---");

        }

    }
}
