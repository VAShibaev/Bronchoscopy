package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant4{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "00101000": tr = Variant4_1(); break;
            case "00010100": tr = Variant4_2(); break;
            case "10000010": tr = Variant4_3(); break;
            case "01000001": tr = Variant4_4(); break;
            case "11010111": tr = Variant4_5(); break;
            case "11101011": tr = Variant4_6(); break;
            case "01111101": tr = Variant4_7(); break;
            case "10111110": tr = Variant4_8(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>(); 
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>(); 
        tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();     
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e1(vertex0)));
        tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>(); 
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>(); 
        tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>(); 
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant4_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>(); 
        tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
}