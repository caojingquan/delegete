package delegatePattern;

import java.util.ArrayList;
import java.util.List;

public class Leader implements Person{

	private static final List<Handler> list = new ArrayList<Handler>();
	
	static{
		list.add(new Handler("a",new EmployA()));
		list.add(new Handler("b",new EmployB()));
	}
	@Override
	public void doing(String target) {
		for(int i=0;i<Leader.list.size();i++){
			if(target.equals(list.get(i).getTarget())){
				list.get(i).getPerson().doing(target);
			}
		}
		
	}
	
	static class Handler{
		private String target;
		private Person person;
		
		public Handler(String target,Person person){
			this.target = target;
			this.person = person;
		}

		public String getTarget() {
			return target;
		}

		public Handler setTarget(String target) {
			this.target = target;
			return this;
		}

		public Person getPerson() {
			return person;
		}

		public Handler setPerson(Person person) {
			this.person = person;
			return this;
		}
	}
}
