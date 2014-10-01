package a.b.c;

import java.util.List;

/**
 * by Irina.Petrovskaya on 9/22/2014.
 */
public class Bean2 {
    String prop1;
    String prop2;
    List<String> prop3;

    public Bean2(String prop1, String prop2, List<String> prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public List<String> getProp3() {
        return prop3;
    }

    public void setProp3(List<String> prop3) {
        this.prop3 = prop3;
    }

    public String returnCapitalizedString(String arg){
            return arg.toUpperCase();
        }
}
