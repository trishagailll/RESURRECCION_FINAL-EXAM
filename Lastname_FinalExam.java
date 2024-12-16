import java.util.Stack;

public class Lastname_FinalExam {

    // Creature class to store name and power level
    static class Creature {
        String name;
        int powerLevel;

        Creature(String name, int powerLevel) {
            this.name = name;
            this.powerLevel = powerLevel;
        }

        @Override
        public String toString() {
            return name + " - " + powerLevel;
        }
    }

    // Bubble Sort: Sorts creatures in descending order by power level
    static void bubbleSortDescending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (creatures[j].powerLevel < creatures[j + 1].powerLevel) {
                    // Swap
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort: Sorts creatures in ascending order by power level
    static void selectionSortAscending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].powerLevel < creatures[minIndex].powerLevel) {
                    minIndex = j;
                }
            }
            // Swap
            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
        }
    }

    // Display the list of creatures
    static void displayCreatures(Creature[] creatures) {
        for (Creature creature : creatures) {
            System.out.println(creature);
        }
    }

    public static void main(String[] args) {
        // Input Data: Fixed list of creatures
        Creature[] creatures = {
            new Creature("Dragon", 95),
            new Creature("Griffin", 88),
            new Creature("Unicorn", 78),
            new Creature("Phoenix", 92),
            new Creature("Centaur", 85)
        };

        // Bubble Sort: Descending order
        System.out.println("* Bubble Sort: Descending Order by Power Level *");
        bubbleSortDescending(creatures);
        displayCreatures(creatures);

        // Selection Sort: Ascending order
        System.out.println("\n*** Selection Sort: Ascending Order by Power Level *");
        selectionSortAscending(creatures);
        displayCreatures(creatures);

        // Stack Implementation: Push and Pop creatures
        System.out.println("\n*** Stack Implementation: Popping Creatures *");
        Stack<Creature> stack = new Stack<>();
        // Push all creatures into the stack
        for (Creature creature : creatures) {
            stack.push(creature);
        }

        // Pop creatures from the stack and display them
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}

