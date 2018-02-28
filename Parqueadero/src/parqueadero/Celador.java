
package parqueadero;

public class Celador {
    
    String saludo (boolean nivelAlcohol, String genero){
        
        if(nivelAlcohol==true && genero.equals("Mujer")){
           
            return "Chao mamaseeta";
            
            
        }else{
            
            return "Hola señor";
        }
        
        
    }
    
    String piropo (){
        return "Hola bebé";    }
    
    
}
