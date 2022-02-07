public class PessoaJuridica extends Contribuinte{

    private double rendaJuridica;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, PessoaFisica[] fisica, PessoaJuridica[] juridica) {
        super(nome, fisica, juridica);
    }


    public double getRendaJuridica() {
        return rendaJuridica;
    }

    public void setRendaJuridica(double rendaJuridica) {

        this.rendaJuridica = rendaJuridica;
    }

    public double impostoJuridica(){

        double imposto = (this.getRendaJuridica() * 0.1) + this.getRendaJuridica();
        return imposto;
    }

    @Override
    public String toString() {
        return "Nome='" + this.getNome() + "\n" +
                "Valor do imposto: " + this.impostoJuridica() + "\n";
    }
}
