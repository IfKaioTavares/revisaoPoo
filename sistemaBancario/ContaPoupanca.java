public class ContaPoupanca extends Conta{

    private String senha;
    public ContaPoupanca(float taxa, String senha) {
        super(taxa);
        this.senha = senha;
    }
    public ContaPoupanca(int dinheiro, float taxa, String senha){
        super(dinheiro,taxa);
        this.senha = senha;
    }

    @Override
    public int sacar(int dinheiro) {
        if(getDinheiro() >= (dinheiro - dinheiro*getTaxa())){
            return dinheiro;
        }
        return 0;
    }

    /*private boolean validarSenha(String senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
        //return senha == this.senha? true: false;
    }*/

    @Override
    public void depositar(int dinheiro) {
        dinheiro += dinheiro;
    }
}
