package Exxherança;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class exxprodutousado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> listprodutc = new ArrayList<>();
		
		
		for(int i = 0; i<n; i++) {
			System.out.println("Product "+ (i + 1) +" data:");
			
			System.out.println("Common, used or imported (c/u/i)?");
			char decision = sc.next().charAt(0);
			while(decision != 'c' && decision != 'u' && decision != 'i') {
				decision = sc.next().charAt(0);
			}
			sc.nextLine();
			System.out.print("Name");
			String name = sc.nextLine();
			
			System.out.print("Price");
			Double price = sc.nextDouble();
			
			sc.nextLine();
			
			Product pdo;
			if(decision == 'i') {
				System.out.println("Customs fee:");
				Double custonfee = sc.nextDouble();
				 pdo = new ImportedProduct( name,  price,  custonfee);
				
				
			}else if(decision == 'u'){
				System.out.println("Manufacture date (DD/MM/YYYY):");
				String datestring = sc.next();
				LocalDate data = LocalDate.parse(datestring, ftm);
				Date date = Date.from(data.atStartOfDay(ZoneId.systemDefault()).toInstant());
				 pdo = new UsedProduct( name,  price, date);
			}else {
				  pdo = new Product(name, price);
			}
			
			listprodutc.add(pdo);
			
		}
		
		System.out.println("");
		
		for(int i = 0; i< listprodutc.size() ; i++) {
			
			System.out.println(listprodutc.get(i).priceTag());
		}
		
		sc.close();

	}

}
