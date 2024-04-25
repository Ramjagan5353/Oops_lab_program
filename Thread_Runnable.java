class Thread_Runnable implements Runnable{
    int num;
    Thread_Runnable(int num)
    {
        this.num=num;
    }
    public void run()
    {
        for(int i=1;i<=12;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Thread_Runnable obj1=new Thread_Runnable(5);
        Thread_Runnable obj2=new Thread_Runnable(6);
        obj1.run();
        obj2.run();
    }
}