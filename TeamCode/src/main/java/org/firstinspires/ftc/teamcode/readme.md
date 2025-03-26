## 사용법 설명

우선 이 DiverController를 사용하기 위해서는 DiverController 객체를 생성해 주셔야 합니다.
생성자 인자 전달은 다음과 같이 사용하여야 합니다.

```java
public class main extends LinearOpMode {
    ...
    /* 
    인자는 왼쪽 위 모터, 오른쪽 위 모터, 왼쪽 아래 모터, 오른쪽 아래 모터 순으로 전달합니다.
    모터는 클레스를 전달 하는 것이 아닌 해당 모터의 설정명을 인자로 전달하도록 합니다.
     */
    DiverController DC = new DiverController("LeftUp", "RightUp", "LeftDown", "RightDown");
}
...
```
