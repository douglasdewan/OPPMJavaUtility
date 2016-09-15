/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsdewan.oppmjavautility;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

/**
 *
 * @author Doug DeWan
 */

public class OPPMWSClient {
    private String COOKIE;
    private static final String PSPNS="psp";

    public boolean Login(OPPMJavaUtilityEnvironment oWSEnvsIn) throws Exception{
            try {
                String pspNSURL="http://prosight.com/wsdl/5.0/psPortfoliosSecurity/";

                COOKIE = "";

                SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
                SOAPConnection connection = sfc.createConnection();

                MessageFactory factory = MessageFactory.newInstance();

                SOAPMessage soapMsg = factory.createMessage();
                SOAPPart part = soapMsg.getSOAPPart();
                SOAPEnvelope envelope = part.getEnvelope();
                envelope.addNamespaceDeclaration(PSPNS, pspNSURL);

                MimeHeaders headers = soapMsg.getMimeHeaders();
                headers.addHeader("SOAPAction", "http://prosight.com/wsdl/5.0/psPortfoliosSecurity/Login");


                SOAPBody sb = soapMsg.getSOAPBody();

                QName bodyName = new QName(pspNSURL, "Login",PSPNS);
                SOAPBodyElement bodyElement = sb.addBodyElement(bodyName);

                QName user = new QName(pspNSURL,"sUser",PSPNS);
                SOAPElement userElement = bodyElement.addChildElement(user);
                userElement.addTextNode(oWSEnvsIn.getUserName());
                //userElement.addTextNode("admin");

                QName pwd = new QName(pspNSURL,"sPassword",PSPNS);
                SOAPElement pwdElement = bodyElement.addChildElement(pwd);
                pwdElement.addTextNode(oWSEnvsIn.getPassword());

                QName timeout = new QName(pspNSURL,"lTimeOut",PSPNS);
                SOAPElement toElement = bodyElement.addChildElement(timeout);
                toElement.addTextNode(String.valueOf(oWSEnvsIn.getTimeOut()));


                soapMsg.writeTo(System.out);

                System.out.println();

                URL endpoint = new URL(oWSEnvsIn.getServer() + oWSEnvsIn.getWebServiceLocation() + "/psPortfoliosSecurity.asmx");
                SOAPMessage response = connection.call(soapMsg, endpoint);

                response.writeTo(System.out);
                System.out.println();

                MimeHeaders respHeaders = response.getMimeHeaders();

                if(respHeaders.getHeader("Set-Cookie")!=null)
                {
                    COOKIE = respHeaders.getHeader( "Set-Cookie")[0].substring(0,respHeaders.getHeader( "Set-Cookie")[0].indexOf(';'));
                    oWSEnvsIn.setLoginCookie(COOKIE);
                    return true;
                }

                return false;
            } catch (SOAPException | UnsupportedOperationException | IOException e) {
                throw e;
            }

        }


}