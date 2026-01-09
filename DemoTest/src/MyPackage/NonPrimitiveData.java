package MyPackage;

public class NonPrimitiveData {

	public static void main(String[] args) {
		
		Integer obj = Integer.valueOf(25);  // Wrapper object
		int num = obj.intValue();           // Unboxing manually
		System.out.println(num); 

	}
}
