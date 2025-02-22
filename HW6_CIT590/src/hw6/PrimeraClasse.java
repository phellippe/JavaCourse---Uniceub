package hw6;

import java.util.Scanner;


public class PrimeraClasse {
	
	/**
	*	Esse � o m�todo main, o ponto de entrada para o seu c�digo Java.
	*	@param args
	*/
	public static void main(String[]args) {
		
		//imprimindo usando SOPL: System.out.prrintln()
		System.out.println("Hello World");
		System.out.println(); //Imprime uma linha em branco (/n)
		
		/*
		 * Definindo vari�veis
		 */
		
		int x = 5;
		
		double y = 5.0;
		
		boolean umBool = true;
		
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		System.out.println("umBool: "+ umBool);
		
		/*
		 * Strings e caracteres
		 */
		
		String versao = "ijloo";
		char letra = 'a';
		
		String course = versao + 0121;// String com int
		String g = letra + ""; // Char com string
		
		String informacaoCurso = course + ": "+ g;
		System.out.println(informacaoCurso);
		
		/*
		 * Operadores Matem�ticos
		 */
		
		double d = 2 * x + 10;
		double z = 2 * y + 5;
		
		System.out.println();
		System.out.println("d :"+ d);
		System.out.println("z :"+ z);
		
		//divis�o com inteiros
		//usa divis�o de inteiros e ignora o que sobra
		System.out.println("x / 2: "+ (x / 2));
		
		//divis�o com floats
		System.out.println("x / 2.0" + (x / 2.0));
		
		//exponencia��o
		//Voc� tem que usar m�todos para fazer c�lculos com esponenciais
		System.out.println("x pow 4: " + Math.pow(x,  4));
		
		/*
		 * Opera��es com strings
		 */
		
		//concatena��o de strings
		String nomeInteiro = "Brandon" + " " + "Lee" + " " + "Krakowsky";
		
		//Metodo de String para converter para mai�sculo
		String nomeInteiroMaiusculo = nomeInteiro.toUpperCase();
		
		System.out.println(nomeInteiroMaiusculo);
		
		/*
		 * Loops e condicionais
		 */
		
		//Checagem de condicional se x � par, usando o operador % (resto de divis�o)
		System.out.println();
		System.out.println("x: "+ x);
		
		if (x % 2 == 0) {
			System.out.println(x + " e par");
		}else {
			System.out.println(x + " e impar");
		}
		
		double e = 2.3;
		double f = 2.4;
		double g1 = 2.1;
		
		//operadores boolean
		//&& (and) - verdadeiro se ambos os operadores s�o verdadeiros
		System.out.println();
		if (e > 2 && e < f) {
			System.out.println(e + " esta entre 2 e "+ f);
		}
		
		//|| (or) verdadeiro se algum dos dois for verdadeiro
		if (f > e || f > g1) {
			System.out.println(g1 + " n�o � igual a 2.6");
		}
		
		//loops while
		int i = 0;
		
		System.out.println();
		while( i < 5) {
			System.out.println("i: "+ i);
			
			i++;
		}
		
		//loops for
		System.out.println();
		
		for (int k = 0; k < 10; k++) {
			System.out.println("k: "+ k);
		}
		
		/*
		 * Casting (Transforma��o do tipo da vari�vel)
		 */
		
		//Cast int para String
		String intParaString = Integer.toString(1);
		
		//Cast double para String
		String doubleParaString = Double.toString(1.2);
		
		//Printa os valores e tipos dos  valores
		System.out.println(); //linha vazia
		System.out.println(intParaString + " " + intParaString.getClass());
		System.out.println(doubleParaString + " " + doubleParaString.getClass());
		
		//Cast String para int
		int stringParaInt = Integer.parseInt("1");
		
		//Cast String to double
		double stringParaDouble = Double.parseDouble("1.2");
		
		//Imprime o valor e tipo dos valores
		System.out.println(stringParaInt);
		//Cast para objeto e depois chama o m�todo getClass()
		System.out.println(((Object)stringParaInt).getClass());
		
		System.out.println(stringParaDouble);
		//Cast para objeto e depois chama o m�todo getClass()
		System.out.println(((Object)stringParaDouble).getClass());
		
		/*
		 * Input do usu�rio
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Digite um n�mero: ");
		int inteiro = scan.nextInt(); //recebe o pr�ximo input como um numero inteiro
		System.out.println("Seu n�mero �: "+ inteiro);
		
		//imprime a table de multiplica��o at� 10 de inteiro
		for (int k = 1; k <= 10; k++) {
			//print k * inteiro
			System.out.println(k + " x "+ inteiro + ": "+ (k * inteiro));
		}
		
		System.out.println();
		System.out.println("Digite uma string: ");
		String myStr = scan.next(); //Recebe o pr�ximo input como string
		
		//Imprime cada char em myStr separadamente
		for (int u = 0; u < myStr.length(); u++) {
			//imprime o char na posi��o u
			System.out.println(myStr.charAt(u));
		}
		
		scan.close();
	}

}
