/* isAlive() method */
class A extends Thread
{
}
class B  
{
    public static void main(String[] args) {
        
        A t1=new A();
        A t2=new A();
        
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive()); 

        System.out.println(t2.isAlive()); 
        t2.start();
        System.out.println(t2.isAlive()); 
    }
}
