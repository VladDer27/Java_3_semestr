package practice14.practice14.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice14.practice14.Entity.Game;

import java.util.ArrayList;

@Controller
public class ControllerGame {
    private ArrayList<Game> list2 = new ArrayList<>();


    @PostMapping(value = "/add-game")
    @ResponseBody
    public String createGame(@RequestParam("gameName") String name, @RequestParam("gameCreationDate") String creationDate) {
        System.out.println(name);
        Game game = new Game(name, creationDate);
        list2.add(game);
        return game.toString();
    }

    @GetMapping(value = "/show-game")
    @ResponseBody
    public Object[] showGame() {
        return list2.stream()
                .filter(item -> item instanceof Game).toArray();
    }

    @GetMapping(value = "/delete-game")
    @ResponseBody
    public boolean deleteGame(@RequestParam("gameName") String name) {
        int temp = list2.size();
        list2.removeIf(i -> i.getName().equals(name));
        return temp != list2.size() ?  true :  false;
    }
}
