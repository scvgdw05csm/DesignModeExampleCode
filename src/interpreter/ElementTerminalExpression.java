package interpreter;

import java.util.List;

import org.w3c.dom.Element;

public class ElementTerminalExpression extends ReadXmlExpression {

    private String eleName = "";
    
    public ElementTerminalExpression(String name) {
        eleName = name;
    }
    
    @Override
    public String[] interpret(Context c) {
        List<Element> pEles = c.getPreEles();
        Element ele = null;
        if (pEles.size() == 0) {
            ele = c.getDocument().getDocumentElement();
        } else {
            ele = c.getNowEles(pEles.get(0), eleName).get(0);
        }
        
        String[] ss = new String[1];
        ss[0] = ele.getFirstChild().getNodeValue();
        return ss;
    }
}
