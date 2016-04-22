package Iterator;

/**
 * Created by Gru on 2016. 4. 21..
 *
 * 선언되어 있는 메소드는 iterator 메소드 하나뿐이다.
 * 이 메소드는 집합체에 대응하는 Iterator 를 1개 작성하기 위한 것이다.
 *
 * 집합체를 하나씩 나열하고 검색하고 조사하고 싶을 때에는 iterator 메소드를 사용해서
 * iIterator 인터페이스를 구현한 클래스의 인스턴스를 1개 만든다.
 */
public interface iAggregate {
  public abstract iIterator iterator();
}
