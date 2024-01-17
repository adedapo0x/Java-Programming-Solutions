package Chapter_05;

public class Question5_07 {
    public static void main(String[] args) {
        double initialTuition = 10_000;
        double increaseRate = 0.05, newTuition = 0, decadeTuition = 0;

        for (int i = 1; i <= 14; i++){
            double increment  = initialTuition * increaseRate;
            newTuition = initialTuition + increment;
            initialTuition = newTuition;

            if (i == 10)
                decadeTuition = initialTuition;
        }
        newTuition = newTuition - decadeTuition;
        System.out.printf("The tuition in ten years becomes $%.2f\n", decadeTuition);
        System.out.printf("Four years worth after the ten years is $%.2f", newTuition);

    }
}
