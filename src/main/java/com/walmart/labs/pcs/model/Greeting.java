package com.walmart.labs.pcs.model;

/**
 * Created by pzhong1 on 12/11/14.
 */
public class Greeting {

    private long id;
    private String content;

    public Greeting(){

    }
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        String strTemplate = "Id: %s, Content: %s";
        return String.format(strTemplate, this.id, this.content);
    }

}