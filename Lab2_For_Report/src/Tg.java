import java.text.NumberFormat;

class Tg implements Function {
    private final Function f;

    public Tg(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.tan(f.evaluate(x));
    }

    public Function derivative() {
        return new Product((new Pow(new Cos(f), -2)), f.derivative());
    }

    public String toPrettyString(NumberFormat nf){
        return "tan(" + f.toPrettyString(nf)+ ")";
    }
}
