
public class FuncoesComRetorno {
	
	
	public static String dia(int numero) {
		switch(numero) {
		case 1:
			return "Domingo"; //Return para a função e retorna um valor
		case 2:
			return "Segunda";
		case 3:
			return "Terça";
		case 4:
			return "Quarta";
		case 5:
			return "Quinta";
		case 6:
			return "Sexta";
		case 7:
			return "Sabado";
		default:
			return "Dia Invalido";
			
			}
		}
	

	public static void main(String[] args) {
		System.out.println(dia(2));
		
		if(dia(6).equals("Sexta-feira")) {
			System.out.println("Dia de Maldade!");
			
			//String nomeDia =dia(8);
		}

	}

}
