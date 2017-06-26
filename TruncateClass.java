public class TruncateClass {
	public static String TRUNCATEDSTRING=" ... (truncated) ... ";
	public static void main(String[] args) {
		String truncatedOrderDetails =truncate("123456789012345678901234567890", 25 );
		System.out.println("Result : "+truncatedOrderDetails +"\t and Result Length is "+truncatedOrderDetails.length());

		truncatedOrderDetails =truncate("1234567890", 5 );
		System.out.println("Result : "+truncatedOrderDetails +"\t and Result Length is "+truncatedOrderDetails.length());

		truncatedOrderDetails =truncate("123456789012345678901234567890", 31 );
		System.out.println("Result : "+truncatedOrderDetails +"\t and Result Length is "+truncatedOrderDetails.length());
	}
	private static String truncate(String orderDetails, int characterCounts) {
		//case 1: Putting truncated string make orginal string larger thus no change in input.
		//or
		//case 2: The number of characters in orginal string is less than number of characters required thus no change.
		if(characterCounts<=TRUNCATEDSTRING.length()+1 || orderDetails.length()<=characterCounts){
			//System.out.println("No change 1");
			return orderDetails;
		}
		else{
			/*System.out.println("input length : "+orderDetails.length());
			System.out.println("character characterCountss : "+characterCounts);
			System.out.println("input length middle : "+TRUNCATEDSTRING.length());
			 */
			int adjust=characterCounts-TRUNCATEDSTRING.length();
			//System.out.println(" Adjust orderDetails :"+adjust);
			//System.out.println(Math.floor(adjust/2.0) +":"+Math.ceil(adjust/2.0));
			orderDetails=orderDetails.substring(0, (int) Math.ceil(adjust/2.0))+TRUNCATEDSTRING+orderDetails.substring((int) (orderDetails.length()-(Math.floor(adjust/2.0))), orderDetails.length());
			//System.out.println("cal length: "+test.length()+"\tcal :"+test);
			return orderDetails;
		}
	}
}
