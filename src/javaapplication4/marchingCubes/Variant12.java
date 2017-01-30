package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant12{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "01001101": tr = Variant12_1(); break;
            case "11000110": tr = Variant12_2(); break;
            case "11101000": tr = Variant12_3(); break;
            case "10011100": tr = Variant12_4(); break;
            case "00101011": tr = Variant12_5(); break;
            case "00110110": tr = Variant12_6(); break;
            case "01110001": tr = Variant12_7(); break;
            case "10010011": tr = Variant12_8(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e10(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant12_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }    
    
    private LinkedList<Triangle> Variant12_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
}