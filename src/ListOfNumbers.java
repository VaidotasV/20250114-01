import java.util.ArrayList;
import java.util.List;

class ListOfNumbers {
    private List<Double> numbers;

    public ListOfNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(double number) {
        numbers.add(number);
    }

    public double getAverage() {
        if (numbers.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{numbers=" + numbers + "}";
    }
}
