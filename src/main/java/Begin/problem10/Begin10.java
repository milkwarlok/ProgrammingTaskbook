package Begin.problem10;
/*
* Statement:
* Begin10*. Даны два ненулевых числа. Найти сумму, разность, произведение и
частное их квадратов.
* */
public class Begin10 {

    public static SquaresSummary squaresSummary(double a, double b){
        return SquaresSummary.of(a, b);
    }

    static public class SquaresSummary{
        private double sum;
        private double difference;
        private double product;
        private double quotient;

        private SquaresSummary(double sum, double difference, double product, double quotient) {
            this.sum = sum;
            this.difference = difference;
            this.product = product;
            this.quotient = quotient;
        }

        public static SquaresSummary of(double a, double b){
            if(b == 0){
                throw new IllegalArgumentException("b must not equal to 0.");
            }
            double a2 = a*a;
            double b2 = b*b;
            return new SquaresSummary(a2 + b2, a2 - b2, a2*b2, a2/b2);
        }

        public double getSum() {
            return sum;
        }

        public double getDifference() {
            return difference;
        }

        public double getProduct() {
            return product;
        }

        public double getQuotient() {
            return quotient;
        }
    }
}
