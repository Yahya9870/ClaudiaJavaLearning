public class ArmstrongNumber {
    public static void main(String[] args) {

        // How pow method works in Java
//        double a= 2.0;
//        double b= 3.0;
//        to calculate a raise to the power b
//        double result=Math.pow(a,b);
//       System.out.println(a+ " raise to the power "+b+" is "+result);
        int num=153;
        int save=num;
        double sum=0;
        double r;
        while(num!=0){
            r=num%10;
            sum=sum+(r*r*r);
//            sum=sum+Math.pow(r,3);
            num=num/10;
        }

        if(sum==save){
            System.out.println("Armstrong number");
        }

        else{
            System.out.println("Not Armstrong number");
        }
    }
}
