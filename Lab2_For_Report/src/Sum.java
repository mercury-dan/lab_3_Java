import java.text.NumberFormat;

class Sum implements Function {
    private final Function f1;
    private final Function f2;

    public Sum(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public double evaluate(double x) {
        return f1.evaluate(x) + f2.evaluate(x);
    }

    public Function derivative() {
        return new Sum(f1.derivative(), f2.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf){
        return "(" + f1.toPrettyString(nf) + "+" + f2.toPrettyString(nf) +  ")";
    }

}
