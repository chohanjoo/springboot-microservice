## 공부해야 할 리스트

### SpringRunner

애플리케이션 컨텍스트를 초기화하고 필요한 객체를 주입한다.

단순히 클래스 하나의 기능을 테스트하기 위해서라면 종속성을 주입하거나 애플리케이션 컨텍스트가 필요하지 않는다.

그러므로 @SpringBootTest를 사용하지 않고 그냥 클래스의 구현체를 테스트하는 게 낫다.

여러 클래스 간의 상호작용을 확인하는 통합 테스트에서 사용한다.



### @MockBean 과 @Mock 의 차이



### Lombok

롬복은 컴파일러 동작 전에 애너테이션을 기반으로 코드를 생성한다.

이로써 코드의 중복과 불필요한 부분을 제거해 간결하게 만든다. (getter, 생성자, toString ...) 이런 코드는 모두 애너테이션으로 대체할 수 있다. 

이런 애너테이션을 하나로 무끼은 @Data와 같은 애너테이션도 있다.



~~~
@RequiredArgsConstructor		// 모든 상수 필드를 갖는 생성자 생성
@Getter											// 모든 필드의 getter를 생성
@ToString										// 해당 클래스의 toString() 메서드를 읽기 쉽게
@EqualsAndHashCode			 		// equals(), hashCode()		
~~~



### TDD

TDD 방식을 따라 먼저 임시 메서드를 만든다. 임시 메서드는 항상 실패한 결과를 반환한다. 그 후 새로운 테스트 메서드를 작성한다.



### REST API 설계 표준



### @Before, setup 메서드



### Given - When



### assertThat



### @WebMvcTest VS @SpringBootTest

@WebMvcTests 는 스프링의 웹 애플리케이션 컨텍스트를 초기화한다. 이 애너테이션은 MockMvc 빈도 불러온다.

@WebMvcTest 는 컨트롤러를 테스트하는 애니테이션이다.

HTTP 요청과 응답은 목을 이용해 가짜로 이뤄지고 실제 연결은 생성되지 않는다.

@SpringBootTest 는 웹 애플리케이션 컨텍스트와 설정을 모두 불러와 실제 웹 서버에 연결을 시도한다.

**@WebMvcTest는 서버에서 컨트롤러만 테스트할 때 사용하고, @SpringBootTest는 클라이언트부터 상호작용을 확인하는 통합 테스트에서 사용하는 것이 좋다.**



### @MockBean

@Mock 대신 @MockBean 사용 

왜? 스플링이 진짜 빈( MultiplicationServiceImpl ) 대신 목 객체를 주입해야 하기 때문이다.

목 객체는 given() 메서드에서 지정한대로 값을 반환한다.



### @JacksonTester

JSON의 내용을 쉽게 확인 가능하다.

---
출처

스프링 부트를 활용한 마이크로 서비스 개발 - 모이세스 메이세로, 한동호