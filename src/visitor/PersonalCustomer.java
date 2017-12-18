package visitor;

public class PersonalCustomer extends Customer {

    private String telephone;
    private int age;
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }

}
