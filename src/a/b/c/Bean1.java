package a.b.c;

import java.util.List;
import java.util.Map;

/**
 * by Irina.Petrovskaya on 9/22/2014.
 */
public class Bean1 {
    String txtProp2;
    int intProp1;
    boolean boolProp1;
    String[] arrayProp1;
    List listProp1;

    public Map getMapProp1() {
        return mapProp1;
    }

    public void setMapProp1(Map mapProp1) {
        this.mapProp1 = mapProp1;
    }

    Map mapProp1;
    Bean2 bean2;
    private String temp;

    public Bean2 getBean2() {
        return bean2;
    }

    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public Bean1(String txtProp2, int intProp1, boolean boolProp1, String[] arrayProp1, List listProp1, Bean2 bean2, Map mapProp1) {
        this.txtProp2 = txtProp2;
        this.intProp1 = intProp1;
        this.boolProp1 = boolProp1;
        this.arrayProp1 = arrayProp1;
        this.listProp1 = listProp1;
        this.bean2 = bean2;
        this.mapProp1 = mapProp1;
    }

    public String getTxtProp1() {
        //String txtProp1 = "_txtProp1_";
        String txtProp1 = null;
        return txtProp1;
    }

    /*public void setTxtProp1(String txtProp1) {
        this.txtProp1 = txtProp1;
    }*/

    public String getTxtProp2() {
        return txtProp2;
    }

    public void setTxtProp2(String txtProp2) {
        this.txtProp2 = txtProp2;
    }

    public int getIntProp1() {
        return intProp1;
    }

    public void setIntProp1(int intProp1) {
        this.intProp1 = intProp1;
    }

    public boolean isBoolProp1() {
        return boolProp1;
    }

    public void setBoolProp1(boolean boolProp1) {
        this.boolProp1 = boolProp1;
    }

    public String[] getArrayProp1() {
        return arrayProp1;
    }

    public void setArrayProp1(String[] arrayProp1) {
        this.arrayProp1 = arrayProp1;
    }

    public List getListProp1() {
        return listProp1;
    }

    public void setListProp1(List listProp1) {
        this.listProp1 = listProp1;
    }

    public String process(String arg){
        this.temp = arg.toUpperCase();
        return temp;
    }
    public String returnProcessed(String arg){
        System.out.println("returnProcessed method is invoked with "+arg);
        return arg+temp;
    }
}
