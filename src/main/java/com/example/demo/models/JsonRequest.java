package com.example.demo.models;

import com.google.gson.Gson;

public class JsonRequest {
    private String itSystem;
    private RequestMessage requestMessage;

    public JsonRequest(String itSystem, RequestMessage requestMessage) {
        this.itSystem = itSystem;
        this.requestMessage = requestMessage;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static class RequestMessage {
        private String messageType;
        private RequestMetadata requestMetadata;
        private RequestContent requestContent;

        public RequestMessage(String messageType, RequestMetadata requestMetadata, RequestContent requestContent) {
            this.messageType = messageType;
            this.requestMetadata = requestMetadata;
            this.requestContent = requestContent;
        }
    }

    public static class RequestMetadata {
        private String clientId;
        private boolean testMessage;

        public RequestMetadata(String clientId, boolean testMessage) {
            this.clientId = clientId;
            this.testMessage = testMessage;
        }
    }

    public static class RequestContent {
        private Content content;

        public RequestContent(Content content) {
            this.content = content;
        }
    }

    public static class Content {
        private MessagePrimaryContent messagePrimaryContent;

        public Content(MessagePrimaryContent messagePrimaryContent) {
            this.messagePrimaryContent = messagePrimaryContent;
        }
    }

    public static class MessagePrimaryContent {
        private String any;

        public MessagePrimaryContent(String any) {
            this.any = any;
        }
    }

}

