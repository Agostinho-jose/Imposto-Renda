public class Contribuinte {

    private String nome;
    private PessoaFisica[] fisica;
    private PessoaJuridica[] juridica;

    public Contribuinte() {
    }

    public Contribuinte(String nome, PessoaFisica[] fisica, PessoaJuridica[] juridica) {
        this.nome = nome;
        this.fisica = fisica;
        this.juridica = juridica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PessoaFisica[] getFisica() {
        return fisica;
    }

    public void setFisica(PessoaFisica[] fisica) {
        this.fisica = fisica;
    }

    public PessoaJuridica[] getJuridica() {
        return juridica;
    }

    public void setJuridica(PessoaJuridica[] juridica) {
        this.juridica = juridica;
    }

    @Override
    public String toString() {

        String s = "Nome='" + this.getNome() + "\n";

       for(PessoaFisica pf : fisica){
            s += pf.toString() + "\n";
        }

        for(PessoaJuridica pj : juridica){
            s += pj.toString();
        }
        return s;
    }
}
