package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant14{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
        case "10001101": tr = Variant14_1(); break;
        case "11100100": tr = Variant14_2(); break;
        case "01001110": tr = Variant14_3(); break;
        case "11011000": tr = Variant14_4(); break;
        case "00011011": tr = Variant14_5(); break;
        case "00100111": tr = Variant14_6(); break;
        case "01110010": tr = Variant14_7(); break;
        case "10110001": tr = Variant14_8(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));
        tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e1(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant14_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
}