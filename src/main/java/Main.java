
public class Main {
    public static void main(String[] args) {
        Cargo cargoGerente = new Cargo("Gerente", 10000);
        try {
            Funcionario funcionario1 = new Funcionario("123456789", "João", cargoGerente.clone());
            Funcionario funcionario2 = funcionario1.clone();
            funcionario2.setNome("Maria");
            funcionario2.setCpf("987654321");
            funcionario2.getcargo().setNome("Diretor");

            System.out.println("Funcionario 2: " + funcionario2);
            System.out.println("Funcionario 1: " + funcionario1);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
