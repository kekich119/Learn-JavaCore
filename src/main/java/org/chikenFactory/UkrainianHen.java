package org.chikenFactory;

public class UkrainianHen extends Hen{
    public int getCountOfEggPerMonth(){
        return 10;
    }

    @Override
    public String getDescription() {
        return "Я - курица. Моя страна - Украина. Я несу " + getCountOfEggPerMonth() + "яиц в месяц";
    }
}
