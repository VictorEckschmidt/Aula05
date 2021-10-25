import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, res;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, informe o valor da qual voce deseja a tabuada");
		numero = leitor.nextInt();
		for (int i=1; i<=10; i++) {
			res = numero * i;
			System.out.println(numero + "x" + i + " = " + res);
			
		}
		leitor.close();
	}

}
