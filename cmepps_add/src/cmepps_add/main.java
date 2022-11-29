package cmepps_add;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 String[] PALABRAS = new String[] {
				"JAMON", "PERIODICO", "VIOLETA", "SUERTE",
				"IMPRESIONANTE", "CISNE", "ORDENADOR", "ESPADA"
		};
		Random sr = new Random();
		 
		int jugador=1;
		int aciertos1=0;
		int aciertos2=0;
		boolean acierto=true;
		Scanner leer=new Scanner(System.in);
		String adivina="";
		String palabra="";
		
		do {
			if(acierto==true) {
				int r=(int) Math.floor(Math.random()*7);
				palabra=PALABRAS[r];
				char [] desordenada=palabra.toCharArray();
				
				 for (int i = 0;i<3*desordenada.length;i++){
					 int a = sr.nextInt(desordenada.length);
					 int b = sr.nextInt(desordenada.length);
					 char c = desordenada[a];
					 desordenada[a] = desordenada[b];
					 desordenada[b] = c;
		        }
				adivina=String.valueOf(desordenada);
				acierto=false;
			}
			
			System.out.println("\nJUGADOR1  "+ aciertos1 + " - " +aciertos2+ "  JUGADOR2\n"
					+ "Palabra: "+ adivina +"\nTurno de JUGADOR"+jugador+": ");
			String resultado=leer.nextLine();
			if(jugador==1) {
				if(palabra.equals(resultado.toUpperCase())) {
					acierto=true;
					aciertos1++;
				}
				jugador++;
			}else {
				if(palabra.equals(resultado.toUpperCase())) {
					acierto=true;
					aciertos2++;
				}
				jugador--;
			}
			
		}while(aciertos1<2 && aciertos2<2);
		
		if(aciertos1==2)
			System.out.println("\nGANA EL JUGADOR1");
		else
			System.out.println("\nGANA EL JUGADOR2");
	}
	
	

}
