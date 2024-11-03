# Lotto

## 📌 개요

> 간단한 로또 발매기 입니다. 로또를 구입하여 당첨여부를 확인하세요!

### 입력

로또를 구입할 수 있습니다. 1000원 단위로 계산되며, 1000원으로 나누어떨어지지 않을 시 Exception이 호출됩니다.

```
구입금액을 입력해 주세요.
> 8000
```

당첨번호를 입력받습니다. `,`로 구분하여야 하며, 1~45의 사이의 수가 아니거나 수가 아닐 시 혹은 개수가 6개가 아닐 시 Exception이 호출됩니다.

```
당첨 번호를 입력해 주세요.
> 1,2,3,4,5,6
```

보너스 번호는 위의 당첨 번호와 중복되지 않아야 하며, 1~45 사이의 정수이여야 합니다.

```
보너스 번호를 입력해 주세요.
> 7
```

<br>

### 예시

```
구입금액을 입력해 주세요.
8000

8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]

당첨 번호를 입력해 주세요.
1,2,3,4,5,6

보너스 번호를 입력해 주세요.
7

당첨 통계
---
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
총 수익률은 62.5%입니다.
```

<br>

# 로또 기능 명세서

> 모든 예외 상황에선 에러 메시지를 출력 후 다시 입력받아야 한다.<br>에러 메시지는 `[ERROR]`로 시작해야 한다.<br>
> `Exception`이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.

### 로또 구입 금액을 입력받는 기능

- [x] 로또 금액은 1000원 단위로 나누어 떨어져야 한다.
  - 예외 처리
    - [x] 1000원 단위로 나누어 떨어지지 않을 경우
    - [x] 0 또는 음수가 들어올 경우
    - [x] 숫자가 아닌 문자열이 들어올 경우
    - [x] 빈 칸이거나 공백문자가 들어올 경우
    - [x] 10만원을 초과하여 구매할 경우

### 구매한 개수만큼 로또 번호를 발급하는 기능

- `Randoms.pickUniqueNumbersInRange(1, 45, 6);`을 사용한다.
  - 1에서 45 사이의 중복되지 않은 정수 6개 반환
- [x] 로또 번호는 오름차순으로 정렬되어야 한다.

### 구매 개수 확인 기능

- [x] 로또를 구매한 개수를 출력
- [x] 구매한 로또 번호들을 출력

### 당첨 번호를 입력하는 기능

- [x] `,`로 구분된 당첨 번호를 입력받는다.
  - 예외 처리
    - [x] 1 ~ 45의 사이의 수가 아닐 경우
    - [x] `,`로 구분된 문자가 양수가 아닐 경우
    - [x] 개수가 6개가 아닐 경우
    - [x] 중복된 숫자가 있을 경우

### 보너스 번호를 입력하는 기능

- [x] 보너스 번호를 입력받는다.
  - 예외 처리
    - [x] 입력한 당첨 번호와 중복되는 경우
    - [x] 숫자가 아닌 문자일 경우
    - [x] 1 ~ 45 사이의 수가 아닐 경우
    - [x] 정수가 아닐 경우

### 로또 결과를 출력하는 기능

### 당첨된 결과를 저장하는 기능

- [x] 구매한 로또 번호와 당첨 번호를 비교하여 저장하는 기능
  - 두 리스트 비교하여 공통 수 찾기
- [x] 보너스 번호가 포함되는지 확인하는 기능

### 수익률을 계산하는 기능

- 수익률은 소수점 둘째 자리에서 반올림한다. (ex. 100.0%, 51.5%, 1,000,000.0%)



