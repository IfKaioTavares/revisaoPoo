public abstract class Conta implements IOperacoesConta {

    protected int dinheiro;
    private float taxa;

    public Conta(int dinheiro, float taxa){
        this.dinheiro = dinheiro;
        this.taxa = taxa;
    }

    public Conta(float taxa){
        this.taxa = taxa;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public float getTaxa() {
        return taxa;
    }
}
