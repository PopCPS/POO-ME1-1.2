public class Main
{
	public static void main(String[] args) {
		
		Termostato termostato = new Termostato();
		
		//---------------------------------------
		
		termostato.liga();
		
		for(int i = 0; i < 3; i++){
		    if(termostato.getEstado()){
		        termostato.aumentaTemperatura();
		    }else{
		        System.out.println("Termostato desligado");
		    }
		}
		
		for(int i = 0; i < 5; i++){
		    if(termostato.getEstado()){
		        termostato.diminuiTemperatura();
		    }else{
		        System.out.println("Termostato desligado");
		    }
		}
		
		System.out.println("Temperatura: " + termostato.mostraTemperatura());
		
		//---------------------------------------
		
		for(int i = 0; i < 2; i++){
		    if(termostato.getEstado()){
		        termostato.aumentaTemperatura();
		    }else{
		        System.out.println("Termostato desligado");
		    }
		}
		
		System.out.println("Temperatura: " + termostato.mostraTemperatura());
		
		//---------------------------------------
		
		termostato.liga();
		
		for(int i = 0; i < 8; i++){
		    if(termostato.getEstado()){
		        termostato.aumentaTemperatura();
		    }else{
		        System.out.println("Termostato desligado");
		    }
		}
		
		for(int i = 0; i < 2; i++){
		    if(termostato.getEstado()){
		        termostato.diminuiTemperatura();
		    }else{
		        System.out.println("Termostato desligado");
		    }
		}
		
		termostato.desliga();
		
		System.out.println("Temperatura: " + termostato.mostraTemperatura());
	}
}
