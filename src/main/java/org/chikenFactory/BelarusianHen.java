package org.chikenFactory;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggPerMonth() {
        return 500;
    }

    @Override
    public String getDescription() {
        return "Я - курица. Моя страна - Беларусь. Я несу " + getCountOfEggPerMonth() + "яиц в месяц";
    }
}
