package Dealershio;

public class Car {
    private String m_model;
    private int m_manufacturingDate;
    private int m_carNumber;
    
    public Car(String model, int manufacturingDate, int carNumber){
        this.m_model = model;
        this.m_manufacturingDate = manufacturingDate;
        this.m_carNumber = carNumber;
    }

    public String getModel() {
        return m_model;
    }
    public int getManufacturingDate () {
        return m_manufacturingDate;
    }
    public int getCarNumber () {
        return m_carNumber;
}

    public void setModel(String model) {
        this.m_model = model;
        
    }
    public void setCarNumber (int carNumber) {
        this.m_carNumber = carNumber;
    }
    public void setManufacturingDate(int manufacturingDate) {
        this.m_manufacturingDate = manufacturingDate;
    }

    public boolean freeSlot(){
        return(this.m_model == null);
    }
}
