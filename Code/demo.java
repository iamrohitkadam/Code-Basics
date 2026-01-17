public class demo {

    public class myClass{
        
    public void example(){
        System.out.println("Hello");
    }
    }
        
        
        public class myNewClass extends myClass {
        @Override
        public void example(){
            System.out.println("WOrld");
        }
        }
    
    
    
    public static void main(String[] args) {
        demo demo = new demo();
        demo.myClass mClass = demo.new myClass();
        mClass.example();
        // String a = "Hello";
        // a = "New";
        // String b = "New";
        // //String c = a + b;
        // System.out.println(a.equals(b));
        

    }
}
