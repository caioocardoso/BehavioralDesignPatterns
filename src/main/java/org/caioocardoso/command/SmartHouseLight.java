package org.caioocardoso.command;

public class SmartHouseLight {
    private String name;
    private Boolean isOn = false;
    private Integer intensity = 50;

    public SmartHouseLight(String name) {
        this.name = name;
    }

    public String getPowerStatus(){
        return isOn? "ON" : "OFF";
    }

    public Boolean On(){
        this.isOn = true;
        System.out.println(this.name + " is on " + this.getPowerStatus());
        return this.isOn;
    }

    public Boolean Off(){
        this.isOn = false;
        System.out.println(this.name + " is on " + this.getPowerStatus());
        return this.isOn;
    }

    public Integer increaseIntensity(){
        if(this.intensity > 100) return this.intensity;
        this.intensity++;
        return this.intensity;
    }

    public Integer decreaseIntensity(){
        this.intensity--;
        return this.intensity;
    }
}
