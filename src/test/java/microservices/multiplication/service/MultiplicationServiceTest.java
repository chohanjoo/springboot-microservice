package microservices.multiplication.service;

import microservices.multiplication.domain.Multiplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {

  @MockBean
  private RandomGeneratorService randomGeneratorService;

  @Autowired
  private MultiplicationService multiplicationService;

  @Test
  public void createRandomMultiplicationTest() {
    // given (randomGeneratorService 가 처음에 50, 나중에 30을 반환하도록 설정)
    given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);

    // when
    Multiplication multiplication = multiplicationService.createRandomMultiplication();

    // assert
    assertThat(multiplication.getFactorA(), is(50));
    assertThat(multiplication.getFactorB(), is(30));
    assertThat(multiplication.getResult(), is(1500));
  }
}