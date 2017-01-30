package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant6{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
        case "11000010": tr =  Variant6_1(); break;
        case "01000101": tr =  Variant6_2(); break;
        case "00011100": tr =  Variant6_3(); break;
        case "10101000": tr =  Variant6_4(); break;
        case "00110100": tr =  Variant6_5(); break;
        case "01000011": tr =  Variant6_6(); break;
        case "00101100": tr =  Variant6_7(); break;
        case "10010100": tr =  Variant6_8(); break;
        case "00111000": tr =  Variant6_9(); break;
        case "01100001": tr =  Variant6_10(); break;
        case "11000001": tr =  Variant6_11(); break;
        case "10001010": tr =  Variant6_12(); break;
        case "10000110": tr =  Variant6_13(); break;
        case "01010100": tr =  Variant6_14(); break;
        case "00101001": tr =  Variant6_15(); break;
        case "10000011": tr =  Variant6_16(); break;
        case "00010110": tr =  Variant6_17(); break;
        case "10010010": tr =  Variant6_18(); break;
        case "01001001": tr =  Variant6_19(); break;
        case "01101000": tr =  Variant6_20(); break;
        case "00101010": tr =  Variant6_21(); break;        
        case "01010001": tr =  Variant6_22(); break;        
        case "10100010": tr =  Variant6_23(); break;
        case "00010101": tr =  Variant6_24(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_13()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_14()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_15()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_16()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_17()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_18()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_19()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_20()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_21()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_22()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_23()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant6_24()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
}