package objEqu;

class Dog{
	private int weight;
	private int height;
	
	public void setWeight(int a){
		weight = a;
	}
	public int getWeight(){
		return weight;
	}
}

public class Test {
	public static void main(String[] args){
		Dog a = new Dog();
		Dog b = new Dog();
		a.setWeight(1);
		b.setWeight(1);
		boolean c;
		if(a.getWeight() == b.getWeight()){
			c = true;
		}
		else{
			c = false;
		}
		System.out.println(c);
	}
}
//Above uses Encapsulation, which is a standard way to write code. Using getter and setter
//class Dog{
//	int weight;
//	int height;
//}
//public class Test{
//	public static void main(String[] args){
//		Dog a = new Dog();
//		Dog b = new Dog();
//		a.weight = 1;
//		b.weight = 1;
//		boolean c;
//		if(a.weight == b.weight){
//			c = true;
//		}
//		else{
//			c = false;
//		}
//		System.out.println(c);
//	}
//}