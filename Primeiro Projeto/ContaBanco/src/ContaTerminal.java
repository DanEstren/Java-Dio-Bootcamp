import java.util.Scanner;

    public class ContaTerminal {

    private String NomeCliente;
    private String Agencia;
    private int NumeroConta;
    private double Saldo;
    
    public ContaTerminal(String NomeCliente, String Agencia, int NumeroConta, double Saldo){

        this.NomeCliente = NomeCliente;
        this.Agencia = Agencia;
        this.NumeroConta = NumeroConta;
        this.Saldo = Saldo; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal contas = new ContaTerminal(null, null, 0, 0);

        System.out.println("Selecione a opção \n1-MudarNome");

        String NomeCliente = scanner.nextLine();
        contas.mudarNome(NomeCliente);
    }

    void voltarNome(){

        System.out.println(NomeCliente);
    }

    void mudarNome(String NovoNome){

        try{
            
            this.NomeCliente = NovoNome;
    
            System.out.println("Nome alterado com Sucesso para "+NovoNome);
        }

        catch (Exception e){
            System.out.println("Falha ao Alterar o nome");
        }


    }

    int voltarNumero(){
        return this.NumeroConta;
    }

    
}
