package DesafioM2Y;

import java.util.Scanner;

/*1) Escreva um m�todo que dado um inteiro x, um inteiro y e um inteiro w retorne todos os
n�meros divis�veis por w entre x e y.*/

public class DesafioM2Y1
{
	
	public static void main(String[] args)
	{
		int x,y,w;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme um valor para X: ");
		x = leia.nextInt();
		
		System.out.println("\nInforme um valor para y: ");
		y = leia.nextInt();
		
		System.out.println("\nInforme um valor para w: ");
		w = leia.nextInt();
		
		for(int a=x;a<=y;a++) 
		{
			if(a%w==0) 
			{	
				System.out.println("\nEsses sao todos os numeros divisiveis por w: "+a);	
			}	
		}
		
	}
}
