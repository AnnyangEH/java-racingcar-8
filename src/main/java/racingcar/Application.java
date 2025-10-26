package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Printer print = new Printer();

        print.carsNameInput();
        String input = Console.readLine();
        String[] names = input.split(",");
        Validator.validateCarNames(names);

        print.raceCountInput();
        String raceCountInput = Console.readLine();
        Validator.validateRaceCount(raceCountInput);
        int raceCount = Integer.parseInt(raceCountInput);

        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name.trim()));
        }

        System.out.println("\n실행 결과");
        Race race = new Race(cars, raceCount);
        race.startRace(print);
        print.raceWinner(race.findWinnerNames());
    }
}
