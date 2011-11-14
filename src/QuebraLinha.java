import java.util.Scanner;
import java.util.Vector;

public class QuebraLinha {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = entrada.nextLine();
		System.out.print("Digite a quantidade de colunas que deseja separar a frase: ");
		int coluna = entrada.nextInt();
			
		Object[] listaPalavras = quebrar(frase,coluna);	
		System.out.println("Sua frase: ");
		for(int i = 0; i < listaPalavras.length; i++){
			System.out.println(listaPalavras[i]);
		}
		continuar();
	}
	
	private static void continuar(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quebrar outra frase? Digite S para SIM ou N para N�O: ");
		String continua = entrada.nextLine(); 
		if(continua.equalsIgnoreCase("S")){
			main(null);
		}else if(continua.equalsIgnoreCase("N")){
			System.out.print("Voc� escolheu parar por aqui. At� a pr�xima!");
		}else{
			System.out.print("Op��o inv�lida! Digite S para SIM ou N para N�O: ");
			main(null);
		}	
	}

	public static Object[] quebrar(String frase, int coluna){	
		Vector vectorWorker = new Vector();
		String[] separa = frase.split(" ");
		String separador = "";
		
		for(int i = 0; i < separa.length; i++){
			if((separador.length() + separa[i].length()) < coluna){
				separador = separador + separa[i]+" ";
			}else if((separador.length() + separa[i].length()) == coluna){
				separador = separador + separa[i];
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