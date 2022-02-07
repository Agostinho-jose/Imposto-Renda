public class PessoaFisica extends Contribuinte {

    private double rendaFisica;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, PessoaFisica[] fisica, PessoaJuridica[] juridica) {
        super(nome, fisica, juridica);
    }


    public double getRendaFisica() {
        return rendaFisica;
    }

    public void setRendaFisica(double rendaFisica) {

        this.rendaFisica = rendaFisica;
    }

    public double impostoFisica(){

        if(this.getRendaFisica() <= 1400){
            this.getRendaFisica();
        }
        else if(this.getRendaFisica() > 1400 && this.getRendaFisica() <= 2100){
            this.setRendaFisica(this.getRendaFisica() + (this.getRendaFisica() * 0.1));
        }
        else if(this.getRendaFisica() > 2100 && this.getRendaFisica() <= 2800){
            this.setRendaFisica(this.getRendaFisica() + (this.getRendaFisica() * 0.15));
        }
        else if(this.getRendaFisica() > 2800 && this.getRendaFisica() <= 3600){

            this.setRendaFisica(this.getRendaFisica() + (this.getRendaFisica() * 0.25));
        } else {

            this.setRendaFisica(this.getRendaFisica() + (this.getRendaFisica() * 0.30));
        }
        return this.getRendaFisica();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" +
                "Valor do imposto: " + this.impostoFisica() + "\n";
    }

}
