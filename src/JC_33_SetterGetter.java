class employee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getid()
    {
        return id;
    }

}
public class JC_33_SetterGetter {

    public static void main(String[] args) {
        //This Code is about setter and getter
        employee e =new employee();
        //e.id=10;//
        //e.name="pavan"; //Throws error due to Private access specifier

        e.setName("Pavan");
        e.setId(10);
        System.out.println(e.getid());
        System.out.println(e.getName());



    }
}
