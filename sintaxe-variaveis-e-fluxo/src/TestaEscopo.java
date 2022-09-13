
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;;
		// boolean acompanhado = quantidadePessoas >= 2
		
		boolean acompanhado;
		System.out.println();
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
				
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if(idade >= 18 && acompanhado == true) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infezlimente voce nao pode entrar");
		}
		
		
}
}
