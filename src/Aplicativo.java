import java.util.Scanner;

public class Aplicativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Contribuinte cont = new Contribuinte();
        System.out.println("***MENU***");
        System.out.println("Digite o tipo de contribuinte: 1 - PESSOA FISICA: ");
        System.out.println("Digite o tipo de contribuinte: 2 - PESSOA JURIDICA: ");
        int num = scan.nextInt();
        scan.nextLine();

        if(num == 1){

            System.out.println("***PESSOA FISICA***");

            System.out.println("Digite a quantidade de pessoas: ");
            int qtd = scan.nextInt();

            PessoaFisica[] pf = new PessoaFisica[qtd];
            scan.nextLine();
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

            cont.setFisica(pf);
            System.out.println(cont.infoFisica());

        } else if (num == 2){

            System.out.println("***PESSOA JURIDICA***");

            System.out.println("Digite a quantidade de pessoas: ");
            int qtd = scan.nextInt();

            PessoaJuridica[] pj = new PessoaJuridica[qtd];
            scan.nextLine();
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

            cont.setJuridica(pj);
            System.out.println(cont);
        } else {
            System.out.print("OPÇÃO INDIPONÍVEL");
        }
    }
}
