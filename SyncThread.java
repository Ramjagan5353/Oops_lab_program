class SyncThread{
    synchronized public void mul(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
class Thread1 extends Thread{
    int n;
    SyncThread obj;
    Thread1(int n,SyncThread obj)
    {
        this.obj=obj;
        this.n=n;
    }
    public void run()
    {
        obj.mul(n);
    }
}
class Thread2 extends Thread{
    int n;
    SyncThread obj;
    Thread2(int n,SyncThread obj)
    {
        this.obj=obj;
        this.n=n;
    }
    public void run()
    {
        obj.mul(n);
    }
}
class Main{
    public static void main(String[] args) {
        SyncThread obj=new SyncThread();
        Thread1 obj1=new Thread1(5,obj);
        Thread2 obj2=new Thread2(7,obj);
        obj1.start();
        obj2.start();
    }
}