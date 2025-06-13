package org.chikenFactory;

public class HenFactory {

    public static Hen getHen(String country) {
        if (country == "russia") {
            return new RussianHen();
        }
        if (country == "belarus") {
            return new BelarusianHen();
        }
        if (country == "ukraine") {
            return new UkrainianHen();
        }
        if (country == "moldova"){
            return new MoldovanHen();
        }
        return  null;
    }
}
