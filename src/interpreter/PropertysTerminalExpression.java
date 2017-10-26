package interpreter;

import java.util.List;

import org.w3c.dom.Element;

public class PropertysTerminalExpression extends ReadXmlExpression {

    private String propName;
    
    public PropertysTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context c) {
        List<Element> eles = c.getPreEles();
        
        String[] ss = new String[eles.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = eles.get(i).getAttribute(propName);
        }
        return ss;
    }
}
