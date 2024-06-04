package com.example.demo.models.jsons;
import com.google.gson.Gson;
public class JsonFindRequest {

    private String itSystem;
    private SpecificQuery specificQuery;

    public JsonFindRequest(String itSystem, SpecificQuery specificQuery) {
        this.itSystem = itSystem;
        this.specificQuery = specificQuery;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static class SpecificQuery{
        private MessageClientIdCriteria messageClientIdCriteria;

        public SpecificQuery(MessageClientIdCriteria messageClientIdCriteria) {
            this.messageClientIdCriteria = messageClientIdCriteria;
        }
    }

    public static class MessageClientIdCriteria{
        private String clientId;
        private String cliendIdCriteria;

        public MessageClientIdCriteria(String clientId, String cliendIdCriteria) {
            this.clientId = clientId;
            this.cliendIdCriteria = cliendIdCriteria;
        }
    }
}
