import java.util.Scanner;


public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("nombre del alumno: ");
		Scanner mi_scanner = new Scanner (System.in);
		String nombre1=mi_scanner.next();
		System.out.println("Ingrese nota 1 de "+ nombre1);
		Scanner mi_scanner1 = new Scanner (System.in);
		int nota1=mi_scanner1.nextInt();
		System.out.println("Ingrese nota 2 de "+ nombre1);
		Scanner mi_scanner2 = new Scanner (System.in);
		int nota2=mi_scanner2.nextInt();
		System.out.println("Ingrese nota 3 de "+ nombre1);
		Scanner mi_scanner3 = new Scanner (System.in);
		int nota3=mi_scanner3.nextInt();
		int nota4;
		nota4 = ((nota1+nota2+nota3)/(3));
		System.out.println("El promedio de es: " + nota4);
		if(nota4>=60){
		            System.out.println("El estudiante Aprobo");
		        }else
		            System.out.println("El estudiante Reprobo");


		System.out.println("nombre del alumno 2: ");
		Scanner mi_scanneri = new Scanner (System.in);
		String nombre2=mi_scanneri.next();
		System.out.println("Ingrese nota 1 de "+ nombre2);
		System.out.println("Ingrese nota 1: ");
		Scanner mi_scanner5 = new Scanner (System.in);
		int nota5=mi_scanner5.nextInt();
		System.out.println("Ingrese nota 2 de "+ nombre2);
		Scanner mi_scanner6 = new Scanner (System.in);
		int nota6=mi_scanner6.nextInt();
		System.out.println("Ingrese nota 3 de "+ nombre2);
		Scanner mi_scanner7 = new Scanner (System.in);
		int nota7=mi_scanner7.nextInt();
		int nota8;
		nota8 = ((nota5+nota6+nota7)/(3));
		System.out.println("El promedio del alumno 2 es: " + nota8);
		if(nota8>=60){
		            System.out.println("El estudiante Aprobo");
		        }else
		            System.out.println("El estudiante Reprobo");


		System.out.println("nombre del alumno3: ");
		Scanner mi_scannerx = new Scanner (System.in);
		String nombre3=mi_scannerx.next();
		System.out.println("Alumno1: ");
		System.out.println("Ingrese nota 1 de "+ nombre3);
		Scanner mi_scanner9 = new Scanner (System.in);
		int nota9=mi_scanner9.nextInt();
		System.out.println("Ingrese nota 2 de "+ nombre3);
		Scanner mi_scanner10 = new Scanner (System.in);
		int nota10=mi_scanner10.nextInt();
		System.out.println("Ingrese nota 3 de "+ nombre3);
		Scanner mi_scanner11 = new Scanner (System.in);
		int nota11=mi_scanner11.nextInt();
		int nota12;
		nota12 = ((nota9+nota10+nota11)/(3));
		System.out.println("El promedio del alumno 1 es: " + nota12);
		if(nota12>=60){
		            System.out.println("El estudiante Aprobo");
		        }else
		            System.out.println("El estudiante Reprobo");

		}

		}