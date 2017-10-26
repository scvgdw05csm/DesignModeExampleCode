package interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Parser {

    private Parser() {}
    
    private final static String BACKLASH = "/";
    private final static String DOT = ".";
    private final static String DOLLAR = "$";
    
    private static List<String> listEle = null;
    
    public static ReadXmlExpression parse(String expr) {
        listEle = new ArrayList<String>();
        Map<String, ParserModel> mapPath = parseMapPath(expr);
        List<ReadXmlExpression> list = mapPath2Interpreter(mapPath);
        ReadXmlExpression returnRe = buildTree(list);
        
        return returnRe;
    }
    
    private static Map<String, ParserModel> parseMapPath(String expr) {
        StringTokenizer tokenizer = new StringTokenizer(expr, BACKLASH);
        Map<String, ParserModel> mapPath = new HashMap<String, ParserModel>();
        
        while (tokenizer.hasMoreTokens()) {
            String onePath = tokenizer.nextToken();
            if (tokenizer.hasMoreTokens()) {
                setParsePath(false, onePath, false, mapPath);
            } else {
                int dotIndex = onePath.indexOf(DOT);
                if (dotIndex > 0) {
                    String eleName = onePath.substring(0, dotIndex);
                    String propName = onePath.substring(dotIndex + 1);
                    
                    setParsePath(false, eleName, false, mapPath);
                    setParsePath(true, propName, true, mapPath);
                } else {
                    setParsePath(true, onePath, false, mapPath);
                }
                break;
            }
        }
        
        return mapPath;
    }
    
    private static void setParsePath(boolean end, String ele, boolean propertyValue, Map<String, ParserModel> mapPath) {
        ParserModel pm = new ParserModel();
        pm.setEnd(end);
        
        pm.setSingleValue(!(ele.indexOf(DOLLAR) > 0));
        pm.setPorpertyValue(propertyValue);
        
        ele = ele.replace(DOLLAR, "");
        mapPath.put(ele, pm);
        listEle.add(ele);
    }
    
    private static List<ReadXmlExpression> mapPath2Interpreter(Map<String, ParserModel> mapPath) {
        List<ReadXmlExpression> list = new ArrayList<ReadXmlExpression>();
        
        for (String key : listEle) {
            ParserModel pm = mapPath.get(key);
            ReadXmlExpression obj = null;
            if (!pm.isEnd()) {
                if (pm.isSingleValue()) {
                    obj = new ElementExpression(key);
                } else {
                    obj = new ElementsExpression(key);
                }
            } else {
                if (pm.isPropertyValue()) {
                    if (pm.isSingleValue()) {
                        obj = new PropertyTerminalExpression(key);
                    } else {
                        obj = new PropertysTerminalExpression(key);
                    }
                } else {
                    if (pm.isSingleValue()) {
                        obj = new ElementTerminalExpression(key);
                    } else {
                        obj = new ElementsTerminalExpression(key);
                    }
                }
            }
            list.add(obj);
        }
        return list;
    }
    
    private static ReadXmlExpression buildTree(List<ReadXmlExpression> list) {
        ReadXmlExpression returnRe = null;
        ReadXmlExpression preRe = null;
        
        for (ReadXmlExpression re : list) {
            if (preRe == null) {
                preRe = re;
                returnRe = re;
            } else {
                if (preRe instanceof ElementExpression) {
                    ElementExpression ele = (ElementExpression) preRe;
                    ele.addEle(re);
                    preRe = re;
                } else if (preRe instanceof ElementsExpression) {
                    ElementsExpression eles = (ElementsExpression) preRe;
                    eles.addEle(re);
                    preRe = re;
                }
            }
        }
        
        return returnRe;
    }
}
