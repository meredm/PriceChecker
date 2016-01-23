import java.util.*;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import com.twilio.sdk.resource.list.*; 

public class TwilioTester {
	public static final String ACCOUNT_SID = "AC4ffa84891105bb6dfaf2a951c9118c79"; 
	 public static final String AUTH_TOKEN = "554fb6f74209ea8c50868db95966c8ab";
	public static void main(String[] args) throws TwilioRestException {
		// TODO Auto-generated method stub

		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
		 
		   // Build the parameters 
		   List<NameValuePair> params = new ArrayList<NameValuePair>(); 
		   params.add(new BasicNameValuePair("To", "+14143315856")); 
		   params.add(new BasicNameValuePair("From", "+16149184239")); 
		   params.add(new BasicNameValuePair("Body", "Hey Jenny! Good luck on the bar exam!")); 
		   params.add(new BasicNameValuePair("MediaUrl", "http://farm2.static.flickr.com/1075/1404618563_3ed9a44a3a.jpg"));  
		 
		   MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
		   Message message = messageFactory.create(params); 
		   System.out.println(message.getSid()); 
	}

}
