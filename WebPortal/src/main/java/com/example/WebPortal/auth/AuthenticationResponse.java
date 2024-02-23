package com.example.WebPortal.auth;


public class AuthenticationResponse {
    private final String token;


    public AuthenticationResponse(String token) {
        this.token = token;
    }
    public static Builder builder() {
        return new Builder();
    }

    public String getToken() {
        return token;
    }

    public static class Builder {
        private String token;

        private Builder() {}

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(this.token);
        }
    }

}
