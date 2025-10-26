package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> cars;
    private final int roundCount;

    public Race(List<Car> cars, int roundCount) {
        this.cars = cars;
        this.roundCount = roundCount;
    }

    public void startRace(Printer print) {
        for (int i = 0; i < roundCount; i++) {
            playSingleRound(print);
            print.newLine();
        }
    }

    private void playSingleRound(Printer print) {
        for (Car car : cars) {
            int randomValue = Randoms.pickNumberInRange(0, 9);
            car.move(randomValue);
            print.carsPosition(car);
        }
    }

    public String findWinnerNames() {
        int maxPosition = findMaxPosition();
        List<Car> winners = findWinnerCars(maxPosition);
        List<String> winnerNames = new ArrayList<>();

        for (Car winner : winners)
            winnerNames.add(winner.getName());
        return String.join(", ", winnerNames);
    }

    private int findMaxPosition() {
        int max = 0;
        for (Car car : cars)
            max = Math.max(max, car.getPosition());
        return max;
    }

    private List<Car> findWinnerCars(int maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition)
                winners.add(car);
        }
        return winners;
    }
}
