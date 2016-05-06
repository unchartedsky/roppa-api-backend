package roppa.apibackend.greeting.model;

/**
 * Created by y1sh on 5/6/16.
 */
public class Greeting {
    private long id;
    private String content;

    // Need default constructor for Jackson deserializer in testing phase.
    public Greeting() {
        super();
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

}