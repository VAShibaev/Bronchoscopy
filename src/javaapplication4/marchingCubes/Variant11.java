package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant11{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "11001100": return Variant11_1();
            case "11110000": return Variant11_2();
            case "00110011": return Variant11_3();
            case "00001111": return Variant11_4();
            case "01100110": return Variant11_5();
            case "10011001": return Variant11_6();
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant11_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));           
        return tr;
    }
    
    private LinkedList<Triangle> Variant11_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));           
        return tr;
    }
    
    private LinkedList<Triangle> Variant11_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0)));           
        return tr;
    }
    
    private LinkedList<Triangle> Variant11_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));           
        return tr;
    }
    
    private LinkedList<Triangle> Variant11_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e3(vertex0)));           
        return tr;
    }
    
    private LinkedList<Triangle> Variant11_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));           
        return tr;
    }
    
}
