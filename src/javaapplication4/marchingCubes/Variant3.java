package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant3{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "10001000": tr = Variant3_1(); break;
            case "00001100": tr =  Variant3_2(); break;
            case "01000100": tr =  Variant3_3(); break;
            case "11000000": tr =  Variant3_4(); break;
            case "10010000": tr =  Variant3_5(); break;
            case "00001001": tr =  Variant3_6(); break;
            case "00000110": tr =  Variant3_7(); break;
            case "01100000": tr =  Variant3_8(); break;
            case "00110000": tr =  Variant3_9(); break;
            case "00010001": tr =  Variant3_10(); break;
            case "00000011": tr =  Variant3_11(); break;
            case "00100010": tr =  Variant3_12(); break;
            case "01110111": tr =  Variant3_13(); break;
            case "11110011": tr =  Variant3_14(); break;
            case "10111011": tr =  Variant3_15(); break;
            case "00111111": tr =  Variant3_16(); break;
            case "01101111": tr =  Variant3_17(); break;
            case "11110110": tr =  Variant3_18(); break;
            case "11111001": tr =  Variant3_19(); break;
            case "10011111": tr =  Variant3_20(); break;
            case "11001111": tr =  Variant3_21(); break;
            case "11101110": tr =  Variant3_22(); break;
            case "11111100": tr =  Variant3_23(); break;
            case "00100001": tr =  Variant3_24(); break;
        }
        return tr;
    }
     
    private LinkedList<Triangle> Variant3_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e4(vertex0),MiddlePoint.e5(vertex0),MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0),MiddlePoint.e4(vertex0),MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e8(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e10(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0),MiddlePoint.e8(vertex0),MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e6(vertex0),MiddlePoint.e5(vertex0),MiddlePoint.e1(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0),MiddlePoint.e2(vertex0),MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e9(vertex0),MiddlePoint.e4(vertex0),MiddlePoint.e2(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e11(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e1(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e5(vertex0),MiddlePoint.e7(vertex0),MiddlePoint.e9(vertex0)));
        tr.add(new Triangle(MiddlePoint.e11(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e7(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e5(vertex0),MiddlePoint.e10(vertex0),MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e12(vertex0),MiddlePoint.e7(vertex0),MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e10(vertex0)));
        tr.add(new Triangle(MiddlePoint.e12(vertex0),MiddlePoint.e10(vertex0),MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0),MiddlePoint.e4(vertex0),MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e4(vertex0),MiddlePoint.e11(vertex0),MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e8(vertex0),MiddlePoint.e7(vertex0),MiddlePoint.e3(vertex0)));
        tr.add(new Triangle(MiddlePoint.e3(vertex0),MiddlePoint.e4(vertex0),MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e12(vertex0),MiddlePoint.e11(vertex0),MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e11(vertex0),MiddlePoint.e8(vertex0),MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e7(vertex0),MiddlePoint.e6(vertex0),MiddlePoint.e2(vertex0)));
        tr.add(new Triangle(MiddlePoint.e2(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e7(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_13()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e8(vertex0),MiddlePoint.e5(vertex0),MiddlePoint.e4(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0),MiddlePoint.e4(vertex0),MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_14()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e10(vertex0),MiddlePoint.e8(vertex0),MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_15()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0),MiddlePoint.e5(vertex0),MiddlePoint.e6(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0),MiddlePoint.e2(vertex0),MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_16()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e10(vertex0)));
        tr.add(new Triangle(MiddlePoint.e4(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_17()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e1(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e11(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_18()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e9(vertex0),MiddlePoint.e7(vertex0),MiddlePoint.e5(vertex0)));
        tr.add(new Triangle(MiddlePoint.e7(vertex0),MiddlePoint.e9(vertex0),MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_19()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e12(vertex0),MiddlePoint.e10(vertex0),MiddlePoint.e5(vertex0)));
        tr.add(new Triangle(MiddlePoint.e5(vertex0),MiddlePoint.e7(vertex0),MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_20()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e3(vertex0),MiddlePoint.e10(vertex0),MiddlePoint.e12(vertex0)));
        tr.add(new Triangle(MiddlePoint.e10(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_21()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e12(vertex0),MiddlePoint.e11(vertex0),MiddlePoint.e4(vertex0)));
        tr.add(new Triangle(MiddlePoint.e12(vertex0),MiddlePoint.e4(vertex0),MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_22()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e3(vertex0),MiddlePoint.e7(vertex0),MiddlePoint.e8(vertex0)));
        tr.add(new Triangle(MiddlePoint.e1(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_23()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e6(vertex0),MiddlePoint.e8(vertex0),MiddlePoint.e11(vertex0)));
        tr.add(new Triangle(MiddlePoint.e6(vertex0),MiddlePoint.e11(vertex0),MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant3_24()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add(new Triangle(MiddlePoint.e2(vertex0),MiddlePoint.e6(vertex0),MiddlePoint.e7(vertex0)));
        tr.add(new Triangle(MiddlePoint.e7(vertex0),MiddlePoint.e3(vertex0),MiddlePoint.e2(vertex0)));
        return tr;
    }
}
