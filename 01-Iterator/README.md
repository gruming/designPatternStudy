
## Iterator ( 반복자 ) 의 역할
      
      요소를 순서대로 검색해가는 인터페이스(API)를 결정합니다.
      예제 프로그램에서는 Iterator 인터페이스가 그 역할을 하고,
      다음 요소가 존재하는지를 얻기 위한 hasNext 메소드와
      다음 요소를 얻기 위한 next 메소드를 결정합니다.
      
## ConcreteIterator ( 구체적인 반복자 ) 의 역할
    
    Iterator 가 결정한 인터페이스(API)를 실제로 구현합니다. 
    예제 프로그램에서는 BookShelfIterator 클래스가 이 역할을 하였습니다.
    이 역할은 검색하기 위해 필요한 정보를 가지고 있어야 합니다.
    예제 프로그램에서는 BookShelf 클래스의 인스턴스는 bookShelf 필드에서
    처리되고 있는 책은 index 필드에 기억되어 있었습니다.
    
## Aggregate ( 집합체 ) 의 역할
    
    Iterator 역할을 만들어내는 인터페이스(API)를 결정합니다.
    이 인터페이스(API)는 
    '내가 가지고 있는 요소를 순서대로 검색해 주는 사람'
    을 만들어내는 메소드입니다.
    예제 프로그램에서는 Aggregate 인터페이스가 이 역할을 담당하며 
    iterator 메소드를 결정합니다.
     
## ConcreteAggregate ( 구체적인 집합체 ) 의 역할

    Aggregate 역할이 결정한 인터페이스(API)를 실제로 구현하는 일을 합니다.
    구체적인 Iterator 역할, 즉 ConcreteIterator 역할의 인스턴스를 만들어 냅니다.
    예제 프로그램에서는 BookShelf 클래스가 이 역할을 담당하며, iterator 메소드를 구현합니다.

    