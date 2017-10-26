package interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.w3c.dom.Element;

public class ElementsExpression extends ReadXmlExpression {

    private Collection<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
    
    private String eleName = "";
    
    public ElementsExpression(String eleName) {
        this.eleName = eleName;
    }
    
    @Override
    public String[] interpret(Context c) {
        List<Element> pEles = c.getPreEles();
        List<Element> nowEles = new ArrayList<Element>();
        
        for (Element ele : pEles) {
            nowEles.addAll(c.getNowEles(ele, eleName));
        }
        
        c.setPreEles(nowEles);
        
        String[] ss = null;
        
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }
    
    public boolean addEle(ReadXmlExpression ele) {
        eles.add(ele);
        return true;
    }
    
    public boolean removeEle(ReadXmlExpression ele) {
        eles.remove(ele);
        return true;
    }
}
