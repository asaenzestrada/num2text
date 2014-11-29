package num2text;

import java.util.*;

public class num2text {
	static String result;
	static Scanner input = new Scanner(System.in);
	static int myNum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("DAME TU NUMERILLO! Dame un numero negativo para salir.");
			myNum = input.nextInt();
			String texto = (myNum >= 0) ? numeroAtexto(myNum) : "";
			System.out.println("%%% " + texto + " %%%\n==================\n==================\n==================");
		} while (myNum >= 0);
	}

	static String numeroAtexto(int n) {
		if (n == 0) {
			result = "CERO";
		} else if (n == 1) {
			result = "UNO";
		} else if (n == 2) {
			result = "DOS";
		} else if (n == 3) {
			result = "TRES";
		} else if (n == 4) {
			result = "CUATRO";
		} else if (n == 5) {
			result = "CINCO";
		} else if (n == 6) {
			result = "SEIS";
		} else if (n == 7) {
			result = "SIETE";
		} else if (n == 8) {
			result = "OCHO";
		} else if (n == 9) {
			result = "NUEVE";
		} else if (n == 10) {
			result = "DIEZ";
		} else if (n == 11) {
			result = "ONCE";
		} else if (n == 12) {
			result = "DOCE";
		} else if (n == 13) {
			result = "TRECE";
		} else if (n == 14) {
			result = "CATORCE";
		} else if (n == 15) {
			result = "QUINCE";
		} else if (n < 20) {
			result = "DIECI" + numeroAtexto(n - 10);
		} else if (n == 20) {
			result = "VEINTE";
		} else if (n < 30) {
			result = "VEINTI" + numeroAtexto(n - 20);
		} else if (n == 30) {
			result = "TREINTA";
		} else if (n == 40) {
			result = "CUARENTA";
		} else if (n == 50) {
			result = "CINCUENTA";
		} else if (n == 60) {
			result = "SESENTA";
		} else if (n == 70) {
			result = "SETENTA";
		} else if (n == 80) {
			result = "OCHENTA";
		} else if (n == 90) {
			result = "NOVENTA";
		} else if (n < 100) {
			int x = n / 10;
			result = numeroAtexto(x * 10) + " Y " + numeroAtexto(n % 10);
		} else if (n == 100) {
			result = "CIEN";
		} else if (n < 200) {
			result = "CIENTO " + numeroAtexto(n % 100);
		} else if (n == 200 || n == 300 || n == 400 || n == 600 || n == 800) {
			result = numeroAtexto(n / 100) + "CIENTOS";
		} else if (n == 500) {
			result = "QUINIENTOS";
		} else if (n == 700) {
			result = "SETECIENTOS";
		} else if (n == 900) {
			result = "NOVECIENTOS";
		} else if (n < 1000) {
			int x = n / 100;
			result = numeroAtexto(x * 100) + " " + numeroAtexto(n - (x * 100));
		} else if (n == 1000) {
			result = "MIL";
		} else if (n < 2000) {
			result = "MIL " + numeroAtexto(n - 1000);
		} else if (n < 1000000) {
			int x = n / 1000;
			result = numeroAtexto(x) + " MIL";
			if ((n - (x * 1000)) > 0) {
				result = result + " " + numeroAtexto(n - (x * 1000));
			}
		} else if (n == 1000000) {
			result = "UN MILLON";
		} else if (n < 2000000) {
			result = "UN MILLON " + numeroAtexto(n - 1000000);
		} else if (n == 2000000) {
			result = "DOS MELONES";
		} else if (n > 2000000) {
			result = "fuera de rango";
		}
		return result;
	}
}