import java.util.Locale;
import java.util.Scanner;

public class ValorTerreno {

	public static void main(String[] args) {

		// Recebe os dados inseridos pelo usuário
		// e calcula o valor do terreno
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();	
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("A largura digitada foi de:");
		System.out.println(largura);
		System.out.println("=================================");
		System.out.println("O comprimento digitado foi de:");
		System.out.println(comprimento);
		System.out.println("=================================");
		System.out.println("O valor do metro quadrado foi de:");
		System.out.println(metroQuadrado);
		System.out.println("=================================");
		System.out.println("O valor do imóvel é : " + preco);
		
		sc.close();

	}

}
