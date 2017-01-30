package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant8{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
        case "01011100": tr =  Variant8_1(); break;
        case "11000101": tr =  Variant8_2(); break;
        case "11001010": tr =  Variant8_3(); break;
        case "10101100": tr =  Variant8_4(); break;
        case "10100011": tr =  Variant8_5(); break;
        case "00111010": tr =  Variant8_6(); break;
        case "00110101": tr =  Variant8_7(); break;
        case "01010011": tr =  Variant8_8(); break;
        case "10011010": tr =  Variant8_9(); break;
        case "11100001": tr =  Variant8_10(); break;
        case "01010110": tr =  Variant8_11(); break;
        case "00101101": tr =  Variant8_12(); break;
        case "10010101": tr =  Variant8_13(); break;
        case "01111000": tr =  Variant8_14(); break;
        case "10100110": tr =  Variant8_15(); break;
        case "01001011": tr =  Variant8_16(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0)));
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0)));
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e5(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0)));
        tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_13()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_14()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_15()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
        tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0)));
        tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant8_16()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0)));
        tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0)));
        tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
}