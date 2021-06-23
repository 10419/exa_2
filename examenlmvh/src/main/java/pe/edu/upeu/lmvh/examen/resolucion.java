package pe.edu.upeu.lmvh.examen;
import pe.edu.upeu.lmvh.utils.teclado;
public class resolucion{
	public problemas factory(String clase){
		if(clase.equals("1")){
		  	problemas p=new problem1();
			return p;
		}
		else if(clase.equals("2")){
			problemas p=new problem2();
			return p;
		}
		else if(clase.equals("3")){
			problemas p=new problem3();
			return p;
		}
		else if(clase.equals("4")){
			problemas p=new problem4();
			return p;
		}
		else{
		return null;}
	}	  
}

class problem1 implements problemas{
	public void resolver(){
		float[] suma={0,0,0};
		double impuesto=0.0;
		teclado tc=teclado.getInstance();
		System.out.println("Bienvenido al automotris Luis ");
		int num=tc.leer(1,"Cuantos autos de Categoria 1 tiene: ");
		for(int i=0;i<num;i++){
			impuesto=tc.leer(1.1,"valor del auto numero "+(i+1)+": ")*0.12;
			suma[0]+=impuesto;
		}
		num=tc.leer(1,"Cuantos autos de Categoria 2 tiene : ");
		for(int i=0;i<num;i++){
			impuesto=tc.leer(1.1,"valor del auto numero "+(i+1)+": ")*0.08;
			suma[1]+=impuesto;
		}
		num=tc.leer(1,"Cuantos autos de Categoria 3 tiene : ");
		for(int i=0;i<num;i++){
			impuesto=tc.leer(1.1,("valor del auto numero "+(i+1)+": "))*0.05;
			suma[2]+=impuesto;
		}
		
		for(int i=0;i<3;i++){
			System.out.println("Impuesto para la categoria "+(i+1)+": "+suma[i]);
		}
		System.out.println("Impuesto total es: "+(suma[0]+suma[1]+suma[2]));
	}
}

class problem2 implements problemas{
	public void resolver(){
		int num=teclado.getInstance().leer(1,"hasta que numero quiere multiplicar: ");
	  	System.out.println("Tabla de multiplicar");
		for(int i=1;i<=num;i++){
			System.out.println("tabla de multiplicar del "+i);
		  	for(int j=1;j<13;j++){
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}	
	}
}

class problem3 implements problemas{
	public void resolver(){
	  	//numeros primos debajo de 100
	  	int[] numPrimos={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	  	long Num=teclado.getInstance().leer(1,"ingrese que cantidad de numeros perfectos desea ver, tenga cuidado con colocar numeros altos podria llegar a tener un crash, en los 8 primeros datos: ");
		int c=0,i=0;
		while(c<Num){
			c+=numPerfecto(numPrimos[i++]);} 
 
			
	}
	public long numPerfecto(long n){
		double h=Math.pow(2,n-1)*(Math.pow(2,n)-1);
		if(pr((long)Math.round(h))==true){
		System.out.println(h);
		return 1;}
		return 0;
	}
	public boolean pr(long num){
		long w=num;
		long suma=0;
		
		for(long i=2;i<w;i++){
			if(num%i==0){
				w=num/i;
				
				suma+=w+i;
			}
		}
		if(suma+1==num){
			System.out.print("numero perfecto ");
			return true;
		}else{return false;}
	}
}

class problem4 implements problemas{
	public void resolver(){
		int base=teclado.getInstance().leer(1,"Ingrese  la base: ");
		int expo=teclado.getInstance().leer(1,"Ingrese el exponente: ");
		System.out.println("el resultado es: "+recursivo(base,expo));
	}
	private int recursivo(int base,int expo){
		if(expo>1){
			return base*recursivo(base,expo-1);
		}else{
			return base;
		}
	}

}
