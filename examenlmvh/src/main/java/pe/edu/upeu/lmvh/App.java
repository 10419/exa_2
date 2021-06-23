package pe.edu.upeu.lmvh;
import pe.edu.upeu.lmvh.examen.*;
import pe.edu.upeu.lmvh.utils.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
      	problemas obj;
	boolean estado=false;
        resolucion p=new resolucion();
	try{
		obj=p.factory(args[0]);
		obj.resolver();
		estado=true;
	}
	catch(Exception e){}
	
    	try{
		if(estado==false){
		  	while(true){
			System.out.println("\n");
			obj=p.factory(teclado.getInstance().leer("","Seleccion el algoritmo que desea ejecutar:"+
			"\n1=Automotris Luis "+
			"\n2=Tabla de multiplicar"+
			"\n3=Números Perfectos"+
			"\n4=Potencias Recursivas"+
			"\n0=Salir del programa"));
		  	
			obj.resolver();
		   
		}
		
		}
		
	}catch(Exception e){}
    }
}
