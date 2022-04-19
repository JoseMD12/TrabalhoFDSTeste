package group3;

public class Funcionario {

    // classe do exercicio 6

    // atributos da classe Funcionario
    private double salarioBruto;
    private double inss;
    private double irpf;
    private double salarioLiquido;


    // construtor da classe Funcionario
    public Funcionario(double salarioBruto) throws IllegalArgumentException {
        this.salarioBruto = salarioBruto;

        // salario <= 5k, então o INSS = 4,5%
        if(this.salarioBruto <= 5000){
            this.inss = 4.5;

        // no exercicio não diz, mas coloquei INSS 0% para salario acima de 5k
        }else {
            this.inss = 0; 
        }

        // salario >= 2,5k, então o IRPF = 12%
        if(this.salarioBruto > 2500){
            this.irpf = 12;

        // no exercicio não diz, mas coloquei IRPF 0% para salario abaixo de 2,5k
        } else {
            this.irpf = 0;
        }

        // calculo: salarioLiquilido = salarioBruto - (inss + irpf)
        this.salarioLiquido = this.salarioBruto - ((salarioBruto * (this.inss/100)) + (salarioBruto * (this.irpf/100)));
    }



    // getters da classe Funcionario
    public double getSalarioBruto(){
        return this.salarioBruto;
    }
    public double getINSS(){
        return this.inss;
    }
    public double getIRPF(){
        return this.irpf;
    }
    public double getSalarioLiquido(){
        return this.salarioLiquido;
    }


    // toString da classe
    public String toString(){
        return "Funcionario [salarioBruto = R$" + this.salarioBruto + ", INSS = " + this.inss + "%, IRPF = " +
        this.irpf + "%, salarioLiquido = R$" + this.salarioLiquido + "]";
    }
}
