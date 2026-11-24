import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void testeClone() throws CloneNotSupportedException {
        Cargo cargo = new Cargo("Desenvolvedor", 5000);
        Funcionario funcionario1 = new Funcionario("12345678900", "João", cargo);
        Funcionario funcionario2 = funcionario1.clone();

        // Verifica se os objetos são diferentes
        assertNotSame(funcionario1, funcionario2);

        // Verifica se os atributos são iguais
        assertEquals(funcionario1.toString(), funcionario2.toString());
    }

    @Test
    void testeCloneCargo() throws CloneNotSupportedException {
        Cargo cargo = new Cargo("Desenvolvedor", 5000);
        Funcionario funcionario1 = new Funcionario("12345678900", "João", cargo);
        Funcionario funcionario2 = funcionario1.clone();

        funcionario2.getcargo().setNome("Analista");

        assertEquals("Desenvolvedor", funcionario1.getcargo().getNome());
        assertEquals("Analista", funcionario2.getcargo().getNome());

    }

}
