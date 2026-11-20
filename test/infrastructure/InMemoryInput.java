package infrastructure;

import java.util.List;

public class InMemoryInput {
    private List<Integer> numbers;

    public InMemoryInput(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}