package ru.practicum.javadeloper.cohort59;

public class TestClass {

    public static void main(String[] args) {
        DinnerConstructor ds = prepareTestCase();
        for (String dishType : ds.dishes.keySet()) {
            System.out.println("-" + dishType + " " + ds.dishes.get(dishType));
        }

//        longExample();
    }

    private static DinnerConstructor prepareTestCase() {
        DinnerConstructor ds = new DinnerConstructor();
        ds.addNewDish("Первое", "Суп по-баварски");
        ds.addNewDish("Второе", "Кура и греча");
        ds.addNewDish("Напиток", "Морс");

        ds.addNewDish("Первое", "Зеленый борщ");
        ds.addNewDish("Второе", "Макароны по-флотски");
        ds.addNewDish("Напиток", "Яблочный сок");

        ds.addNewDish("Первое", "Лангман");
        ds.addNewDish("Второе", "Хинкали");
        ds.addNewDish("Напиток", "Гранатовый сок");
        return ds;
    }

    public static void longExample() {
        long inputGold = 200L;
        int inputGoldInt = 200;
        long inputGoldLong = 200;
        int inputGoldIntFromGold = (int) 200L;

        System.out.println(inputGold);
        System.out.println(inputGoldInt);
        System.out.println(inputGoldLong);
        System.out.println(inputGoldIntFromGold);

        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;
    }
}
