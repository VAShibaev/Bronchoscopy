package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant16{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "01011101": tr = Variant16_1(); break;
            case "11000111": tr = Variant16_2(); break;
            case "11101010": tr = Variant16_3(); break;
            case "10111100": tr = Variant16_4(); break;
            case "11101001": tr = Variant16_5(); break;
            case "10111010": tr = Variant16_6(); break;
            case "10010111": tr = Variant16_7(); break;
            case "10101011": tr = Variant16_8(); break;
            case "01010111": tr = Variant16_9(); break;
            case "10101110": tr = Variant16_10(); break;
            case "10110110": tr = Variant16_11(); break;
            case "11010011": tr = Variant16_12(); break;
            case "00111110": tr = Variant16_13(); break;
            case "01111100": tr = Variant16_14(); break;
            case "01110101": tr = Variant16_15(); break;
            case "11010101": tr = Variant16_16(); break;
            case "00111101": tr = Variant16_17(); break;
            case "11001011": tr = Variant16_18(); break;
            case "11100011": tr = Variant16_19(); break;
            case "01111001": tr = Variant16_20(); break;
            case "01101011": tr = Variant16_21(); break;
            case "10011110": tr = Variant16_22(); break;
            case "11010110": tr = Variant16_23(); break;
            case "01101101": tr = Variant16_24(); break;
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
        tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }    
    
    private LinkedList<Triangle> Variant16_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
        return tr;
    }    
    
    private LinkedList<Triangle> Variant16_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    } 
    
    private LinkedList<Triangle> Variant16_13()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0)));
                return tr;
    }
    
    private LinkedList<Triangle> Variant16_14()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));       
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_15()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_16()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_17()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_18()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e10(vertex0)));
            return tr;
    }
    private LinkedList<Triangle> Variant16_19()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_20()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_21()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_22()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_23()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant16_24()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e1(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0)));        
        return tr;
    }
}
