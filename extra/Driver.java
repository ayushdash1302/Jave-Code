class X{
    int p;
    }
class Y extends X{
    int p;
    Y(int a,int b) {
        super.p=a;      
        p=b;          
        }
    void show() {
         System.out.println("p in super class: " +super.p);
        System.out.println("p in sub class:  " + p);
        }
    }
class Driver{
    public static void main(String args[ ]) {
    Y ob1=new Y(10,20);
    ob1.show();
    }
	}
