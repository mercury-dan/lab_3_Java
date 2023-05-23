import java.text.NumberFormat;

class Product implements Function {
    private final Function f1;
    private final Function f2;

    public Product(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public double evaluate(double x) {
        return f1.evaluate(x) * f2.evaluate(x);
    }

    public Function derivative() {
        return new Sum(new Product(f1.derivative(), f2), new Product(f1, f2.derivative()));
    }

    @Override
    public String toPrettyString(NumberFormat nf){
        return "(" + f1.toPrettyString(nf) + " * " + f2.toPrettyString(nf) + ")";
    }
}
