import java.text.NumberFormat;

class Abs implements Function {
    private final Function f;

    public Abs(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.abs(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(f.derivative(), new Product(f, new Pow(this, -1)));
    }
    public String toPrettyString(NumberFormat nf){
        return "| " + f.toPrettyString(nf) + " |";
    }
}
