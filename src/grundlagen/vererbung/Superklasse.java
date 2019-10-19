package grundlagen.vererbung;

public class Superklasse {

    public String publicVar;
    protected String protectedVar;
    String packagePrivateVar;
    private String privateVar;

    protected String getPrivateVar() {
        return this.privateVar;
    }

    protected void setPrivateVar(String text) {
        this.privateVar = text;
    }
}
