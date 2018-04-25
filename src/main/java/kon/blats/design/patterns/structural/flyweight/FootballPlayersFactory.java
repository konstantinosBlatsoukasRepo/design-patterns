package kon.blats.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by k.blatsoukas on 4/25/2018.
 */
public class FootballPlayersFactory {

  private final static Map<String, FootballPlayer> playersCache = new HashMap<>();

  public static FootballPlayer create(String firstName, String lastName, String team, String position) {
    String playerKey = firstName + lastName + team + position;
    if (playersCache.containsKey(playerKey)) {
      return playersCache.get(playerKey);
    }
    FootballPlayer footballPlayer = new FootballPlayer(firstName, lastName, team, position);
    playersCache.put(playerKey, footballPlayer);
    return footballPlayer;
  }
}
