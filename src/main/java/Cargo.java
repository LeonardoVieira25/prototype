public class Cargo implements Cloneable {
    private String nome;
    private Integer salario;

    public Cargo(String nome, Integer salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public Cargo clone() throws CloneNotSupportedException {
        Cargo cargoClone = (Cargo) super.clone();
        return cargoClone;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
