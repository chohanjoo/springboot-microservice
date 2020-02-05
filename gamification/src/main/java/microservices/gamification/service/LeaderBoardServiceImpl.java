package microservices.gamification.service;

import microservices.gamification.domain.LeaderBoardRow;
import microservices.gamification.repository.ScoreCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class LeaderBoardServiceImpl implements LeaderBoardService {

  private ScoreCardRepository scoreCardRepository;

  LeaderBoardServiceImpl(ScoreCardRepository scoreCardRepository) {
    this.scoreCardRepository = scoreCardRepository;
  }

  @Override
  public List<LeaderBoardRow> getCurrentLeaderBoard() {
    return scoreCardRepository.findFirst10();
  }
}
