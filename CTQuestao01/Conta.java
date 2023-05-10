package CTQuestao01;

// Questao01:

public abstract class Conta {
    private int numero;
    private String nomeTitular;
    protected double saldo;


    public Conta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nomeTitular){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        saldo = 0;
    }

    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
    }

    public abstract boolean sacar(double valor);


    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }


}