package com.company;

public class Circle extends First {
    double p, R, sharik;
    public Circle(double x, double y, double z, double p, double R, double sharik) {
        super(x, y, z);
        this.p = p;
        this.R = R;
        this.sharik = sharik;
    }

    public Circle(double x, double y, double z, double p, double r) {
        super();
    }

    public void shar(double x, double y, double z, double R)
    {
       this.sharik =x * x + y * y + z * z;


    }
    public boolean inside (double p)
    {
        if (this.sharik <= R * R)
        {return true;}
        else return false;


    }
}
