package group3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TesteFuncionario 
{
    @Test
    public void testINSSSalarioInferior2500(){
        Funcionario funcionario = new Funcionario(1500);
        assertEquals(4.5, funcionario.getINSS());
    }

    @Test
    public void testINSSSalarioIgual2500(){
        Funcionario funcionario = new Funcionario(2500);
        assertEquals(4.5, funcionario.getINSS());
    }

    @Test
    public void testINSSSalarioInferiorA5000ESuperiorA2500(){
        Funcionario funcionario = new Funcionario(3500);
        assertEquals(4.5, funcionario.getINSS());
    }
    
    @Test
    public void testINSSsalarioSuperior5000(){
        Funcionario funcionario = new Funcionario(6000);
        assertEquals(0, funcionario.getINSS());
    }

    @Test
    public void testINSSSalarioIgual5000(){
        Funcionario funcionario = new Funcionario(5000);
        assertEquals(4.5, funcionario.getINSS());
    }

    @Test
    public void testImpostoRendaInferior2500(){
        Funcionario funcionario = new Funcionario(1500);
        assertEquals(00, funcionario.getIRPF());
    }



}

