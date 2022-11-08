import entidades.Carro;
import entidades.Corrida;
import entidades.Motorista;
import entidades.Passageiro;
import servicos.CarroServico;
import servicos.CorridaServico;
import servicos.MotoristaServico;

public class Main {
    public static void main(String[] args) {
        CorridaServico corridaServico = new CorridaServico();
        MotoristaServico motoristaServico = new MotoristaServico();

        Carro carro1 = new Carro("ford", "qwe123");
        Motorista motorista1 = new Motorista("agostinho carrara", "789789789");
        motoristaServico.adicionarMotorista(motorista1);
        Corrida corrida1 = new Corrida(motorista1, carro1, "falador", "Varrock", "black");
        corridaServico.adicionarCorrida(corrida1);


        Carro carro2 = new Carro("fiat", "qwe234");
        Motorista motorista2 = new Motorista("ze tonhao", "789789789");
        motoristaServico.adicionarMotorista(motorista2);
        Corrida corrida2 = new Corrida(motorista2, carro2);
        corridaServico.adicionarCorrida(corrida2);


        Carro carro3 = new Carro("chevrolet", "qwe543");
        Motorista motorista3 = new Motorista("ronaldo fenomeno", "789789789");
        motoristaServico.adicionarMotorista(motorista3);
        Corrida corrida3 = new Corrida(motorista3, carro3);
        corridaServico.adicionarCorrida(corrida3);


//        Passageiro passageiro1 = new Passageiro("coringa 1", "123123123");
//        corrida1.setPassageiro(passageiro1);
//
//        Passageiro passageiro2 = new Passageiro("coringa 2", "123123123");
//        corrida2.setPassageiro(passageiro2);
//
//        Passageiro passageiro3 = new Passageiro("coringa 3", "123123123");
//        corrida3.setPassageiro(passageiro3);

//        System.out.println(corridaServico.listarCorridasDisponiveis());
        System.out.println(corridaServico.listarCorridasDisponiveis());
    }
}
