# 문자열 덧셈 계산기

## Todo

## Done
* null, 빈 문자열 일 경우 0 반환
* 커스텀 구분자를 포함하는지 확인 ("//"와 "\n")
    * "//;\n1;2;3" -> 1 + 2 + 3 = 6
    * "//;\n1,2,3" -> RuntimeException
* 커스텀 구분자가 없다면 쉼표(,) 또는 콜론(:) 구분자를 기준으로 각 숫자의 합을 반환
    * "1,2:3" -> 1 + 2 + 3 = 6
* 숫자만 있다면 숫자로 변환 후 반환
* 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException throw

# 사다리게임
## Todo
 * (참여자 수-1)만큼의 크기를 가지는 한개의 사다리 Line을 만든다.
    - 랜덤 boolean에 따라 한 가로라인이 생성되는지 안되는지 검증.
    - 한 Line의 크기가 (참여자 수 - 1)인지 검증.
    - 한 라인에 가로 라인이 겹치지 않는지 검증.
* 높이만큼 Line을 가지는 사다리를 만든다.
    - 높이만큼 Line이 만들어 졌는지 검증
* 사다리 출력

## Done
* 이름을 입력받고, 쉼표(,)를 기준으로 구분
* Player(n:ame,position) 객체 생성
    - 올바른 이름인지 검증
        + 5글자 이하면 생성
        + 5글자 초과면 예외발생
        + null 또는 빈문자열 이면 예외발생
* 사다리 높이 입력
* 사다리 높이 저장
    - 1 이상의 정수인지 검증



# java-ladder
사다리타기 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)