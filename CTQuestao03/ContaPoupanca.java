package CTQuestao03;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String nomeTitular, String cpfTitular){
        super(numero, nomeTitular, cpfTitular);
    }

    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
    }

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