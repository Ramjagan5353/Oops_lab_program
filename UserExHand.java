class OutOfStock extends Exception
{
    public OutOfStock(String message)
    {
        System.out.println(message);
    }
}
class Grocery
{
    String name;
    int stock;
    public Grocery(String name, int stock)
    {
        this.name=name;
        this.stock=stock;
    }
    public void purchase(int quantity) throws OutOfStock
    {
        if(quantity>stock)
        {
            throw new OutOfStock("Sorry, "+name+" is out of stock.");
        }
        else
        {
            stock-=quantity;
            System.out.println("Purchased = "+name+" "+quantity);
        }
    }
}
class UserExHand
{
    public static void main(String[] args)
    {
        Grocery obj1=new Grocery("Rice bag",15);
        Grocery obj2=new Grocery("Milk",10);
        try
        {
            obj1.purchase(5);
        } 
        catch (OutOfStock e){}
        try
        {
            obj2.purchase(11);
        } 
        catch (OutOfStock e){}
    }
}

