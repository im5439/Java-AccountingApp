import java.util.Scanner;

public class AccountingApp {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Ǹ����� ���ް��� �Է��ϼ���.");
		System.out.print("$ > ");
		double ValueOfSupply = scanner.nextDouble();
		
		double VAT = (ValueOfSupply * 0.1);
		double Expense = (ValueOfSupply * 0.3);
		double Income = (ValueOfSupply * 0.7);
		double dividend1 = (ValueOfSupply * 0.5);
		double dividend2 = (ValueOfSupply * 0.3);
		double dividend3 = (ValueOfSupply * 0.2);
		
		System.out.println("���ް� : "+ ValueOfSupply + "��");
		System.out.println("�ǸŰ� : "+ (ValueOfSupply+VAT)+"��");
		System.out.println("��� : "+ Expense +"��");
		System.out.println("���� : "+ Income +"��");
		System.out.println("dividend1 : "+ dividend1 +"��");
		System.out.println("dividend2 : "+ dividend2 +"��");
		System.out.println("dividend3 : "+ dividend3 +"��");
		
		scanner.close();
		
	}

}
