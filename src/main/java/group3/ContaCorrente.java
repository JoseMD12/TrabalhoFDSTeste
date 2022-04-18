package group3;

public class ContaCorrente {

    // classe do exercicio 10

    // atributos da classe ContaCorrente
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;
    private String categoria;

    //construtor da classe ContaCorrente
    public ContaCorrente(String numeroConta, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
        this.categoria = "Silver";
    }




    // getters da classe 
    public String getNumeroConta(){
        return numeroConta;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getCategoria(){
        return categoria;
    }




    public boolean deposito(double valor){
        //retorna falso se o valor for negativo ou menor de R$10.00
        if(valor < 10){
            return false;
        }
        
        // adiciona o novo saldo de acordo com a categoria da conta

        switch(categoria){
            // deposito sem valorização
            case "Silver":
                this.saldo += valor;
                break;

            // 1% de valorização
            case "Gold":
                this.saldo += (valor * 1.01);
                break;

            // 2.5% de valorização
            case "Platinum":
                this.saldo += (valor * 1.025);
                break;

            default:
                this.saldo += saldo;
        }
        
        // Atualiza a categoria do cartao se a marca foi alcançada

        // saldo > 50k = Gold
        if(this.categoria.equalsIgnoreCase("Silver") && this.saldo >= 50000){
            this.categoria = "Gold";

        // saldo > 200k = Platinum
        } else if(this.categoria.equalsIgnoreCase("Gold") && this.saldo >= 200000){
            this.categoria = "Platinum";
        }

        return true;
    }



    public boolean retirada(double valor){
        //retorna falso se o valor for negativo ou menor de R$10.00
        if(valor < 10){
            return false;
        }

        // remove o valor da conta
        this.saldo -= valor;

        // Atualiza a categoria do cartao se a marca foi alcançada

        // saldo < 25k = Silver
        if(this.categoria.equalsIgnoreCase("Gold") && this.saldo <= 25000){
            this.categoria = "Silver";

        // saldo < 100k = Gold
        } else if(this.categoria.equalsIgnoreCase("Platinum") && this.saldo <= 100000){
            this.categoria = "Gold";
        }

        return true;
    }


    //toString da Classe
    @Override
    public String toString(){
        return "Conta Corrente " + this.numeroConta + " [nome = " + this.nomeCorrentista +
        ", categoria da conta = " + this.categoria + ", saldo = R$" + this.saldo + "]";
    }

}
