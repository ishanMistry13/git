package hackerRank;

public class GenericPractice {

	public static <T> void printArray(T[] t){
		System.out.print("[");
		
		for(T a: t){
			
			System.out.print(a+",");
			
		}
		
		System.out.print("]");
		
	}
	
	
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }

	}

}
