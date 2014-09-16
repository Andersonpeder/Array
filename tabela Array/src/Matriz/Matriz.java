package Matriz;

public class Matriz {
	
	public static void main (String args []){
		
	
	
	int [] [] matriz = new int [6][3];
	
	matriz [0] [0] = 1;
	matriz [0] [1] = 6;
	matriz [0] [2] = 5;
	matriz [1] [0] = 10;
	matriz [1] [1] = 14;
	matriz [1] [2] = 1;
	
	
		
	for (int linhas = 0; linhas< 6; linhas++){
		
		for (int colunas = 0; colunas< 3; colunas++){
			
			int resultado = matriz [linhas] [colunas];
			
			System.out.println("Resultado: " + resultado);
		}
		
	}
	//System.out.println
	

}
}