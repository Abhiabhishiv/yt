class Salary{
    private int sat;
    
    public Salary(int s)
    {
        sat=s;
    }
    public void setsat(int s)
    {
        sat=s;
    }
    public void show()
    {
    System.out.println("salary="+sat);
    }
}
    public class java2
    {
        Salary mysal=new Salary(1500);
        mysal.show();
    }
