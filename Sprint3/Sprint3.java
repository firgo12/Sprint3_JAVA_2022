import java.util.Scanner;
public class Sprint3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdEquipes = 0,pontuacaoV =0, pontuacaoE =0, pontuacaoD =0, crescentePont=0, crescenteNumEquipe=0;
		double crescenteNota=0;
		
		//A)
		System.out.print("Digite a quantidade de equipes que existem na Ronocup: ");
		qtdEquipes = entrada.nextInt();
		
		while (qtdEquipes > 100){
			System.out.print("Digite NOVAMENTE a quantidade de equipes que existem na Ronocup, lembre-se o máximo é até 100: ");
			qtdEquipes = entrada.nextInt();
		}
		
		int [] arrayNumEquipe = new int [qtdEquipes];
		int [] arrayPontuacao = new int [qtdEquipes];
		double [] arrayNotaDesign = new double [qtdEquipes];
		
		for (int i =0; i < qtdEquipes;i++) {
			arrayNumEquipe[i] = 11 + i;
		}
		
		//B)
		System.out.println("------------------------------------------------");
		for(int i =0; i < qtdEquipes;i++) {
			System.out.println("---------------- Equipe numº"+arrayNumEquipe[i]+" ----------------");
			System.out.print("Digite o número de Vítórias: ");
			pontuacaoV = entrada.nextInt();
			System.out.print("Digite o número de Empate: ");
			pontuacaoE = entrada.nextInt();
			System.out.print("Digite o número de Derrota: ");
			pontuacaoD = entrada.nextInt();
			
			arrayPontuacao[i] = (pontuacaoV*5) + (pontuacaoE*3) + (pontuacaoD*0);
			
			System.out.println("");
			System.out.print("Digite a nota do Design: ");
			arrayNotaDesign[i] = entrada.nextDouble(); 
		}//fim for
		
		for(int i =0; i < (qtdEquipes-1);i++) {
			for(int j=1;j<qtdEquipes;j++){
				if(arrayPontuacao[j] > arrayPontuacao[j-1]){
						crescentePont = arrayPontuacao[j-1];
						arrayPontuacao[j - 1] = arrayPontuacao[j];
						arrayPontuacao[j] = crescentePont;
						 
						crescenteNumEquipe = arrayNumEquipe[j-1];
						arrayNumEquipe[j-1] = arrayNumEquipe[j];
						arrayNumEquipe[j] = crescenteNumEquipe;
						
						crescenteNota = arrayNotaDesign[j-1];
						arrayNotaDesign[j-1] = arrayNotaDesign[j];
						arrayNotaDesign[j] = crescenteNota;
					 }
				
				if(arrayPontuacao[j] == arrayPontuacao[j-1]) {
					if(arrayNotaDesign[j] > arrayNotaDesign[j-1]) {
						crescentePont = arrayPontuacao[j-1];
						arrayPontuacao[j - 1] = arrayPontuacao[j];
						arrayPontuacao[j] = crescentePont;
						 
						crescenteNumEquipe = arrayNumEquipe[j-1];
						arrayNumEquipe[j-1] = arrayNumEquipe[j];
						arrayNumEquipe[j] = crescenteNumEquipe;
						
						crescenteNota = arrayNotaDesign[j-1];
						arrayNotaDesign[j-1] = arrayNotaDesign[j];
						arrayNotaDesign[j] = crescenteNota;
					}
				}
				
			}
			
		}//fim for
		
		System.out.println("-------------------- Relatório ----------------------------");
		
		for(int i =0; i < qtdEquipes;i++) {
			System.out.println((i+1)+"º - 	Pontuação da equipe nº"+arrayNumEquipe[i]+" é: "+arrayPontuacao[i]);
			
		}

	}

}
