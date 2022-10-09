public class adhar {

	public static boolean isValidAdhar(String adhar) {
		
		
		return adhar !=null && adhar.matches("[0-9]{16}");
		
	}
	
	public static void main (String[] args) {
		System.out.println(isValidAdhar("1234569877894561"));
	}
}
