public class Main
{
	public static void main(String[] args) {
		
		Termostato termostato = new Termostato();
		
		//---------------------------------------
		
		termostato.liga();
		
		for(int i = 0; i < 3; i++){
		    termostato.aumentaTemperatura();
		}
		
		for(int i = 0; i < 5; i++){
		    termostato.diminuiTemperatura();
		}
		
		System.out.println("Temperatura: " + termostato.mostraTemperatura());
		
		//---------------------------------------
		
		for(int i = 0; i < 2; i++){
		    termostato.aumentaTemperatura();
		}
		
		System.out.println("Temperatura: " + termostato.mostraTemperatura());
		
		//---------------------------------------
		
		termostato.liga();
		
		for(int i = 0; i < 8; i++){
		    termostato.aumentaTemperatura();
		}
		
		for(int i = 0; i < 2; i++){
		    termostato.diminuiTemperatura();
		}
		
		termostato.desliga();
		
		System.out.println("Temperatura: " + termostato.mostraTemperatura());
	}
}
