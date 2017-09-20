import java.util.Scanner;
public class HolaMundo {


	
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner mensaje = new Scanner(System.in);

//Mostrar por pantalla el mensaje al usuario

	System.out.println("Introduce el primer valor");
//Asignar la entrada por teclado a la variable num1

		num1 = mensaje.nextInt();

//Asignar la entrada por teclado a la variable num2
	System.out.println("Introduce el segundo valor");
		num2 = mensaje.nextInt();

//Hacer la suma de las variables num1 y num2
		num3 = num1 + num2;
	
	System.out.println("El resultado de la suma es:" + num3);
	}
 
}