package Autoracing.Sponsor;

public class Sponsor {
    private final String name;
    private final int money;


    public Sponsor(String name, int money) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (money <= 0) {
            this.money = 100;
        } else {
            this.money = money;
        }

    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void toSponsorRace () {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", name, money);
    }
}