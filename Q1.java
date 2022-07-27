/* 1. Let’s assume that you need to calculate the percentage of marks obtained in 
three subjects (each out of 100) by student BCA and in four subjects (each out 
of 100) by student MCA. Create an abstract class 'Marks' with an abstract 
method 'getPercentage()'. Two other classes 'BCA' and 'MCA' inherited from 
the class Marks each having the overridden method 'getPercentage()’ which 
returns the percentage of marks obtained by the students. The constructor of 
BCA class takes the marks in three subjects as its parameters and the marks in 
four subjects as its parameters for MCA class. Create an object for each of the 
two classes and print the percentage of marks for both the students. */

abstract class Marks{
    abstract double getPercentage();
}

class BCA extends Marks
{
    double m1,m2,m3;
    BCA(double m1,double m2,Double m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    double getPercentage()
    {   
        double total=(m1+m2+m3)/3;
        return total;
    }

}

class MCA extends Marks
{
    double m1,m2,m3,m4;
    MCA(double m1,double m2,double m3,double m4)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }

    double getPercentage()
    {
        double total=(m1+m2+m3+m4)/4;
        return total;
    }

}

public class as81 {

    public static void main(String[] args) {
        BCA b=new BCA(48.0, 72.0, 85.0);
        double re=b.getPercentage();
        System.out.println(re);

        MCA m=new MCA(52.0, 79.0, 79.0, 85.0);
        double re1=m.getPercentage();
        System.out.println(re1);

    }
    
}
