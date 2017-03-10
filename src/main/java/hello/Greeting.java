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

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    private int firstNumber;

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    private int secondNumber;

    public int getResult() {
        result = firstNumber + secondNumber;
        return result;
    }

    private int result;
}
