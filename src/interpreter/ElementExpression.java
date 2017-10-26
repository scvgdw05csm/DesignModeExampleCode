package interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.w3c.dom.Element;

public class ElementExpression extends ReadXmlExpression {

    private Collection<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
    
    private String eleName = "";
    
    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }
    
    public boolean addEle(ReadXmlExpression ele) {
        eles.add(ele);
        return true;
    }
    
    public boolean removeEle(ReadXmlExpression ele) {
        eles.remove(ele);
        return true;
    }
    
    @Override
    public String[] interpret(Context c) {
        List<Element> pEles = c.getPreEles();
        Element ele = null;
        
        List<Element> nowEles = new ArrayList<Element>();
        if (pEles.size() == 0) {
            ele = c.getDocument().getDocumentElement();
            pEles.add(ele);
            c.setPreEles(pEles);
        } else {
            for (Element tempEle : pEles) {
                nowEles.addAll(c.getNowEles(tempEle, eleName));
                if (nowEles.size() > 0) {
                    break;
                }
            }
            
            List<Element> tempList = new ArrayList<Element>();
            tempList.add(nowEles.get(0));
            c.setPreEles(tempList);
        }
        
        String[] ss = null;
        for (ReadXmlExpression tempEle : eles) {
            ss = tempEle.interpret(c);
        }
        return ss;
    }
}
