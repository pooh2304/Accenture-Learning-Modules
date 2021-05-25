public class Doctor extends Person {
    String specializationType;

    public void setSpecializationType(String specializationType) {
        this.specializationType = specializationType;
    }
    public String getSpecializationType() {
        return this.specializationType;
    }
    public String displayDetails() {
        String str = getName()+" is a "+getSpecializationType();
        return str;
    }
}