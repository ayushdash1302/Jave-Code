package complex1;

public class Complex {
    int real;
    int img;

    public Complex() {
        real = 5;
        img = 8;
    }

    public Complex(int real1, int img1) {
        real = real1;
        img = img1;
    }

    public void add(Complex ob1, Complex ob2) {
        real = ob1.real + ob2.real;
        img = ob1.img + ob2.img;
    }

    public void show() {
        System.out.println("Complex number is " + real + " + " + img + "i");
    }
}