package application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program {

	public static void main(String[] args) throws ParseException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Date date = new Date();
		System.out.println(date);

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

		// Expense exp = new Expense(name, value, Categories.valueOf(category), date);
		// exp.addToAccountMovement(name, value, Categories.valueOf(category), date);
		// System.out.println(exp);
		Account acc = new Account();
		acc.readAccountOperations();

	}

}
