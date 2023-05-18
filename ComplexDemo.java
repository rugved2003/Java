public class ComplexDemo {
    public static class Complex {
        double realPart;
        double imaginaryPart;

        public Complex() {
            realPart = 0.0;
            imaginaryPart = 0.0;
        }

        public Complex(double realP, double imaginaryP) {
            realPart = realP;
            imaginaryPart = imaginaryP;

        }

        public Complex add(Complex a) {
            Complex temp = new Complex();
            temp.realPart = a.realPart + realPart;
            temp.imaginaryPart = a.imaginaryPart + imaginaryPart;
            return temp;
        }

        public Complex subtract(Complex a) {
            Complex temp = new Complex();
            temp.realPart = realPart - a.realPart;
            temp.imaginaryPart = imaginaryPart - a.imaginaryPart;
            return temp;
        }

        public Complex multiply(Complex a) {
            Complex temp = new Complex();
            temp.realPart = (realPart * a.realPart) - (imaginaryPart * a.imaginaryPart);
            temp.imaginaryPart = (realPart * a.imaginaryPart) + (imaginaryPart * a.realPart);
            return temp;
        }

        public Complex divide(Complex a) {
            Complex temp = new Complex();
            temp.realPart = ((realPart * a.realPart) + (imaginaryPart * a.imaginaryPart))
                    / ((a.realPart * a.realPart) + (a.imaginaryPart * a.imaginaryPart));
            temp.imaginaryPart = ((imaginaryPart * a.realPart) - (realPart * a.imaginaryPart))
                    / ((a.realPart * a.realPart) + (a.imaginaryPart * a.imaginaryPart));
            return temp;
        }

        public void setRealPart(double realP) {
            realPart = realP;
        }

        public void setImaginaryPart(double imaginaryP) {
            imaginaryPart = imaginaryP;
        }

        public double getRealPart() {
            return realPart;
        }

        public double getImaginaryPart() {
            return imaginaryPart;
        }

        public String toString() {
            String a = "";
            a = realPart + " + " + imaginaryPart + "i ";
            return a;
        }
    }

    public static void main(String args[]) {
        Complex c1 = new Complex();
        c1.setRealPart(3);
        c1.setImaginaryPart(2);
        System.out.println("The first complex Number is " + c1.toString());
        Complex c2 = new Complex(5, 4);
        System.out.println("The second complex Number is " + c2.toString());
        Complex add = c1.add(c2);// c1+c2
        System.out.println("Their Additon is " + add.toString());
        Complex sub = c1.subtract(c2);// c1-c2
        System.out.println("Their subtraction is " + sub.toString());
        Complex mul = c1.multiply(c2);// c1*c2
        System.out.println("Their multiplication is " + mul.toString());
        Complex div = c1.divide(c2);// c1/c2
        System.out.println("The Real Part of Division is " + div.getRealPart());
        System.out.println("The Imaginary Part of Division is " + div.getImaginaryPart());
    }
}