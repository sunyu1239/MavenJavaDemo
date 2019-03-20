package day0320.proxy;

public class Teacher implements Person {

	@Override
	public void doSomeThing() {
		System.out.println("today is windy!");
	}

	@Override
	public int calCount(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public int plusCount(int a) {
		// TODO Auto-generated method stub
		return a+a;
	}

	@Override
	public void noSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("today is hot!");
	}

}
