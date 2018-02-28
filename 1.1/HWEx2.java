public class HWEx2{
	public static int maxone(int[] m){
		int max = m[0];

		for (int i = 0; i < m.length; i++ ){
			if(m[i] > max){
				max = m[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		int[]  number = new int[]{9, 2, 15, 2, 22, 10, 6};  
		System.out.println(maxone(number)); 
	}
	
}