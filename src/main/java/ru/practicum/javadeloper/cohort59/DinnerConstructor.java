package ru.practicum.javadeloper.cohort59;

import java.security.SecureRandom;
import java.util.*;

public class DinnerConstructor {

    Map<String, List<String>> dishes = new HashMap<>();
    Random random = new Random();

    public void addNewDish(String dishType, String dishName) {
        if (dishes.containsKey(dishType)) {
            dishes.get(dishType).add(dishName);
        } else {
            List<String> dishesByType = new ArrayList<>();
            dishesByType.add(dishName);
            dishes.put(dishType, dishesByType);
        }

        dishes.putIfAbsent(dishType, new ArrayList<>());
        dishes.get(dishType).add(dishName);
    }

    public boolean checkType(String type) {
        return dishes.containsKey(type);
    }

    public List<List<String>> generateCombos(List<String> comboTypes, int numberOfCombos) {
        List<List<String>> result = new ArrayList<>();

        while (result.size() < Math.min(numberOfCombos, getMaxSize(comboTypes))){
            List<String> combo = generateCombo(comboTypes);
            if (!isComboExist(result, combo)) {
                result.add(combo);
            }
        }

        return result;
    }



    private boolean isComboExist(List<List<String>> combos, List<String> comboToAdd) {
        for (List<String> combo : combos) {
            if (new HashSet<>(combo).containsAll(comboToAdd)) {
                return true;
            }
        }

        return false;
    }

    private List<String> generateCombo(List<String> comboTypes) {
        List<String> result = new ArrayList<>();

        for (String type : comboTypes) {
            List<String> typeDishes = dishes.get(type);
            int selected = random.nextInt(typeDishes.size());
            result.add(typeDishes.get(selected));
        }

        return result;
    }

    private int getMaxSize(List<String> comboTypes) {
        int maxSize = 1;
        for (String comboType: comboTypes) {
            maxSize *= dishes.get(comboType).size();
        }
        return maxSize;
    }

    @SuppressWarnings("unused")
    private List<String> addNewDishToList(List<String> typedDishes, String dishName) {
        typedDishes.add(dishName);
        return typedDishes;
    }
}
