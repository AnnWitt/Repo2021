package z20210822.varargs;

public enum TypSilnikaEn {
    Elektryczny("ddd"),
    Benzynowy("dddd"),
    Diesel("ffff"),
    hybryda("sfsf");

    private String desc;


    TypSilnikaEn(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
