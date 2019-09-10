// Valter Barboza Lorenzo - 0050014823

package tweet;

public class Tweet {
	private String texto;
	
	public Tweet(String mensagem) {
		if (mensagem.length() >= 140) {
			mensagem = mensagem.substring(0, 140);
		}
		else {
			this.texto = mensagem;
		}
	}

public String getTweet() {
	return this.texto;
}
public void setTweet(String mensagem) {
	this.texto = mensagem;
}
}
