package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Categories;

public class Account {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List <Expense> expList = new ArrayList<>();

	private Double accountBalance;
	private String accountName;

	public Account() {

	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void readAccountOperations () throws IOException, ParseException {
		String sourceFileStr =  ".\\src\\files\\data.txt";
	
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String item = br.readLine();
			while (item != null) {

				String[] fields = item.split(",");
				String name = fields[0];
				double value = Double.parseDouble(fields[1]);
				String category = fields[2];
				String date = fields[3];
				

				expList.add(new Expense(name, value, Categories.valueOf(category), sdf.parse(date)));
				item = br.readLine();
			}
		}
		for (Expense e : expList) {
			System.out.println(e);
			
		}
	}
}
