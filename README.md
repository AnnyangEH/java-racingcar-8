# 🚗 자동차 경주 게임

## 📘 과제 진행 요구 사항
- 미션은 **자동차 경주 저장소를 포크하고 클론**하는 것으로 시작한다.
- 구현 전 `README.md`에 **구현할 기능 목록을 정리**한다.
- **기능 단위로 커밋**하고, 커밋 메시지는 *AngularJS Commit Convention*을 따른다.
- 구현 완료 후 **모든 테스트가 통과**하는지 확인한다.

---

## ⚙️ 기능 요구 사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 전진 조건: 0~9 사이의 무작위 값이 **4 이상일 경우 전진**한다.
- 자동차 이름은 쉼표(`,`)로 구분되며, **5자 이하만 허용**한다.
- 사용자는 자동차 이름과 시도할 횟수를 입력한다.
- 게임 완료 후 **최종 우승자(들)** 의 이름을 출력한다.
    - 우승자가 여러 명일 경우 쉼표(`,`)로 구분한다.
- 잘못된 입력값(`빈 값`, `이름 5자 초과`, `숫자 아님`)이 들어오면  
  `IllegalArgumentException`을 발생시키고 프로그램은 종료된다.

---

## 💻 프로그래밍 요구 사항
- JDK 21 사용
- 시작점: `Application.main()`
- `camp.nextstep.edu.missionutils` 패키지의 API 사용
    - `Randoms.pickNumberInRange(0,9)`
    - `Console.readLine()`
- 외부 라이브러리 사용 금지
- `System.exit()` 호출 금지
- indent depth는 2까지 허용, 3 이상 금지
- 3항 연산자 사용 금지
- 메서드는 한 가지 일만 하도록 구현

### 라이브러리
- camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현해야 한다.
    - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용한다.
    - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.

---


## 🧩 구현 기능 목록

### 입력

### 게임 실행

### 출력

### 예외 처리

---

## 🧪 실행 예시

