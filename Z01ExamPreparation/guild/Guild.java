package Z01ExamPreparation.guild;

import java.util.*;

public class Guild {
    private String name;
    private int capacity;
    Map<String, Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new LinkedHashMap<>();
    }

    public void addPlayer(Player player) {
        if (roster.size() < capacity) {
            roster.put(player.getName(), player);
        }
    }

    public boolean removePlayer(String george) {
        if (roster.containsKey(george)) {
            roster.remove(george);
            return true;
        }
        return false;
    }

    public int count() {
        return roster.size();
    }

    public void promotePlayer(String name) {
        Player player = roster.get(name);
        if (player != null) {
            player.setRank("Member");
        }
    }

    public void demotePlayer(String name) {
        Player player = roster.get(name);
        if (player != null) {
            player.setRank("Trial");
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Player> entry : roster.entrySet()) {
            Player player = entry.getValue();
            if (player.getClazz().equals(clazz)) {
                names.add(entry.getKey());
            }
        }

        Player[] removedPlayers = new Player[names.size()];
        for (int i = 0; i < names.size(); i++) {
            Player player = roster.remove(names.get(i));
            removedPlayers[i] = player;
        }

        return removedPlayers;
    }

    //
    public String report() {
        StringBuilder out = new StringBuilder("Players in the guild: " + name + ":\n");
        for (Player p:roster.values()) {
            out.append(p)
                    .append(System.lineSeparator());
        }

        return out.toString().trim();
    }
}
