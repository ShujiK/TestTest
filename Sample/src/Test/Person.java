package Test;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
				
	}
	
	 public void sayHello(int hour) {
	        String greeting = generateGreeting(hour);
	        System.out.println(greeting + " " + this.name + "です。" + this.age + "才です。");
	    }

	 private String generateGreeting(int hour) {
	        if (hour >= 6 && hour < 12) {
	            return "おはようございます。";
	        } else if (hour >= 12 && hour < 18) {
	            return "こんにちは。";
	        } else {
	            return "こんばんは。";
	        }
	    }
	}
