package Q_ContratoTrabalho.entities;

import java.util.Date;



public class HourContract {
    private Date date;
    private Double valuePerContract;
    private Integer hour;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerContract, Integer hour) {
        this.date = date;
        this.valuePerContract = valuePerContract;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerContract() {
        return valuePerContract;
    }

    public void setValuePerContract(Double valuePerContract) {
        this.valuePerContract = valuePerContract;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
    
    public double totalValue() {
        return valuePerContract * hour;

    }

}
