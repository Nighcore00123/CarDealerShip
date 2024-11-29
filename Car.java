package Dealershio;

public class Car {
    private String m_model;
    private int m_manufacturingDate;
    
    public Car(String model, int manufacturingDate){
        this.m_model = model;
        this.m_manufacturingDate = manufacturingDate;
    }

    public String getModel() {
        return m_model;
    }
    public int getManufacturingDate () {
        return m_manufacturingDate;
    }

    public void setModel(String model) {
        this.m_model = model;
        
    }
    public void setManufacturingDate(int manufacturingDate) {
        this.m_manufacturingDate = manufacturingDate;
    }
}
