package interpreter;

public class ParserModel {

    private boolean singleValue;
    
    private boolean propertyValue;
    
    private boolean end;
    
    public boolean isEnd() {
        return end;
    }
    
    public void setEnd(boolean end) {
        this.end = end;
    }
    
    public boolean isSingleValue() {
        return singleValue;
    }
    
    public void setSingleValue(boolean oneValue) {
        singleValue = oneValue;
    }
    
    public boolean isPropertyValue() {
        return propertyValue;
    }
    
    public void setPorpertyValue(boolean propertyValue) {
        this.propertyValue = propertyValue;
    }
}
