import java.util.Scanner;

public class Aplicativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Contribuinte cont = new Contribuinte();
        System.out.print("Entre com tipo de contribuinte: ");
        String nome = scan.nextLine();


        PessoaJuridica[] pj = new PessoaJuridica[3];
        for (int i = 0; i < pj.length; i++){
            System.out.print("Entre com o nome da empresa: ");
            String nomeEmp = scan.nextLine();

            System.out.print("Entre com renda: ");
            double rendaJur = scan.nextDouble();
            scan.nextLine();

            PessoaJuridica pessoaJur = new PessoaJuridica();
            pessoaJur.setNome(nomeEmp);
            pessoaJur.setRendaJuridica(rendaJur);
            pj[i] = pessoaJur;

        }

        System.out.print("Entre com tipo de contribuinte: ");
        String nome1 = scan.nextLine();

        PessoaFisica[] pf = new PessoaFisica[3];
        for (int i = 0; i<pf.length; i++){
            System.out.print("Entre com o nome da pessoa: ");
            String nomePes = scan.nextLine();

            System.out.print("Entre com renda: ");
            double rendaPes = scan.nextDouble();
            scan.nextLine();

            PessoaFisica pessoaFis = new PessoaFisica();
            pessoaFis.setNome(nomePes);
            pessoaFis.setRendaFisica(rendaPes);
            pf[i] = pessoaFis;
        }

        cont.setNome(nome);
        cont.setJuridica(pj);
        cont.setNome(nome1);
        cont.setFisica(pf);
        System.out.println(cont);


    }
}
