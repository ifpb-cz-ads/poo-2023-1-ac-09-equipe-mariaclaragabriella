package CTQuestao01;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String nomeTitular){
        super(numero, nomeTitular);
    }
    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
    }

    // Questao01:

    @Override
    public boolean sacar(double valor) {
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}