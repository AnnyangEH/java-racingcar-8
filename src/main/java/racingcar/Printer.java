package racingcar;

public class Printer {
    public void carsNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void raceCountInput() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void raceWinner(String winners) {
        System.out.println("최종 우승자 : " + winners);
    }

    public void newLine() {
        System.out.print('\n');
    }

    public void carsPosition(Car car) {
        System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
    }
}
