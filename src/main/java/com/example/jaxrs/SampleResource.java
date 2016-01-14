package com.example.jaxrs;

import java.security.cert.X509Certificate;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import com.example.model.JSon;
import com.example.model.Links;
import com.example.model.Self;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("sample")
public class SampleResource {

    @GET
    @Produces("application/json")
    public String sample() throws JsonProcessingException {
		Self self = new Self("/ucwa/v1/applications/551/me/location");
		Links links = new Links(self);
		JSon location = new JSon("location","北区王子",links);
		ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(location);

        return json;

//        return "get Sample Resource";
    }
    @POST
    @Path("/{id2}")
    public String post(@FormParam("id") String id,
    		@FormParam("name") String name,
    		@PathParam("id2") String id2) {


        return "id="+id+"&name="+name+"&id2="+id2;
    }
    @PUT
    @Path("/get")
    public String get(@Context HttpServletRequest request) {
    	//クライアント証明書取得
    	//ただし、証明書はクライアント認証に使う物ではない
    	//というか認証局が違うから使えないと思うので、
    	//BASE64でエンコードされた文字列がパラメータでくると想定される。
    	X509Certificate[] certChain = (X509Certificate[]) request.getAttribute("javax.servlet.request.X509Certificate");
        if (certChain == null || certChain.length == 0){
            return null;
        }
        X509Certificate certificate = certChain[0];
        return "Sample Resource";
    }


}
