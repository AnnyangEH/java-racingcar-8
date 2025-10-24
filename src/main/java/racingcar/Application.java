package racingcar;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 간단 구현
        // ### 입력
        //- [v] 자동차 이름을 쉼표(,)로 구분하여 입력받음
        //- [v] 시도할 횟수를 입력받음
        //- [ ] 입력값이 유효하지 않으면 `IllegalArgumentException` 발생
        //### 출력
        //- [v] 각 라운드 결과 `"이름 : ----"` 출력
        //- [v] 최종 우승자 `"최종 우승자 : 이름"` 또는 `"최종 우승자 : 이름, 이름"` 출력
        //### 게임 진행
        //- [?] 주어진 횟수 동안 모든 자동차는 전진 또는 정지
        //- [v] 각 라운드 결과를 저장
        //- [v] 최종 우승자를 계산
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        System.out.println("시도할 횟수는 몇 회인가요?");
        String raceCountInput = Console.readLine();

        int raceCount = Integer.parseInt(raceCountInput);
        String[] carNames = input.split(",");

        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name.trim()));
        }
        System.out.println("\n실행 결과");
        for (int i = 0; i < raceCount; i++) {
            playRound(cars);
            System.out.print('\n');
        }
        String winners = findWinner(cars);
        printWinner(winners);
    }

    private static void playRound(List<Car> cars) {
        for (Car car : cars) {
            int randomValue = Randoms.pickNumberInRange(0, 9);
            car.move(randomValue);
            printPosition(car);
        }
    }

    private static void printPosition(Car car) {
        System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
    }

    private static String findWinner(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return String.join(", ", winners);
    }

    private  static void printWinner(String winners) {
        System.out.println("최종 우승자 : " + winners);
    }
}
