public class ContaCorrente extends Conta {

    public ContaCorrente(float taxa) {
        super(taxa);
    }
    public ContaCorrente(int dinheiro, float taxa){
        super(dinheiro,taxa);
    }

    @Override
    public int sacar(int dinheiro) {
        if(getDinheiro() >= dinheiro){
            this.dinheiro -= dinheiro;
            return (int)(dinheiro - (dinheiro*getTaxa()));
        }
        return 0;
    }

    @Override
    public void depositar(int dinheiro) {
        dinheiro += dinheiro;
    }
    
}
