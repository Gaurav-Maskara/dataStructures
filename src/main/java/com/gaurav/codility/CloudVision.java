package com.gaurav.codility;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class CloudVision {
	
	private static final String TARGET_URL ="https://vision.googleapis.com/v1/images:annotate?";
    private static final String API_KEY ="key=ehriuhgekrthernerk";

	
    public static void main(String args[]) throws IOException {

    	URL serverUrl = new URL(TARGET_URL + API_KEY);
    	URLConnection urlConnection = serverUrl.openConnection();
    	HttpURLConnection httpConnection = (HttpURLConnection)urlConnection;

    	httpConnection.setRequestMethod("POST");
    	httpConnection.setRequestProperty("Content-Type", "application/json");
    	httpConnection.setDoOutput(true);

    	
    	BufferedWriter httpRequestBodyWriter = new BufferedWriter(new
                OutputStreamWriter(httpConnection.getOutputStream()));
		
    	httpRequestBodyWriter.write
		("{\"requests\":  [{ \"features\":  [ {\"type\": \"LABEL_DETECTION\""
		+"}], \"image\": {\"source\": { \"gcsImageUri\":"
		+" \"gs://vision-sample-images/4_Kittens.jpg\"}}}]}");
		httpRequestBodyWriter.close();
		
		String response = httpConnection.getResponseMessage();

		if (httpConnection.getInputStream() == null) {
		    System.out.println("No stream");
		    return;
		}

		Scanner httpResponseScanner = new Scanner (httpConnection.getInputStream());
		String resp = "";
		while (httpResponseScanner.hasNext()) {
		    String line = httpResponseScanner.nextLine();
		    resp += line;
		    System.out.println(line);  //  alternatively, print the line of response
		}
		httpResponseScanner.close();
		
		
	}

}
