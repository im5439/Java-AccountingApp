import java.util.Scanner;

public class AccountingApp {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("판매자의 공급가를 입력하세요.");
		System.out.print("$ > ");
		double ValueOfSupply = scanner.nextDouble();
		
		double VAT = (ValueOfSupply * 0.1);
		double Expense = (ValueOfSupply * 0.3);
		double Income = (ValueOfSupply * 0.7);
		double dividend1 = (ValueOfSupply * 0.5);
		double dividend2 = (ValueOfSupply * 0.3);
		double dividend3 = (ValueOfSupply * 0.2);
		
		System.out.println("공급가 : "+ ValueOfSupply + "원");
		System.out.println("판매가 : "+ (ValueOfSupply+VAT)+"원");
		System.out.println("비용 : "+ Expense +"원");
		System.out.println("이익 : "+ Income +"원");
		System.out.println("dividend1 : "+ dividend1 +"원");
		System.out.println("dividend2 : "+ dividend2 +"원");
		System.out.println("dividend3 : "+ dividend3 +"원");
		
		scanner.close();
		
	}

}
