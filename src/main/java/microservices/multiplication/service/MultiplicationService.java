package microservices.multiplication.service;

import microservices.multiplication.domain.Multiplication;
import microservices.multiplication.domain.MultiplicationResultAttempt;

import java.util.List;

public interface MultiplicationService {

  /**
   * 두 개의 무작위 인수를 인수를 담은 {@link Multiplication} 객체를 생성한다.
   * 무작위로 생성되는 숫자의 범위는 11~99.
   *
   * @return 무작위 인수를 담은 {@link Multiplication} 객체
   */
  Multiplication createRandomMultiplication();

  /**
   * @return 곱셈 계산 결과가 맞으면 true, 아니면 false
   */
  boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

  /**
   * 해당 사용자의 통계 정보를 조회한다.
   *
   * @param userAlias는 해당 사용자의 닉네임
   * @return 해당 사용자가 전에 제출한 답안 객체 {@link MultiplicationResultAttempt}의 리스트
   */
  List<MultiplicationResultAttempt> getStatsForUser(final String userAlias);

}
