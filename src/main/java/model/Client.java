package model;

public class Client {
    private String name;
    private String ci;

    public Client(final String name, final String ci) {
        this.name = name;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}
