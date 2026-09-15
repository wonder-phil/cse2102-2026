public class TurkeyAdapts2Duck implements Duck {

	private Turkey turkey;
	
	public TurkeyAdapts2Duck(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i=0; i < 5; i++) {
			turkey.soar();
		}
	}
}