package week3.assignments;

public class Elements extends Button {

	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		button.setText("Hello");
		button.submit();
		System.out.println("---------------");
		TextField textField=new TextField();
		textField.click();
		textField.getText();
		textField.setText("Hi");
		System.out.println("---------------");
		CheckBoxButton checkBoxButton=new CheckBoxButton();
		checkBoxButton.click();
		checkBoxButton.setText("Welcome");
		checkBoxButton.submit();
		System.out.println("----------------");
		RadioButton radioButton=new RadioButton();
		radioButton.click();
		radioButton.selectRadioButton();
		radioButton.submit();
		radioButton.setText("Selenium");

	}

}
