import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(7);

            int attempts = 0;

            do {
                Collections.shuffle(list);
                attempts++;
            } while (!checkIfTrue(list));

            System.out.println("Перемешанный список: " + list);
            System.out.println("Количество попыток: " + attempts);
        }

        public static boolean checkIfTrue(List<Integer> list) {
            for (int i = 0; i <= list.size() - 3; i++) {
                if (list.get(i) == 1 && list.get(i + 1) == 1 && list.get(i + 2) == 1) {
                    return true;
                }
            }
            return false;
        }
    }

