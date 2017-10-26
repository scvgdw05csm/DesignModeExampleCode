package interpreter;

public class Client {

    public static void main(String[] args) throws Exception {
        Context c= new Context("src\\interpreter\\InterpreterTest.xml");
        
        //ElementExpression root = new ElementExpression("root");
        //ElementExpression aEle = new ElementExpression("a");
        //ElementExpression bEle = new ElementExpression("b");
        //ElementTerminalExpression cEle = new ElementTerminalExpression("c");
        //ElementExpression cEle = new ElementExpression("c");
        //PropertyTerminalExpression prop = new PropertyTerminalExpression("name");
        //ElementsTerminalExpression dEle = new ElementsTerminalExpression("d");
        //ElementsExpression dEle = new ElementsExpression("d");
        //PropertysTerminalExpression prop = new PropertysTerminalExpression("id");
        
        //root.addEle(aEle);
        //aEle.addEle(bEle);
        //bEle.addEle(cEle);
        //cEle.addEle(prop);
        //bEle.addEle(dEle);
        //dEle.addEle(prop);
        
        //String ss[] = root.interpret(c);
        //System.out.println("c property name is:" + ss[0]);
        
        ReadXmlExpression re = Parser.parse("root/a/b/d$.id$");
        String ss[] = re.interpret(c);
        for (String s : ss) {
            System.out.println("d id value=" + s);
        }
        
        c.reInit();
        ReadXmlExpression re2 = Parser.parse("root/a/b/d$");
        String ss2[] = re2.interpret(c);
        for (String s : ss2) {
            System.out.println("d value=" + s);
        }
    }
}
