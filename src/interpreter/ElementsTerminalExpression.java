package interpreter;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class ElementsTerminalExpression extends ReadXmlExpression {

    private String eleName = "";
    
    public ElementsTerminalExpression(String name) {
        eleName = name;
    }
    
    @Override
    public String[] interpret(Context c) {
        List<Element> pEles = c.getPreEles();
        List<Element> nowEles = new ArrayList<Element>();
        
        for (Element ele : pEles) {
            nowEles.addAll(c.getNowEles(ele, eleName));
        }
        
        String[] ss = new String[nowEles.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = nowEles.get(i).getFirstChild().getNodeValue();
        }
        
        return ss;
    }

}
