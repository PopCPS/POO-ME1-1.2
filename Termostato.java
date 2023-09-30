public class Termostato
{
    private double temperatura;
    private boolean estado = false;
    
    public double getTemperatura(){
        return this.temperatura;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
    
    public void liga(){
        estado = true;
        temperatura = 80;
    }
    
    public void desliga(){
        estado = false;
    }
    
    public void aumentaTemperatura(){
        if(estado == true && temperatura < 85){
            temperatura++;
        }
    }
        
    public void diminuiTemperatura(){
        if(estado == true && temperatura > 80){
            temperatura--;
        }
    }
    
    public String mostraTemperatura(){
        if(estado == true){
            return temperatura + "";
        }else{
            return "Desligado";
        }
    }
}
