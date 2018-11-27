package webAutomationChrome;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("sendemailseleniumtest@gmail.com", "Testing123!"));
		email.setSSLOnConnect(true);
		email.setFrom("user@gmail.com");
		email.setSubject("Test report");
		email.setMsg("Everything was successfull!");
		email.addTo("josefine302@hotmail.com");
		email.send();
	}

}
