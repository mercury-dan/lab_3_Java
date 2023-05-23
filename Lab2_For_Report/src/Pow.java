import java.text.NumberFormat;

class Pow implements Function {
    private final Function base;
    private final double exponent;

    public Pow(Function base, double exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public double evaluate(double x) {
        return Math.pow(base.evaluate(x), exponent);
    }

    public Function derivative() {
        return new Product(
                new Constant(exponent),
                new Product(
                        new Pow(base, exponent - 1),
                        base.derivative())
        );
    }

    @Override
    public String toPrettyString(NumberFormat nf){
        return "(" + base.toPrettyString(nf) + "^" + exponent + ")";
    }

}