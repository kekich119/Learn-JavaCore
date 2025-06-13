package org.chikenFactory;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Я - курица. Моя страна - Молдова. Я несу " + getCountOfEggPerMonth() + "яиц в месяц";
    }
}
