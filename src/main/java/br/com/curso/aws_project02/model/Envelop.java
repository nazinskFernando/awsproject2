package br.com.curso.aws_project02.model;


import br.com.curso.aws_project02.enums.EventType;

//@Data
public class Envelop {

    private EventType enventType;
    private String data;


    public EventType getEnventType() {
        return enventType;
    }

    public void setEnventType(EventType enventType) {
        this.enventType = enventType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
