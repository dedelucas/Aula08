
public class Desafio05 {
/*A rede de supermercados MercaJava está levando a sério as restrições de isolamento social no Brasil. Estão trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que estão atendendo às solicitações.
Toda a identificação das medidas necessárias é feita através de câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
As funções são:
•	Temperatura: Clientes com temperatura superior a 37,0 graus não podem entrar no estabelecimento.
•	Máscara: Clientes sem máscara não podem entrar no estabelecimento.
•	Famílias: grupos com mais de 2 pessoas não podem entrar no estabelecimento.
•	Função agregadora: só autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
*/
	
	public static boolean temperatura(double medida) {
        if (medida <= 37) {
            return true;
        }return false;
    }
    public static boolean mascara(String mask) {
        if (mask.equals("sim")) {
            return true;
        }return false;
    }
    public static boolean familia(int qtde) {
        if (qtde <=2) {
            return true;
        }return false;
    }
    public static boolean agregadora(double medida, String mask, int qtde) {
        return temperatura(medida) && mascara(mask) && familia(qtde);
    }
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
