package abstracaoexercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		List<Pessoa> lstap = new ArrayList<>();
		
		for(int i = 0 ; i < n; i++) {
			System.out.println("Tax payer" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income:");
			Double icome = sc.nextDouble();
			
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double heexpp = sc.nextDouble();
				lstap.add(new PessoaFizica( name,  icome,  heexpp));
				
			}else {
				System.out.println("Number of employees: ");
				int qutnemp = sc.nextInt();
				lstap.add(new PessoaJuridica( name,  icome,  qutnemp));
			}
			
			
		}
		
		
		
		
		System.out.println("TAXES PAID:");
		
		Double total = 0.0;
		
		int contfizica= 0;
		int contjuridica = 0;
		
		for( Pessoa lista : lstap ) {
			String valorFormatado = String.format("%.2f", lista.imposto());
		    System.out.println(lista.getNome() + " $ " + valorFormatado);
			total += lista.imposto();
			
			
			
			
			
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + total);
			
			
		
		System.out.println(contfizica + " " + contjuridica );
		
		sc.close();

	}

}
