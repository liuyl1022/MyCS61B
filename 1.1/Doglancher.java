public class Doglancher{


	public static void main(String[] args) {
		Dog d1 = new Dog(8);
		Dog d2 = new Dog(30);

		Dog larger = new Dog(Dog.largerone(d1,d2));
		System.out.println(larger.weight);


		Dog larger2 = d1.largerone2(d2);
		System.out.println(larger2.weight);

	}

}