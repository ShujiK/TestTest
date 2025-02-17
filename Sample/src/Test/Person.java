package Test;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
				
	}
	
	public void sayHello(int time) {
		
		String text ="";
		
		if(5<time && time<10) {
			text = "おはようございます。";
		} else if(10<=time && time<17) {
			text = "こんにちは。";
		} else {
			text = "こんばんは。";
		}
		
		System.out.println(text + name + "です。" + age + "才です。");
	}
	

}
