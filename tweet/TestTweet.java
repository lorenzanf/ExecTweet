// Valter Barboza Lorenzo - 0050014823s

package tweet;

import java.util.Scanner;

public class TestTweet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o seu login:");
		String usu= input.nextLine();
		System.out.println("Entre com a sua senha:");
		String pass = input.nextLine();
		Usuario user = new Usuario(usu, pass);
		int confere = 1;

		while (confere == 1) {

			System.out.println("Entre com seu tweet:");
			String tweet = input.nextLine();
			user.tweetar(tweet);

			System.out.println("Quer continuar tweetando?");
			
			if (!input.nextLine().equalsIgnoreCase("sim")) {
				confere = 0;
			}

		}

		user.listagemTweets();
		
		input.close();

	}

}
