package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Expense;

public class program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		date = sdf.parse("28/09/1990");
		System.out.println("Escolha a operação: 1 - Receita / 2 - Despesa");
		double op = sc.nextInt();
		System.out.println("Digite o nome da despesa: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digite o valor: ");
		Double value = sc.nextDouble();
		System.out.println("Digite a categoria: ");
		System.out.println("-----------");
		System.out.println("1 - Casa ");
		System.out.println("2 - Lanches ");
		System.out.println("3 - Alcools");
		System.out.println("4 - Saude ");
		System.out.println("5 - Dividas ");
		int category = sc.nextInt();
		
		Expense exp = new Expense (name, value,category,date);
		System.out.println(exp);
		
		

		
		

		
		
		
		
		
		

	
	}

}
 