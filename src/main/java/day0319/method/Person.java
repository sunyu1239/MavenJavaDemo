package day0319.method;

public class Person {
    private String name;
    private String address;
    private int age;
    private String sex;
    public String father;
    public int money;
    public Person() {
    	
    }
    public Person(String name) {
        this.name=name;
    }
    public Person(int age) {
        this.age=age;
    }
    public Person(String name,String sex,int age,String address) {
        this.name=name;
        this.sex=sex;
        this.address=address;
        this.age=age;
    }
    private Person(String name,String sex) {
        this.name=name;
        this.sex=sex;
    }
    private Person(String name,String sex,String address) {
        this.name=name;
        this.sex=sex;
        this.address=address;
    }
    private Person(String name,String sex,String address,int age) {
        this.name=name;
        this.sex=sex;
        this.address=address;
        this.age=age;
    }
	public String getName() {
		System.out.println("111111");
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
    
	private void sayHello(int a) {
		System.out.println("hello,this is a language,do you want it");
		System.out.println(a*a);
	}
}
