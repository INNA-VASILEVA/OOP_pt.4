package Autoracing.Mechanic;

import Autoracing.Transport.Transport;

public class Mechanic <T extends Transport> {
    private final String name;
    private final String company;

    public Mechanic(String name, String company) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (company != null && !company.isEmpty() && !company.isBlank()) {
            this.company = company;
        } else {
            this.company = "Информация не указана";
        }

    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    public boolean checkVehicles(T t){
       return t.checkVehicles();
    }

    public void repairVehicles(){

    }
    }

