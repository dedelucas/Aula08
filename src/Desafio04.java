import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
	 * */
	
	/*O salário dos professores de escolas particulares em
	 * São Paulo é composto da seguinte forma 
	 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
		
	System.out.println("Para calcular seu salário base precisamos saber quantas aulas semanais o professor tem na instituição");
	numeroAulas = leitor.nextInt();
	
	System.out.println("Qual o valor hora aula praticado nesta instituição?");
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
	    	
	    	System.out.println("Informe seu número de aulas");
	    	numeroAulas = leitor.nextInt();
	    	
	    	System.out.println("Informe sua hora aula");
	    	horaAula = leitor.nextDouble();

	    	System.out.println("Salário base" + salarioBase(numeroAulas, horaAula));
	    	System.out.println("Hora atividade" + horaAtividade(salarioBase(numeroAulas, horaAula)));
	    	System.out.println("DSR" + descansoSemanalRemunerado(salarioBase(numeroAulas, horaAula), horaAtividade(salarioBase(numeroAulas, horaAula))));
	    	System.out.println("SALÁRIO TOTAL" + calcularSalario(numeroAulas, horaAula));
	    	
	    	leitor.close();
	  
	}
}
