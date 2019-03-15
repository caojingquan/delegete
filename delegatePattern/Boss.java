package delegatePattern;

public class Boss {

	void tell(String target,Leader leader){
		leader.doing(target);
	}
	
	public static void main(String[] args) {
		new Boss().tell("b", new Leader());
	}
}
