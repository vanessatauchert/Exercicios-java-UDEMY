package EstruturasRepetitivas;


import java.util.Scanner;

public class ex4For {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		//4 - Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo 
		//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
		
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			
			
			
			if(b ==0 ) {
				System.out.println("divisao impossivel");
			}
			else{
				double divisao = a/b;
				System.out.println(divisao);
			}
		}
		
		sc.close();
	}

}
