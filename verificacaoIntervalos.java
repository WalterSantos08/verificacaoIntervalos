public class verificacaoIntervalos {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		
		
		System.out.println("digite a posiçõa: ");
		double posicao = dados.nextDouble();
		
		if (posicao >= 0 && posicao <= 25.0 ) {
			System.out.println("intervalo entre 0 e 25");
		}
		else if (posicao >= 25.1 && posicao <= 50) {
			System.out.println("intervalo entre 25 e 50");
		}
		else if (posicao >= 50.1 && posicao <= 75.0) {
			System.out.println("intervalo entre 50 e 75");
		}
		else if (posicao >= 75.1 && posicao <= 100) {
			System.out.println("intervalo entre 75 e 100");
		}else {
			System.out.println("fora de intervalo");
		}
		
		dados.close();

	}

}
