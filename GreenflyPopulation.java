public class GreenflyPopulation {
    public static void main(String[] args) {
        int[] population = new int[29]; // index 0 is unused, 1 to 28 represent days
        population[1] = 9; // initial population at the end of day 1

        // loop through each day from day 2 to day 28
        for (int day = 2; day <= 28; day++) {
            int offspring = population[day-1] * 8; // calculate offspring from previous day's population
            int daughters = population[1]; // daughters produced on day 1
            for (int d = 2; d < day; d++) {
                daughters += population[d] * 8; // add daughters produced on previous days
            }
            population[day] = population[day-1] + offspring + daughters; // calculate total population
        }

        // print out the population at the end of each day
        for (int day = 1; day <= 28; day++) {
            System.out.println("Day " + day + ": " + population[day]);
        }
    }
}
