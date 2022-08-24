package Creational.Singleton.src;


class SingletonPattern {

    private static SingletonPattern sobj;
    
   // private constructor is used to disallow creating object of this class from outside
    private SingletonPattern() {      
    }
   // getInstance() method is used to get the only object of this class
    public static SingletonPattern getInstance() {
 
       // create object if it's not already created
       if(sobj == null) {
          sobj = new SingletonPattern();
       }
 
        // returns the singleton object
        return sobj;
    }
 
    public void checkWorking() {
        System.out.println("Your Singleton Object is Working");
    }
 }
 
 class Main {
    public static void main(String[] args) {
       SingletonPattern db1; // reference to SingletonPattern
       SingletonPattern db2; // reference to SingletonPattern
 
       // since no object is already instantiated, new object is created
       db1= SingletonPattern.getInstance(); 
       db1.checkWorking();
       
       // here same object is returned since it's already instantiated
       db2= SingletonPattern.getInstance(); 
       db2.checkWorking();

      // in singleton pattern there can be only one object
      // to check whether both objects are same or not 
       System.out.println(db1);
       System.out.println(db2);
    }
 }
 