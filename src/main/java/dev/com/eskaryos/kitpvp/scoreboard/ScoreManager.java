package dev.com.eskaryos.kitpvp.scoreboard;

import dev.com.eskaryos.kitpvp.Main;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreManager {

    public static Map<Player,FastBoard> scoreboard = new HashMap<>();

    public static void setPlayerScore(Player p){
        if(scoreboard.containsKey(p))return;
        String title = "§6§lKIT PVP";
        List<String> score = new ArrayList<>();
        score.add("");
        score.add("§fRank: §7DEFAULT");
        score.add("§fKit: §aNenhum");
        score.add("§fStreak: §a0");
        score.add("");
        score.add("§fKills: §a0");
        score.add("§fCoins: §60");
        score.add("");
        score.add("§ewww.spigotmc.com");

        FastBoard board = new FastBoard(p);
        board.updateTitle(title);
        board.updateLines(score);
        scoreboard.put(p,board);
    }

    public static void update(){
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : scoreboard.keySet()) {
                    List<String> score = new ArrayList<>();
                    score.add("");
                    score.add("§fRank: §7DEFAULT");
                    score.add("§fKit: §aNenhum");
                    score.add("§fStreak: §a0");
                    score.add("");
                    score.add("§fKills: §a0");
                    score.add("§fCoins: §60");
                    score.add("");
                    score.add("§ewww.spigotmc.com");

                    FastBoard board = scoreboard.get(player);
                    board.updateLines(score);
                }
            }
        }.runTaskTimer(Main.plugin,40,40);
    }
    public static void removescore(Player p){
        if(!scoreboard.containsKey(p))return;
        scoreboard.get(p).delete();
        scoreboard.remove(p);
    }
}
