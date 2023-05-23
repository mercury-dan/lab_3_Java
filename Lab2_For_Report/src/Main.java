import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        final Function expression =
                new Sum(
                    new Product( new Constant(2.0),
                    new Pow(
                            new Cos(
                                    new Variable()
                            ), 3
                    )),
                new Product(
                        new Abs(
                                new Product(
                                    new Constant(-3),
                                                new Tg(
                                                        new Sqrt( new Variable())
                                        )
                                )
                        )
                        , new Constant(-1)));


        final Function expression2 = new Product(
                new Product(
                    new Constant(2),
                    new Variable()
                ),
                new Pow(
                        new Pow(
                                new Ln(
                                        new Pow(
                                      new Sum(
                                              new Variable(),
                                              new Product(new Constant(-3),new Constant(-1))
                                      ), 3
                                        )
                                )

                        , 2), -1
                )

        );

        final NumberFormat nf = NumberFormat.getInstance();
        System.out.format("f1(x) = %s", expression.toPrettyString(nf)).println();
        System.out.format("f1'(x) = %s", expression.derivative().toPrettyString(nf)).println();
        System.out.format("f1(" + x +") = %f", expression.evaluate(x)).println();
        System.out.format("f1'(" + x + ") = %f", expression.derivative().evaluate(x)).println();
        System.out.format("f2(x) = %s", expression2.toPrettyString(nf)).println();
        System.out.format("f2'(x) = %s", expression2.derivative().toPrettyString(nf)).println();
        System.out.format("f2(" + x +") = %f", expression2.evaluate(x)).println();
        System.out.format("f2'(" + x + ") = %f", expression2.derivative().evaluate(x)).println();
    }

}