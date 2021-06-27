package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.Categories;

public class Expense extends Account {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private String name;
	private Double expenseValue;
	private Date date;
	private Categories category;

	public Expense() {

	}

	public Expense(String name, Double expenseValue, Categories category, Date date) {

		this.name = name;
		this.expenseValue = expenseValue;
		this.category = category;
		this.date = date;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getExpenseValue() {
		return expenseValue;
	}

	public void setExpenseValue(Double expenseValue) {
		this.expenseValue = expenseValue;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) throws ParseException {
		this.date = sdf.parse("dd/MM/yyyy");
	}
	
	public void addToAccountMovement(String name, double expenseValue, Categories category, Date date) {
		String path = ".\\src\\files\\data.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {

			bw.write(name + "," + expenseValue + "," + category + "," + (sdf.format(date)) + "\n");
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.name + "\n");
		sb.append("Value: " + this.getExpenseValue() + "\n");
		sb.append("Category: " + this.getCategory() + "\n");
		sb.append("Date: " + this.sdf.format(this.getDate()) + "\n");

		return sb.toString();
	}

}
