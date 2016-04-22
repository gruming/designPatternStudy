package Iterator;

/**
 * Created by Gru on 2016. 4. 21..
 *
 * 요소를 하나씩 나열하면서 루프 변수와 같은 역할을 수행한다.
 *
 * 여기에 선언되어 있는 메소드는 2개 이다.
 * '다음 요소' 가 존재하는지를 조사하기 위한 hasNext 메소드와 '다음 요소'를 얻기 위한 next 메소드 이다.
 *
 * hasNext 메소드의 반환 값이 boolean 형인 이유가 이해될 것이다.
 * 다음 요소가 존재하면 이 메소드는 true 를 반환하고 다음 요소가 존재하지 않는 마지막 요소라면
 * 이 메소드의 반환값은 false 가 된다.
 * 즉, hasNext 메소드를 루프의 종료 조건으로 사용하기 위해서이다.
 *
 * next 메소드는 반환값의 형태가 Object 로 되어잇는 것에서 알 수 있듯이 next 메소드는 집합체의 요소 1개를
 * 반환해 준다.
 * 그러나 next 메소드의 역할은 그것만이 아니다.
 * 다음 next 메소드를 호출했을 때 정확히 다음 요소를 반환하도록 내부 상태를 다음으로 진행시켜 두는 역할이 뒤에 숨어 있다.
 */
public interface iIterator {

  public abstract boolean hasNext();

  public abstract Object next();
}
