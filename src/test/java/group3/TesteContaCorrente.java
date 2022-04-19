package group3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TesteContaCorrente {

    @Test
    public void deposita5(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        boolean aux = cc.deposito(5);
        assertEquals(false, aux);
    }

    @Test
    public void deposito500Silver(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        boolean aux = cc.deposito(500);
        assertEquals(500, cc.getSaldo());
    }

    @Test
    public void deposito3Gold(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        cc.deposito(200000);
        cc.deposito(500);
        assertEquals(200505, cc.getSaldo());
    }

    @Test
    public void deposito500Platinum(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        cc.deposito(50000);
        cc.deposito(200000);
        cc.deposito(500);
        assertEquals(252512.5, cc.getSaldo());
    }

    @Test
    public void depositoAtualizaGold(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        cc.deposito(50000);
        assertEquals("Gold", cc.getCategoria());
    }

    @Test
    public void depositoAtualizaPlatinum(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        cc.deposito(50000);
        cc.deposito(200000);
        assertEquals("Platinum", cc.getCategoria());
    }

    @Test
    public void retirada5(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        boolean aux = cc.retirada(5);
        assertEquals(false, aux);
    }

    @Test
    public void retirada3Negativo(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        boolean aux = cc.retirada(-3);
        assertEquals(false, aux);
    }

    @Test
    public void retirada600de1000(){
        ContaCorrente cc = new ContaCorrente("10", "Sandro");
        cc.deposito(1000);
        cc.retirada(600);
        assertEquals(400, cc.getSaldo());
    }   
}
