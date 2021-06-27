package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Expense;
import entities.enums.Categories;

public class program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Date date = new Date();
		date = sdf.parse("28/09/1990");
		System.out.println("Escolha a opera��o: 1 - Receita / 2 - Despesa");
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
		int categoryInt = sc.nextInt();
		String category = null;
		
		switch (categoryInt) {
		case 1: {
			category = "CASA";
			break;

		}
		case 2: {
			category = "LANCHES";
			break;
		}
		case 3: {
			category = "ALCOOLS";
			break;
		}
		case 4: {
			category = "SAUDE";
			break;

		}
		case 5: {
			category = "DIVIDAS";
			break;
		}
		default:
			category = "";

		}

		Expense exp = new Expense(name, value, Categories.valueOf(category), date);
		exp.addToAccountMovement(name, value, Categories.valueOf(category), date);
		System.out.println(exp);
		

	}

	
}
