package com.stuff2share;

import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Created by jgao on 2/29/16.
 */
public class HomePageIT {
    @Test
    public void testGetHomePage() throws Exception{
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target("http://localhost:9090");
        Response response = null;
        try {
            response = target.request().get();
            String value = response.readEntity(String.class);
            System.out.println(value);
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

}
