package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant9{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "10010110": tr =  Variant9_1(); break;
            case "01101001": tr =  Variant9_2(); break;
            case "01010101": tr =  Variant9_3(); break;
            case "10101010": tr =  Variant9_4(); break;
            case "11000011": tr =  Variant9_5(); break;
            case "00111100": tr =  Variant9_6(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant9_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        
        return tr;
    }
    
    private LinkedList<Triangle> Variant9_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));
        
        return tr;
    }
    
    private LinkedList<Triangle> Variant9_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));
        
        return tr;
    }
    
    private LinkedList<Triangle> Variant9_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0)));
        
        return tr;
    }
    
    private LinkedList<Triangle> Variant9_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
        
        return tr;
    }
    
    private LinkedList<Triangle> Variant9_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0)));
        
        return tr;
    }
    
}
