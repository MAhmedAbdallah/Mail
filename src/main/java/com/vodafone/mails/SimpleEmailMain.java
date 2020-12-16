/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.mails;

/**
 *
 * @author 3amerjr
 */
import java.util.Properties;
import javax.mail.Authenticator;

import javax.mail.Session;

public class SimpleEmailMain {

    public static void main(String[] args) {

        System.out.println("SimpleEmail Start");

        String smtpHostServer = "smtp.gmail.com";
        String emailID = "########";

        Properties props = System.getProperties();

        props.put("mail.smtp.host", smtpHostServer);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.user", "####");
        props.put("mail.smtp.password", "######");
        Session session = Session.getInstance(props, null);
        EmailUtil em = new EmailUtil();

        em.sendEmail(session, emailID, "SimpleEmail Testing Subject", "SimpleEmail Testing Body");
    }

}
