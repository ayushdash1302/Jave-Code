class Test{
    void sum(int a, int b){
        System.out.println("int arg method invoked");
    }
    void sum(double a, double b){
        System.out.println("double arg method invoked");
    } 
 }
class BTest{  
      public static void main(String args[]){  
          Test obj=new Test();  
          obj.sum(20,30);  
      }  
}      
