package hello;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
public class Greeting {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
