public class Dog{

	static int weight;

	public Dog(int i){
		weight = i;
	}

	public static void makeNoise(){

		if(weight <10 ) {
			System.out.println("yak!");	
		}else if(weight < 30 ){
			System.out.println("bark!");
		}else{
			System.out.println("woooooof!");
		}

	}

	public static int largerone(Dog x, Dog y){
		if(x.weight > y.weight){
			return x.weight;
		}else{
			return y.weight;
		}
	}

	public Dog largerone2(Dog y){
		if (this.weight > y.weight){
			return this;
		}else{
			return y;
		}
	}



}