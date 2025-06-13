package org.chikenFactory;

public class RussianHen extends Hen{
    public int getCountOfEggPerMonth(){
        return 1000;
    }

    @Override
    public String getDescription() {
        return "Я - курица. Моя страна - Россия. Я несу " + getCountOfEggPerMonth() + " яиц в месяц";
    }
}
