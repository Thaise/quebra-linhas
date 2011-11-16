import java.util.Scanner;
import java.util.Vector;

public class QuebraLinha {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = entrada.nextLine();
		System.out.print("Digite a quantidade de colunas que deseja separar a frase: ");
		int coluna = entrada.nextInt();
			
		Object[] fraseSeparada = quebrar(frase,coluna);	
		System.out.println("Sua frase: ");
		for(int i = 0; i < fraseSeparada.length; i++){
			System.out.println(fraseSeparada[i]);
		}
		continuar();
	}
	
	private static void continuar(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quebrar outra frase? Digite S para SIM ou N para NÃO: ");
		String continua = entrada.nextLine(); 
		if(continua.equalsIgnoreCase("S")){
			main(null);
		}else if(continua.equalsIgnoreCase("N")){
			System.out.print("Você escolheu parar por aqui. Até a próxima!");
		}else{
			System.out.print("Opção inválida! Digite S para SIM ou N para NÃO: ");
			main(null);
		}	
	}

	public static Object[] quebrar(String frase, int coluna){		 
		Vector fraseSeparada = new Vector();
		String[] separaFrase = frase.split(" ");
		String subFrase = "";
		String espaco = " ";
		
		for(int i = 0; i < separaFrase.length; i++){
			if((subFrase.length() + separaFrase[i].length() + espaco.length()) <= coluna){
				
				if(subFrase.equals("")){
					subFrase = separaFrase[i];
				}else{
					subFrase = subFrase +" "+separaFrase[i];
				}
			}else{
				fraseSeparada.add(subFrase.trim());
				subFrase = separaFrase[i];
			}
		}		
		fraseSeparada.add(subFrase.trim());
		
		return fraseSeparada.toArray();
	}

}