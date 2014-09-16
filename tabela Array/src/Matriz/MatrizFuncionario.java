package Matriz;

public class MatrizFuncionario {
	
	public static void main (String args []){
		
		
		
		int [] [] matriz = new int [3][5];
		
		matriz [0] [0] = 002;
		matriz [0] [1] = 3;
		matriz [0] [2] = 1997;
		matriz [0] [3] = 1500;
		matriz [0] [4] = 200;
		matriz [1] [0] = 003;
		matriz [1] [1] = 4;
		matriz [1] [2] = 2000;
		matriz [1] [3] = 8000;
		matriz [1] [4] = 1000;
		matriz [2] [0] = 005;
		matriz [2] [1] = 1;
		matriz [2] [2] = 1985;
		matriz [2] [3] = 3000;
		matriz [2] [4] = 500;
		
		System.out.println("  Funcionário |" + "  cargo  |" + "  ano Cont.  |" + "  Salario  |" + "  V. Refeição|");
			
		
		
		for (int linhas = 0; linhas< 3; linhas++){
			
			for (int colunas = 0; colunas< 5; colunas++){
				
				int resultado = matriz [linhas] [colunas];
				
				if (colunas == 0 ){
					
					System.out.print("     "+resultado);
						
				}else{
					
					if (colunas == 1 ){
						
						System.out.print("            "+resultado);
						
				}else{
					
					if (colunas == 2 ){
						
						System.out.print("         "+resultado);
				
					}else{
						
						if (colunas == 3 ){
							
							System.out.print("         "+resultado);
						}else{
							
							if (colunas == 4 ){
								
								System.out.print("          "+resultado);
								
							}
								
								
							System.out.println(" ");
							
							
						}
					}
				
				
			}
			
		}
		
		

	}
		}
	}
}


