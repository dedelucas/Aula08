import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 * */
	
	/*O sal�rio dos professores de escolas particulares em
	 * S�o Paulo � composto da seguinte forma 
	 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
		
	System.out.println("Para calcular seu sal�rio base precisamos saber quantas aulas semanais o professor tem na institui��o");
	numeroAulas = leitor.nextInt();
	
	System.out.println("Qual o valor hora aula praticado nesta institui��o?");
	horaAula = leitor.nextDouble();
	
	salarioBase = numeroAulas * 4.5 * horaAula;
	horaAtividade = salarioBase * 0.05;
	descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
	salario = salarioBase + horaAtividade + descansoSemanalRemunerado;*/
	
		
	public static double salarioBase(double numeroAula, double horaAula) {				
		return numeroAula * 4.5 * horaAula;
	}
	
	
	public static double horaAtividade(double salarioBase) {				
		return salarioBase * 0.05;
	}
	
	public static double descansoSemanalRemunerado(double salarioBase, double horaAula) {				
		return (salarioBase + horaAtividadee) / 6;
	}
	
	public static double calcularSalario(double numeroAula, double horaAula) {				
		double sb = salarioBase(numeroAula, horaAula);
		double ha = horaAtividade(sb);
		double dsr = descansoSemanalRemunerado(sb, ha);
		
	    return sb + ha + dsr;
	
	
	    
	    public static void main(String[] args) {
	    	
	    }
	    	Scanner leitor = new Scanner(System.in);
	    	
	    	int numeroAula;
	    	double horaAula;
	    	
	    	System.out.println("Informe seu n�mero de aulas");
	    	numeroAulas = leitor.nextInt();
	    	
	    	System.out.println("Informe sua hora aula");
	    	horaAula = leitor.nextDouble();

	    	System.out.println("Sal�rio base" + salarioBase(numeroAulas, horaAula));
	    	System.out.println("Hora atividade" + horaAtividade(salarioBase(numeroAulas, horaAula)));
	    	System.out.println("DSR" + descansoSemanalRemunerado(salarioBase(numeroAulas, horaAula), horaAtividade(salarioBase(numeroAulas, horaAula))));
	    	System.out.println("SAL�RIO TOTAL" + calcularSalario(numeroAulas, horaAula));
	    	
	    	leitor.close();
	  
	}
}
