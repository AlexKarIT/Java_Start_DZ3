// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.*;

public class exampl {

    static void udalChet(List<Integer> arrList) {
        for (int i = arrList.size()-1; i > 0; i=i-1) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        } 
        System.out.println("Остаток после удаления чётных: " + arrList);
        
    }
    static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0); 
        for (int i=0; i < arrList.size(); i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        } 
        return max;
    }
    static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0); 
        for (int i=0; i < arrList.size(); i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        } 
        return min;
    }
     static Double Sredn(List<Integer> arrList) {
        int sum = 0; 
        double srednee;
        for (int i=0; i < arrList.size(); i++) {
            sum += arrList.get(i);
        } 
        srednee = sum / arrList.size();
        return srednee;
    }
    
    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList(63, 100, 1, 2, 52, 10, 10, 45, 85, 200));
        System.out.println("Изначальный список: " + list_num);
        System.out.println("Минимальное значение: " + MinNum(list_num));
        System.out.println("Максимальное значение: " + MaxNum(list_num));
        System.out.println("Среднее значение: " + Sredn(list_num));
        udalChet(list_num);
    }
}