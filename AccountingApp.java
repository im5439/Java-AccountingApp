import java.util.Scanner;

public class AccountingApp {
	
	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�Ǹ����� ���ް��� �Է��ϼ���.");
			System.out.print("$ > ");
			double ValueOfSupply = scanner.nextDouble();
			double VAT = (ValueOfSupply * 0.1);
			double Expense = (ValueOfSupply * 0.3);
			double Income = (ValueOfSupply * 0.7);
			double[] dividendRate = new double[3];
			dividendRate[0] = 0.5;
			dividendRate[1] = 0.3;
			dividendRate[2] = 0.2;
			
			if (ValueOfSupply > 1) {
				System.out.println("���ް� : " + ValueOfSupply + "��");
				System.out.println("�ǸŰ� : " + (ValueOfSupply + VAT) + "��");
				System.out.println("�ΰ��� : " + VAT + "��");
				System.out.println("��� : " + Expense + "��");
				System.out.println("���� : " + Income + "��");
				System.out.println("dividend1 : " + (Income * dividendRate[0]) + "��");
				System.out.println("dividend2 : " + (Income * dividendRate[1]) + "��");
				System.out.println("dividend3 : " + (Income * dividendRate[2]) + "��");
				continue;
				
			} else if (ValueOfSupply < 0) {
				break;
			}
			scanner.close();
		}
		System.out.println("<EXIT>");

	}

	

}
