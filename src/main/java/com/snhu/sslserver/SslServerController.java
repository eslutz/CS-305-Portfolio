package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SslServerController {
    @RequestMapping("/checksum")
    public String checksum(@RequestParam(value = "data", defaultValue = "Hello World Check Sum!")
	String data) throws NoSuchAlgorithmException{
    	// Declare constants with data to encrypt and the cipher to use.
    	final String name = "Eric Slutz", algorithmCipher = "SHA-512";
    	
    	// Initialize an instance of the selected encryption algorithm.
    	MessageDigest md = MessageDigest.getInstance(algorithmCipher);
    	
    	// Get the hash of the data
    	byte[] encodedhash = md.digest(data.getBytes(StandardCharsets.UTF_8));
    	
    	// Convert value from bytes to hex to display as checksum.
    	String checksumValue = bytesToHex(encodedhash);
    	
    	// Return HTML containing the required information to display.
        return "<p style='overflow-wrap: anywhere;'>Name: " + name +
        		"<br/><br/>Data: " + data +
        		"<br/><br/>Checksum Value: " + checksumValue + "</p>";
    }
    
    // Function for converting a byte array to a Hex string.
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
