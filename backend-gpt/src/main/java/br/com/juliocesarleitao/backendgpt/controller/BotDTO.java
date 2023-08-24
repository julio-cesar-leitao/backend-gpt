package br.com.juliocesarleitao.backendgpt.controller;

import java.util.UUID;

public class BotDTO {

    private UUID uuid;
    private String name;
    private Integer age;
    private String function;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getSaudacao() {
        return "oi, meu nome é " + this.name + ", tenho " + this.age + " anos e minha função é " + this.function;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getFunction() {
        return function;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
