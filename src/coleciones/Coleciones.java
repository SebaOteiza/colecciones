package coleciones;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.lang.NumberFormatException;
public class Coleciones {

	public static void main(String[] args) { // todo se trabaja dentro del metodo

		
DecimalFormat df = new DecimalFormat("#.000");
		
		ArrayList<Double> decimales = new ArrayList<Double>();

		decimales.add(32.4);
		decimales.add(Double.parseDouble(df.format(Math.random())));
		decimales.add(12.456);
		decimales.add(32.34);
		decimales.add(62.4);
		
		System.out.println("Estos son los decimales de la lista decimales: "+decimales);
		System.out.println("*************************");
		ArrayList<Double> deci = new ArrayList<>();
		
		deci.add((double) (Math.round((Math.random()*10)*1000.0)/10)); 
		
		deci.add(Math.random()*10);

		System.out.println(deci);
		System.out.println("**************************");		
		decimales.addAll(deci);
		System.out.println("**************************");
		System.out.println(decimales);
		System.out.println(decimales.size());
		
		
		
		System.out.println(decimales.indexOf(32.4));
		System.out.println(decimales.indexOf(32.34));
		System.out.println(decimales.indexOf(32.4456));//-1
		System.out.println(decimales.lastIndexOf(32.3400));
		
		
		
		//los SET no permite repetir elementos en la lista 
		
		Set<String> nicknames = new HashSet<>();
		nicknames.add("Ducksito");
		nicknames.add("rolando90");
		nicknames.add("polypleti");
		nicknames.add("Java");
		nicknames.add("gonzaleslillo");
		nicknames.add("edgamer63");
		nicknames.add("silvia2015");
		nicknames.add("sebaoteiza");
		nicknames.add("callita");
		nicknames.add("giornobanana");
		nicknames.add("lucianosesc");
		nicknames.add("felicity");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		nicknames.add("kesillox");
		
		System.out.println(nicknames);
		
		
		
		
		//indexof devuelve la posicion del elemento dadso, si el elemento no está en la lista arroja un -1 / muestra la posicion del valor del primer alemento que agregué
		//lastindexof busca en relacion al ultimo elemento que se agregó, muestra el último de la lista, el último que se agregó, recorre como de atras para adelante 
		
	/*	DecimalFormat df = new DecimalFormat("#.000"); //decimal format DecimalFormat("#.000") esos 3 ceros me dice donde quiero cortar los decimales 
		
		
		ArrayList<Double> decimales = new ArrayList<Double>(); // Double en los <> es con mayuscula
		
		decimales.add(32.4);// la D al final de Double 
		decimales.add (Double.parseDouble(df.format(Math.random()))); //metodo math random se imprimara *10 / el decimal format lo convierte en string 
		decimales.add(12.456);
		decimales.add(32.34);
		decimales.add(62.4);
		
		
		
		System.out.println("Estos son los decimales de la lista  decimales: "+decimales); //el + concatena textos 
		System.out.println("***************");
		
		ArrayList<Double> deci = new ArrayList<>(); //Doubñle es el tipo, deci es el nombre del arraylist
		
		//deci.add((double) (Math.round((Math.round(Math.random()*10)*1000.0/10)))); // decimales en math random
		deci.add((double) (Math.round((Math.random()*10)*1000.0)/10));

		deci.add(Math.random()*10); 
		//le digo al math random que se corte en ejemplo, tercer decimal (000)
		//el math random solo entrega un numero decimal entre 0 y 1 el entero siempre es 0 porque es un numero entre 0 y 1 no incluye 0 y 1 está entre los dos, entre ambos hay infinitos numeros 
		// si yo esto lo multiplico en este caso por 10, ese numero que entrega (eje 0,002) lo corro un decimal y me da un numero mas elevado con un decimal menos.
		// si multiplico por 10 me entrega un entero mas 9 decimales, como se multiplica por 1000 entrega 3 decimales mas
		// el math round lo redondea al entero mas cercano. como multiplicamos por 1000 
			
		System.out.println(deci);
		System.out.println("***************");
		decimales.addAll(deci);
		System.out.println("***************");
		System.out.println(decimales);
		System.out.println(decimales.size());
		
		*/
		
	
	}

}
