package Autoracing.Driver;

public abstract class Driver {
    private String name;
    private String driverCard;
    private double experience;

    public Driver(String name, double experience) {
        if (name == null || name.isEmpty()) this.name = " Имя не указано ";
        else this.name = name;
        this.driverCard = driverCard;
        this.experience = Math.max(experience, 0.5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverCard() {
        return driverCard;
    }

    public void setDriverCard(String driverCard) {
       if(driverCard ==null){
            throw new IllegalArgumentException("необходимо указать категорию прав");
        }
        this.driverCard = driverCard;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}