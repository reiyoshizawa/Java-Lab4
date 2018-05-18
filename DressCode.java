package Lab4;

public enum DressCode {

    JERSEY("jersey"),
    FANCY("fancy"),
    ANYTHING("anything"),
    UNIFORM("uniform");

    DressCode (String dressName) {
        this.dressName = dressName;
    }

    private String dressName;

    public String getDressName() {
        return dressName;
    }

}
