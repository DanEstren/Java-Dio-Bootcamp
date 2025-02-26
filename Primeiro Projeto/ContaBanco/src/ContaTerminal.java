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

        System.out.println("Por favor, digite o número da Agência !");
        contas.NumeroConta = scanner.nextInt();

        System.out.println("Por favor, digite a Agência !");
        contas.Agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        contas.NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo do Cliente !");
        contas.Saldo = scanner.nextDouble();

        System.out.println("Olá "+contas.NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+contas.Agencia+", conta "+contas.NumeroConta+" e seu saldo "+contas.Saldo+" já está disponível para saque");

        scanner.close();
        
    }

    
}
