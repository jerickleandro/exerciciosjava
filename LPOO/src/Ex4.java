import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		String uma = "Lucas";
		String duas = "Lucas";
		
		System.out.println("Digite a primeira string");
		uma = tec.nextLine();
		System.out.println("Digite a segunda string");
		duas = tec.nextLine();
		
		if(uma == duas) {
			System.out.println("Igual");
		
		}else {
			System.out.println("Não igual");
		}

	}

}
