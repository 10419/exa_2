package pe.edu.upeu.lmvh.utils;

import java.io.*;

public class teclado {
    	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
    	
	//patron singleton para tener solo un objeto teclado
  	private static teclado singleton=null;
	private teclado(){}
	
	public static teclado getInstance(){
	  	if(singleton==null){
			singleton=new teclado();
		}
		return singleton;
	}
	//---------------------------------------------------

   	public int leer(int valor, String msg) {
        	System.out.println(msg);
        	try {
            		valor=Integer.parseInt(teclado.readLine()); 
        	} catch (NumberFormatException ex) {
            		System.err.println(ex.getMessage());
            		valor=leer(valor, msg);
        	} catch (Exception e) {
            		System.err.println(e.getMessage());
            		valor=leer(valor, msg);
        	}
        		return valor;
    		}

    	public long leer(long valor, String msg) {
        	System.out.println(msg);
        	try {
            		valor=Long.parseLong(teclado.readLine()); 
        	} catch (Exception e) {
            		valor=leer(valor, msg);
        	}
        		return valor;
    		}    

    	public double leer(double valor, String msg) {
        	System.out.println(msg);
        	try {
            		valor=Double.parseDouble(teclado.readLine()); 
        	} catch (Exception e) {
		  	System.out.println("Intentelo de nuevo!!");
            		valor=leer(valor, msg);
        	}
        	return valor;
    	}

    	public char leer(char valor, String msg) {
        	System.out.println(msg);
        	try {
            		valor=teclado.readLine().charAt(0); //David
        	} catch (Exception e) {
            		valor=leer(valor, msg);
        	}
        		return valor;
    	}   

    	public String leer(String valor, String msg) {
        	System.out.println(msg);
        	try {
            		valor=String.valueOf(teclado.readLine()); //
        	} catch (Exception e) {
            		valor=leer(valor, msg);
        	}
        	return valor;
    	}  
    	public boolean leer(boolean valor, String msg) {
        	System.out.println(msg);
        	try {
            		valor=Boolean.parseBoolean(teclado.readLine()); //David
        	} catch (Exception e) {
            		valor=leer(valor, msg);
        	}
        	return valor;
        }
    }         

