/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class URLs {

    /**
     *
     * @param urlAddress URL address to send request too
     * @throws IOException Exception thrown when URL connection cannot be established
     */
    public void urlGetter(String urlAddress) throws IOException{
        URLConnection yc;
        String inLine;
        try {
            URI uri = new URI(urlAddress);
            URL url = uri.toURL();

            yc = url.openConnection();
            yc.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            while ((inLine = in.readLine()) != null) {
                System.out.println(inLine);
            }

        }catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }
    
}
