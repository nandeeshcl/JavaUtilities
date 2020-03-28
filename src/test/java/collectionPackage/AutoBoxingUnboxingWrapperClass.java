package collectionPackage;

public class AutoBoxingUnboxingWrapperClass {

	public static void main(String[] args) {
		int a = 10;

		Integer wrapper = new Integer(a); // wrapping or boxing --convert PDT to Object type

		System.out.println("Boxed value: " + wrapper);
		
	//	int x = wrapper.intValue();
		int x = wrapper;

		System.out.println("Unboxed value: " + x);

	}

}
