package delegatePattern;

public class EmployB implements Person{

	@Override
	public void doing(String target) {
		System.out.println("我是员工B，我擅长跑业务");
	}

}
