class student
{
    int roll;
    String name;
    void input(String name,int roll)
    {
        this.roll=roll;
        this.name=name;
        System.out.println("Roll no. = "+this.roll);
        System.out.println("Name = "+ this.name);
    }
}
class test extends student
{
    int sub1, sub2;
    void inputmarks(int m1,int m2)
    {
        sub1=m1;
        sub2=m2;
    }
}
interface sportsmarks
{
    int sm=86;
    void sportsmarks();
}
class result extends test implements sportsmarks
{
    public void sportsmarks()
    {
        System.out.println("Sportsmarks = "+ sm);
    }
    void result()
    {
        int r=sub1+sub2+sm;
        System.out.println("Total = "+r);

    }
}
public class JC_40_Interface {
    public static void main(String[] args) {
        result r=new result();
        r.input("Pavan",3);
        r.inputmarks(89,78);
        r.sportsmarks();
        r.result();
    }
}
