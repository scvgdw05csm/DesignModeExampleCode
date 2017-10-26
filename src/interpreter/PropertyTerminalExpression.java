package interpreter;

public class PropertyTerminalExpression extends ReadXmlExpression {

    private String propName;
    
    public PropertyTerminalExpression(String propName) {
        this.propName = propName;
    }
    
    @Override
    public String[] interpret(Context c) {
        String[] ss = new String[1];
        ss[0] = c.getPreEles().get(0).getAttribute(propName);
        return ss;
    }
}
