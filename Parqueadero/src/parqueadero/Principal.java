package parqueadero;

public class Principal {

    public static void main(String[] args) {
        
        Celador miCelador=new Celador();
        Propietario andrea= new Propietario();
        Propietario andres= new Propietario();
        Propietario melissa= new Propietario();
        Propietario juan= new Propietario();
        
        andrea.nivelAlcohol=0;
        andrea.genero="Mujer";
        andrea.gafas="no";
        
        andres.nivelAlcohol=0;
        andres.genero="Hombre";
        andres.gafas="no";
        
        melissa.nivelAlcohol=1;
        melissa.genero="Mujer";
        melissa.gafas="no";
        
        juan.nivelAlcohol=1;
        juan.genero="Hombre";
        juan.gafas="no";
        
        miCelador.saludo(true, "Mujer");
        System.out.println(miCelador.saludo(true, "Mujer"));
        
        miCelador.saludo(true, "Hombre");
        System.out.println(miCelador.saludo(true, "Hombre"));
        
        miCelador.saludo(false, "Mujer");
        System.out.println(miCelador.saludo(false, "Mujer"));
    }
    
}
