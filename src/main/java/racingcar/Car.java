package racingcar;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomValue) {
        if (canMove(randomValue)) {
            position++;
        }
        // car.stop(); // 정지는 상태 변화가 없어서 별도로 구현하지 않음
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public boolean canMove(int randomValue) {
        return randomValue >= 4;
    }
}
