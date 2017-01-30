package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant5{
    
    private Point vertex0;

    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "01001100": tr = Variant5_1(); break;
            case "10001100": tr = Variant5_2(); break;
            case "11001000": tr = Variant5_3(); break;
            case "11000100": tr = Variant5_4(); break;
            case "01100010": tr = Variant5_5(); break;
            case "00100110": tr = Variant5_6(); break;
            case "01000110": tr = Variant5_7(); break;
            case "01100100": tr = Variant5_8(); break;
            case "00001011": tr = Variant5_9(); break;
            case "00000111": tr = Variant5_10(); break;
            case "00001110": tr = Variant5_11(); break;
            case "00001101": tr = Variant5_12(); break;
            case "10001001": tr = Variant5_13(); break;
            case "10011000": tr = Variant5_14(); break;
            case "00011001": tr = Variant5_15(); break;
            case "10010001": tr = Variant5_16(); break;
            case "10110000": tr = Variant5_17(); break;
            case "01110000": tr = Variant5_18(); break;
            case "11100000": tr = Variant5_19(); break;
            case "11010000": tr = Variant5_20(); break;
            case "00010011": tr = Variant5_21(); break;
            case "00100011": tr = Variant5_22(); break;
            case "00110010": tr = Variant5_23(); break;
            case "00110001": tr = Variant5_24(); break;
            case "10110011": tr = Variant5_25(); break;
            case "01110011": tr = Variant5_26(); break;
            case "00110111": tr = Variant5_27(); break;
            case "00111011": tr = Variant5_28(); break;
            case "10011101": tr = Variant5_29(); break;
            case "11011001": tr = Variant5_30(); break;
            case "10111001": tr = Variant5_31(); break;
            case "10011011": tr = Variant5_32(); break;
            case "11110100": tr = Variant5_33(); break;
            case "11111000": tr = Variant5_34(); break;
            case "11110001": tr = Variant5_35(); break;
            case "11110010": tr = Variant5_36(); break;
            case "01110110": tr = Variant5_37(); break;
            case "01100111": tr = Variant5_38(); break;
            case "11100110": tr = Variant5_39(); break;
            case "01101110": tr = Variant5_40(); break;
            case "01001111": tr = Variant5_41(); break;
            case "10001111": tr = Variant5_42(); break;
            case "00011111": tr = Variant5_43(); break;
            case "00101111": tr = Variant5_44(); break;
            case "11101100": tr = Variant5_45(); break;
            case "11011100": tr = Variant5_46(); break;
            case "11001101": tr = Variant5_47(); break;
            case "11001110": tr = Variant5_48(); break; 
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e2(vertex0),  MiddlePoint.e6(vertex0),  MiddlePoint.e8(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0),  MiddlePoint.e8(vertex0),  MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0),  MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e4(vertex0),   MiddlePoint.e6(vertex0),  MiddlePoint.e8(vertex0)));
            tr.add(new Triangle(MiddlePoint.e6(vertex0),  MiddlePoint.e4(vertex0),  MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0),  MiddlePoint.e6(vertex0),  MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0),  MiddlePoint.e4(vertex0),  MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0),  MiddlePoint.e8(vertex0),  MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0),  MiddlePoint.e8(vertex0),   MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0), MiddlePoint. e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0)));
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_13()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint. e11(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_14()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_15()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }

    private LinkedList<Triangle> Variant5_16()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint. e7(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_17()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_18()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_19()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint. e10(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint. e9(vertex0), MiddlePoint.e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_20()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_21()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0)));
            tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_22()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_23()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0)));
            tr.add(new Triangle(MiddlePoint. e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_24()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_25()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_26()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0)));
            tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_27()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e8(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_28()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_29()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e10(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_30()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_31()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_32()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint. e3(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_33()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_34()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint. e10(vertex0), MiddlePoint.e5(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_35()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_36()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_37()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e1(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_38()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e5(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_39()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e7(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
            tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    private LinkedList<Triangle> Variant5_40()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e7(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_41()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e9(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_42()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e1(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_43()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0)));
            tr.add(new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_44()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e10(vertex0)));
            tr.add(new Triangle(MiddlePoint. e11(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_45()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_46()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e6(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_47()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e11(vertex0)));
            tr.add(new Triangle(MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant5_48()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add(new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e2(vertex0)));
            tr.add(new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));
            tr.add(new Triangle(MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e2(vertex0)));
        return tr;
    }
}
