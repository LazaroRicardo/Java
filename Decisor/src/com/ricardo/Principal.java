package com.ricardo;

public class Principal {

	public static void main(String[] args) {
		int a,b,c;
		
		a=10;
		b=9;
		c=7;
		
		if (a>b && b>c) {
			System.out.println("a es mayor");
			}else if (a>b && c>a){
				System.out.println("c es mayor");
			}else {
				System.out.println("b es mayor");
			}
		
				
			
	}
	
}

//intento de algo más complejo:

	//	if (a>b && b>c) {
		//	System.out.println("a es mayor");
	//		}else if (a>b && c>a){
		//		System.out.println("c es mayor");
		//	}else if (a==b && b==c){
		//		System.out.println("todos son iguales");
		//	}else if (a==b && b>c){
		//		System.out.println("a y b son iguales y mayores que c");
		//	}else if (a==c && c>b){
		//		System.out.println("a y c son iguales y mayores que b");
		//	}else if (a==c && c<b){
		//		System.out.println("a y c son iguales y menores que b");
		//	}else¨{
		//		System.out.println("a y b son iguales y menores que c");
		//	}