public class JC_28_VarArg {
    //This program is about Variable argument

    void sum(int ... arg){
        int sum=0;
        for(int e:arg)
        {
            sum=sum+e;
        }
        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        JC_28_VarArg va=new JC_28_VarArg();
        va.sum(10,20);
        va.sum(10,20,30);
        va.sum(10,20,30,40,50,60,70);

    }
}
