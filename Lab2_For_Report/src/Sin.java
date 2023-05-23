import java.text.NumberFormat;

class Sin implements Function {
    private final Function f;

    public Sin(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.sin(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Cos(f), f.derivative());
    }
    public String toPrettyString(NumberFormat nf){
        return "sin(" + f.toPrettyString(nf)+ ")";
    }

}