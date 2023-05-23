import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	HashMap<String, ArrayList<String>> paiseshash;
	ArrayList<String> ciudadesList;
	String paises;
	String ciudad;
	
	
	public Procesos() {
		
		paiseshash=new HashMap<String, ArrayList<String>>();
		
		iniciar();
	}

	
	public void imprimirResultados() {
		System.out.println("cantidad total de paises: "+paiseshash.size());
		System.out.println("cantidad total de ciudades "+paiseshash.size());
	}
	
	
	private void iniciar() {
		
		String resp="";
		
		do {
			ingresarDatos();
			
			resp=JOptionPane.showInputDialog("ingrese SI para resgistrar mas paises");
		} while (resp.equalsIgnoreCase("si"));
		
		
		System.out.println(paiseshash);
		
		imprimirResultados();
		
		
		
	}

	private void ingresarDatos() {
		ciudadesList=new ArrayList<String>();
		
		paises=JOptionPane.showInputDialog("Ingrese el pais");
		ciudad=JOptionPane.showInputDialog("Ingrese la ciudad");
		
		ciudadesList.add(paises);
		ciudadesList.add(ciudad);
		
		paiseshash.put(ciudadesList.get(0), ciudadesList);
	
		System.out.println("este es el arraylist paises/ciudades"+ciudadesList);
		
			
		
		
	}

}
