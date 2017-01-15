class Condicionales01 {
	public static void main(String[] args) {

		// Operadores Lógicos
		// ==
		// >
		// <
		// !=
		// >=
		// <=

		// Condicional simple
		// if ( 4 > 5 ) {
		// 	System.out.println("The condition is ok");
		// 	System.out.println("Because 4 < 5");
		// 	System.out.println("Process over");
		// }

		//Condicional Doble
		// int edad;
		// edad = 20;
		
		// if ( edad >= 18) {
		// 	System.out.println("You are adult");
		// } else {
		// 	System.out.println("You are not adult");
		// }

		//Condicional if else if
		// int edad = 35;

		// if ( edad <= 12) {
		// 	System.out.println("He is a boy");
		// } else if (edad <= 18) {
		// 	System.out.println("He is a young");
		// } else if (edad <= 60) {
		// 	System.out.println("He is a adult");
		// } else {
		// 	System.out.println("He is an ancient");
		// }

		// Operadores Lógicos
		// &&
		// ||
		// !

		// int a = 0;

		// if ( 10 < 5 && ++a < 7) {
		// 	System.out.println("The 2 conditions are true");
		// } 
		// System.out.println("The variable 'a' is: "+a);

		// Operador Ternario
		// condicion ? verdadero : falso;
		
		// System.out.println( 4 < 5 ? "Si se cumple":"No se cumple" );

		//Condicionales Multiples
		// switch

		// int day = 1;

		// switch (day) {
		// 	case 1:
		// 		System.out.println("Monday");
		// 		break;
		// 	case 2:
		// 		System.out.println("Tuesday");
		// 		break;
		// 	case 3:
		// 		System.out.println("Wednesday");
		// 		break;
		// 	case 4:
		// 		System.out.println("Thursday");
		// 		break;			
		// 	case 5:
		// 		System.out.println("Friday");
		// 		break;
		// 	case 6:
		// 		System.out.println("Saturday");
		// 		break;
		// 	case 7:
		// 		System.out.println("Sunday");
		// 		break;
		// 	default:
		// 		System.out.println("Not valid day");
		// }

		// int day = 2;

		// switch (day) {
		// 	case 1:
		// 	case 2:
		// 	case 3:
		// 	case 4:
		// 	case 5:
		// 		System.out.println("You are on days of the week");
		// 		break;
		// 	case 6:
		// 	case 7:
		// 		System.out.println("You are on weekend now!!");
		// 		break;
		// 	default:
		// 		System.out.println("Not valid day");
		// }

		// int day = 2;
		// String name = "Dexter";

		// switch (name) {
		// 	case "Fokker":
		// 	case "Hunter":
		// 	case "Sterling":
		// 	case "Dixon":
		// 	case "Global":
		// 		System.out.println("It's a pilot UN");
		// 		break;
		// 	case "Farina":
		// 	case "Bretai":
		// 		System.out.println("It's a pilot Zentraedi");
		// 		break;
		// 	default:
		// 		System.out.println("Pilot not identified");
		// }

		// Comparar String
		// "unstring".equals("elotrostring");

		String name = "Fokker";
		String compare = "Fokker";

		if ( name.equals(compare)) {
			System.out.println("He's Skull leader");
		}

	}
}