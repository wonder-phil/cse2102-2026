package example2;

public class ThreadExtension extends Thread {
	
	Share share;
	
	public ThreadExtension(Share share, String t_name) {
		this.setName(t_name);
		this.share = new Share(9);
	}
	
	@Override
	public void run() {
		/* */
		share.x += 5;
		share.y += 5;
		/* */
		int s = share.getClassSecret();
		if (this.getName() == "Thread_AAA") {
			share.setClassSecret(s+10);
		} else {
			share.setClassSecret(s+100);
		}
	}
}
