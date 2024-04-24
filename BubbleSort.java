public class BubbleSort<T extends Comparable<T>>
{
    void bs(T arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void display(T a[])
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        BubbleSort<Integer>obj1=new BubbleSort<>();
        Integer arr[]={5,8,1,3,7};
        System.out.println("Before sorting array elements are : ");
        obj1.display(arr);
        obj1.bs(arr);
        System.out.println("After sorting array elements are : ");
        obj1.display(arr);
        String[] arr2={"Ram","R","ram","r"};
        BubbleSort<String> obj2 = new BubbleSort<>();
        System.out.println("Before sorting array elements are : ");
        obj2.display(arr2);
        obj2.bs(arr2);
        System.out.println("After sorting array elements are : ");
        obj2.display(arr2);
        BubbleSort<Double> obj3 = new BubbleSort<>();
        Double[]arr3={145.232,56.345,22.4565};
        System.out.println("Before sorting array elements are : ");
        obj3.display(arr3);
        obj3.bs(arr3);
        System.out.println("After sorting array elements are : ");
        obj3.display(arr3);
    }
}
