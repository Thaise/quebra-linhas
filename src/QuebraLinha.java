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
		Vector vectorWorker = new Vector();
		String[] separaFrase = frase.split(" ");
		String separador = "";
		
		for(int i = 0; i < separaFrase.length; i++){
			if((separador.length() + separaFrase[i].length()) < coluna){
				separador = separador + separaFrase[i]+" ";
			}else if((separador.length() + separaFrase[i].length()) == coluna){
				separador = separador + separaFrase[i];
				vectorWorker.add(separador.trim());
				separador = "";
			}else{
				vectorWorker.add(separador.trim());
				separador = "";
				i--;
			}
		}		
		vectorWorker.add(separador.trim());
		
		return vectorWorker.toArray();

	}

}
