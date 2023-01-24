import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String).
// Добавить в каждый из них по 3 элемента.
//Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
//к LinkedList добавить весь ArrayList.
//* - найти самую длинную строку в вашем получившемся листе.

public class Classwork {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");

        list2.add("a1");
        list2.add("b1");
        list2.add("c1");

        list1.set(1,"a");
        list1.remove(2);
        list2.addAll(list1);

        if(list2.size() > list1.size()){
            System.out.println("Длина строки листа list2 больше list1");}
            else {
            System.out.println("Длина строки листа list1 больше list2");
        }




    }

}
