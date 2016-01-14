package com.example.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sample2")
public class SampleResource2 {

    @GET
    public String sample() {

        return "Sample Resource2";
    }
}
