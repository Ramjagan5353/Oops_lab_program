class ThreadDemo extends Thread{
    int num;
    ThreadDemo(int num)
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
class Main {
    public static void main(String[] args) {
        ThreadDemo obj1=new ThreadDemo(5);
        ThreadDemo obj2=new ThreadDemo(7);
        obj1.start();
        obj2.start();
    }
}