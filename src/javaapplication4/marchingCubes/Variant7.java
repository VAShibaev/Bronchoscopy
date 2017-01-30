package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant7{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "01010010": tr = Variant7_1(); break;
            case "00100101": tr = Variant7_2(); break;
            case "00011010": tr = Variant7_3(); break;
            case "10100001": tr = Variant7_4(); break;
            case "01001010": tr = Variant7_5(); break;
            case "10100100": tr = Variant7_6(); break;
            case "01011000": tr = Variant7_7(); break;
            case "10000101": tr = Variant7_8(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint. e4(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant7_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
}
