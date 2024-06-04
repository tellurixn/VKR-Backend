package com.example.demo.models.jsons;
import com.google.gson.Gson;
public class JsonGetRequest {
    private String itSystem;
    private String routerExtraQueue;
    private SpecificQuery specificQuery;

    public JsonGetRequest(String itSystem, String routerExtraQueue, SpecificQuery specificQuery) {
        this.itSystem = itSystem;
        this.routerExtraQueue = routerExtraQueue;
        this.specificQuery = specificQuery;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static class SpecificQuery{
        private String messageTypeCriteria;

        public SpecificQuery(String messageTypeCriteria){
            this.messageTypeCriteria = messageTypeCriteria;
        }
    }
}
