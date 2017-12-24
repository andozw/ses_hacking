package com.seana;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

public class SesClient {

    private final AmazonSimpleEmailService simpleEmailService;

    static final String FROM = "andosw@gmail.com";
    static final String TO = "andosw@gmail.com";

    static final String SUBJECT = "Amazon SES prototype test";

    // The HTML body for the email.
    static final String HTMLBODY = "<h1>Amazon SES test (AWS SDK for Java)</h1>"
            + "<p>This email was sent with <a href='https://aws.amazon.com/ses/'>"
            + "Amazon SES</a> using the <a href='https://aws.amazon.com/sdk-for-java/'>"
            + "AWS SDK for Java</a>";

    // The email body for recipients with non-HTML email clients.
    static final String TEXTBODY = "This email was sent through Amazon SES "
            + "using the AWS SDK for Java.";

    public SesClient() {

        // AWSCredentialsProvider credentialsProvider = new AWSCredentialsProvider();


        simpleEmailService = AmazonSimpleEmailServiceClientBuilder.standard()
                // .withCredentials(credentialsProvider)
                .withRegion(Regions.US_WEST_2.getName())
                .build();
    }

    public void Send(){
        SendEmailRequest sendEmailRequest = new SendEmailRequest();



        // sendEmailRequest.setMessage();
        // simpleEmailService.sendEmail(sendEmailRequest);
    }
}