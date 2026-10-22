package example2;

public class Share {
	
	public Share(int s) {
		this.secret = s;
	}
	
	public int x = -9;
	public int y = 10;
	
	private int secret = -5;
	
	private static int class_secret;
	
	public void setSecret(int s) { this.secret = s; }
	public int getSecret() { return this.secret; }
	
	public void setClassSecret(int s) { class_secret = s; }
	public int getClassSecret() { return class_secret; }
}
