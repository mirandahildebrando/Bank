package contabanco.brando;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scannerMain = new Scanner(System.in);
        Bank santander = new Bank("0001");

        while (true) {
            System.out.println("O que deseja fazer ? C = Criar conta, E = Sair");
            if (scannerMain.hasNextLine()) { // Verificação importante!
                String op = scannerMain.nextLine();

                if (op.equals("C")) {
                    System.out.println("Digite o seu nome: ");
                    String name = scannerMain.nextLine();
                    Account account = santander.generateAccount(name);
                    santander.insertAccount(account);
                    operateAccount(account);
                } else if (op.equals("E")) {
                    break;
                } else {
                    System.out.println("Comando inválido, tente novamente!");
                }
            } else {
                System.out.println("Entrada encerrada.");
                break; // Sair do loop se não houver mais entrada
            }
        }
        scannerMain.close();
    }

    static void operateAccount(Account account) {
        Scanner scannerOperate = new Scanner(System.in);
        while (true) {
            System.out.println("O que deseja fazer ? D=Depositar, S=Sacar, E=Sair");
            if (scannerOperate.hasNextLine()) { // Verificação importante!
                String op = scannerOperate.nextLine();

                if (op.equals("D")) {
                    System.out.println("Qual valor deseja depositar ?");
                    if (scannerOperate.hasNextDouble()) {
                        double value = scannerOperate.nextDouble();
                        account.deposit(value);
                    } else {
                        System.out.println("Valor inválido. Digite um número.");
                    }
                    scannerOperate.nextLine();
                } else if (op.equals("S")) {
                    System.out.println("Qual valor deseja sacar ?");
                    if (scannerOperate.hasNextDouble()) {
                        double value = scannerOperate.nextDouble();
                        scannerOperate.nextLine();
                        if (!account.withDraw(value)) {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Valor inválido. Digite um número.");
                    }
                } else if (op.equals("E")) {
                    break;
                } else {
                    System.out.println("Comando inválido, tente novamente");
                }
            } else {
                
                System.out.println("O que deseja fazer ? D=Depositar, S=Sacar, E=Sair");; // Sair do loop se não houver mais entrada
            }
        }
        scannerOperate.close();
    }
}
