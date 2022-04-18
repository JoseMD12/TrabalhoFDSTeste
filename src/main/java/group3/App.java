package group3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ContaCorrente cc1 = new ContaCorrente("100", "Paula");
        cc1.deposito(50000);
        System.out.println(cc1);
    }
}
