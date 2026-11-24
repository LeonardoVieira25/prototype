public class Funcionario implements Cloneable {
    private String cpf;
    private String nome;
    private Cargo cargo;

    public Funcionario(String cpf, String nome, Cargo cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getcargo() {
        return cargo;
    }

    public void setcargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.cargo = (Cargo) funcionarioClone.cargo.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}
