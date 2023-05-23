import java.text.NumberFormat;

class Ln implements Function {
    private final Function f;

    public Ln(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.log(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Pow(f,-1), f.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf){
        return "ln(" + f.toPrettyString(nf) + ")";
    }
}