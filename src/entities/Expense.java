package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense extends Account {

	public Expense() {

	}

	public Expense(String name, Double expenseValue, Integer category, Date date) {

		this.name = name;
		this.expenseValue = expenseValue;
		this.category = category;
		this.date = date;
		// this.comment = comment;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private Double expenseValue;
	private Integer category;
	private Date date;
	// private String comment;

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

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		// }

//	public String getComment() {
		// return comment;
//	}

//	public void setComment(String comment) {
//		this.comment = comment;
	}

	public void addToAccountMovement(double value) {
		super.addBalance(value);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.name + "\n");
		sb.append("Value: " + this.getExpenseValue()+ "\n");
		sb.append("Category: " + this.getCategory()+ "\n");
		sb.append("Date: " + this.sdf.format(this.getDate())+ "\n");

		return sb.toString();
	}

}
