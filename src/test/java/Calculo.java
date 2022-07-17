import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
	Operacoes o = new Operacoes();
	
 Scanner scanner = new Scanner (System.in);
System.out.println("Digite o 1 valor:");
int M1 = scanner.nextInt();
System.out.println("Digite o 2 valor:");
int M2 = scanner.nextInt();
o.soma(M1, M2);

System.out.println("Digite o 1 valor:");
int M3 = scanner.nextInt();
System.out.println("Digite o 2 valor:");
int M4 = scanner.nextInt();
o.dividir(M3,M4);

System.out.println("Digite o 1 valor:");
int M5 = scanner.nextInt();
System.out.println("Digite o 2 valor:");
int M6 = scanner.nextInt();
o.multiplicacao(M5,M6);

System.out.println("Digite o 1 valor:");
int M7 = scanner.nextInt();
System.out.println("Digite o 2 valor:");
int M8 = scanner.nextInt();
o.subtracao(M7,M8);

}
}