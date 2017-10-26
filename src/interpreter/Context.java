package interpreter;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Context {

    private Document document = null;
    
    private List<Element> preEles = new ArrayList<Element>();
    
    public Context(String filePathName) throws Exception {
        document = XmlUtil.getRoot(filePathName);
    }
    
    public void reInit() {
        preEles = new ArrayList<Element>();
    }
    
    public List<Element> getNowEles(Element pEle, String eleName) {
        List<Element> elements = new ArrayList<Element>();
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    elements.add(nowEle);
                }
            }
        }
        return elements;
    }
    
    public Document getDocument() {
        return document;
    }
    
    public List<Element> getPreEles() {
        return preEles;
    }
    
    public void setPreEles(List<Element> nowEles) {
        preEles = nowEles;
    }
}
