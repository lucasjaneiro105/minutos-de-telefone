import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		  
		System.out.println("Telefonia Exemplo");
		System.out.println("Digite quantos minutos o cliente consumiu:");
	
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in); 
		
		  int minutos = sc.nextInt(); 
		 
		  double conta = 50.0;
		  
		  if (minutos > conta) {
			  
			  conta = conta + (minutos - 100) * 2.0;
		  }
		  
		  System.out.printf("O valor a pagar é: R$ %.2f%n", conta);
		
		sc.close();

	}

}
