package delegatePattern;

public class EmployA implements Person{

	@Override
	public void doing(String target) {
		System.out.println("我是员工A，我擅长跑腿");
	}

}
