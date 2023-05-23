import java.text.NumberFormat;
class Sqrt implements Function {
    private final Function f;

    public Sqrt(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.sqrt(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Product(new Constant(0.5), new Pow(f, -0.5)), f.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return "sqrt(" + f.toPrettyString(nf) + ")";
    }
}