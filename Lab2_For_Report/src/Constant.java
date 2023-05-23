import java.text.NumberFormat;

class Constant implements Function {
    private final double value;


    public Constant(double value) {
        this.value = value;
    }

    public double evaluate(double x) {
        return value;
    }

    public Function derivative() {
        return new Constant(0);
    }
    @Override
    public String toPrettyString(NumberFormat nf){
        return nf.format(value);
    }

}