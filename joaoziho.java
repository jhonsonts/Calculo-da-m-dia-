package jojopose;

import java.util.Scanner;
public class joaoziho {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.out.println("Hello, World!"); 
		        
		        float nota1, nota2, nota3, nota4; // Essas são as variáveis criadas para o código 
		        Scanner ler = new Scanner(System.in); // Essse é o Scanner que fara a leitura dos itens no código
		    
		     System.out.printf(" Digite a nota da sua Ac1: "); // Essa é a interface que sera exibida para o usuario
		     nota1 = ler.nextFloat(); // Nossa String, retorna uma cadeia de caracteres simples
		     System.out.printf(" Digite a nota da sua Ac2: "); // Essa é a interface que sera exibida para o usuario
		     nota2 = ler.nextFloat(); // Nossa String, retorna uma cadeia de caracteres simples
		     System.out.printf(" Digite a nota da sua AG: ");  // Essa é a interface que sera exibida para o usuario
		     nota3 = ler.nextFloat(); // Nossa String, retorna uma cadeia de caracteres simples
		     System.out.printf(" Digite a nota da sua prova final: "); // Essa é a interface que sera exibida para o usuario
		     nota4 =  ler.nextFloat (); // Nossa String, retorna uma cadeia de caracteres simples
		    
		double media = (( nota1 * 0.15) + (nota2 * 0.3) + (nota3 * 0.1) + (nota4 * 0.45)); // Nossa variável com um cálculo matemático, para calcular as notas
		System.out.printf(" Sua media final e %f\n:", media); // Essa é a mensagem que sera exibida para o usuario
		if ( media > 5) { // Esse é o nosso " Se ", caso essa informação for verdadeira, ele ira exibir a string abaixo
		System.out.println("APROVADO\n"); // Essa é a interface que sera exibida para o usuario
		}
		else if ( media < 5) // esse é o nosso " se não ", caso a informação acima não for verdadeira, ele ira exibir a string abaixo
		System.out.println("REPROVADO\n"); // Essa é a interface que sera exibida para o usuario
		        
		    }
		
	} 


