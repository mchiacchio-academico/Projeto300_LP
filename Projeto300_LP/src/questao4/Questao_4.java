package questao4;

import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		int seg;
		int resto, segCalc, min; 
		
		System.out.println("Digite o valor em segundos");
		seg=ler.nextInt();
		
		
		
		resto=seg%3600;
		min=resto/60;
		segCalc=resto%60;

		
		System.out.print(seg/3600+"h "+ min +"m "+segCalc+"s ");
		
		
	}

}
