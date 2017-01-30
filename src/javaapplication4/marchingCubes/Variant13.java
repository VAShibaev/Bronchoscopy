package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant13{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "10001110": tr= Variant13_1(); break;
            case "11001001": tr= Variant13_2(); break;
            case "11010100": tr= Variant13_3(); break;
            case "01101100": tr= Variant13_4(); break;
            case "01110001": tr= Variant13_5(); break;
            case "01000111": tr= Variant13_6(); break;
            case "00011101": tr= Variant13_7(); break;
            case "10111000": tr= Variant13_8(); break;
            case "11100010": tr= Variant13_9(); break;
            case "00101011": tr= Variant13_10(); break;
            case "00110110": tr= Variant13_11(); break;
            case "10010011": tr= Variant13_12(); break;
        }
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e5(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));        
        return tr;
    }
    
     private LinkedList<Triangle> Variant13_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));        
        return tr;
    }
    
}
