public class SwapCase {

	public static void main(String[] args) {
		
		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertToTitleCase(s));

	}

	private static String convertToTitleCase(String s) {
		// TODO Auto-generated method stub
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}

