import java.util.*;

class Structt {
    String name;
    int roll;
    float mark;

    void input() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter name of a 1st student ");
        name = Sc.next();
        System.out.println("Enter roll number of students ");
        roll = Sc.nextInt();
        System.out.println("Enter mark number of students ");
        mark = Sc.nextFloat();
    }

    void show() {
        System.out.println(" name= " + name);
        System.out.println(" roll= " + roll);
        System.out.println(" mark= " + mark);
    }

    void display(String name1, int roll1, float mark1) {
        name = name1;
        roll = roll1;
        mark = mark1;
    }

    void assign(Structt st4) {
        name = st4.name;
        roll = st4.roll;
        mark = st4.mark;
    }
}

class DemoStudent {
    public static void main(String[] args) {

        Structt st1 = new Structt();
        st1.input();
        System.out.println(" detail of the 1st a student");
        st1.show();
        Structt st2 = new Structt();
        st2.display("AAAA", 98, 675.42f);
        System.out.println(" detail of the 2nd a student");
        st2.show();
        Structt st3 = new Structt();
        st3.assign(st2);
        System.out.println(" detail of the 3rd a student");
        st3.show();
    }

}
