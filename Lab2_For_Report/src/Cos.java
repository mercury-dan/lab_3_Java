import java.text.NumberFormat;

class Cos implements Function {
    private final Function f;

    public Cos(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.cos(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Constant(-1), new Product(new Sin(f), f.derivative()));
    }
    @Override
    public String toPrettyString(NumberFormat nf){
        return "cos(" + f.toPrettyString(nf)+ ")";
    }
}