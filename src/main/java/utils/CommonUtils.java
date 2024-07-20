package utils;

public class CommonUtils {
	
	    public static final int IMPLICIT_WAIT_TIME=10;
		public static final int PAGE_LOAD_TIME=15;
		public static final int EXPLICIT_WAIT_BASIC_TIME=30;
		
		public String getEmailWithTimeStamp() {

		String userName = "user" + new java.text.SimpleDateFormat("yymssSSS").format(new java.util.Date())
				+ "@gmail.com";
		return userName;
	}

}
