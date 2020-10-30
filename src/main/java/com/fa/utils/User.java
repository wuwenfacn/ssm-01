package com.fa.utils;

public class User {
    private String username;
    private String password;
    private int age = 10;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public static class Builder {
        private String username;
        private String password;

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    public static void main(String[] args) {
        User user = new Builder()
                .password("12345")
                .username("admin")
                .build();
    }

}
