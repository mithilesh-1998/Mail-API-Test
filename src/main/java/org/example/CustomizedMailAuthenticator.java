package org.example;



import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


public class CustomizedMailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication(){

        return new PasswordAuthentication(MailConstants.SENDER,"jwjv fsdc xkfy wjkh");
    }
}
