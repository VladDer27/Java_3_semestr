package practice14.practice14.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice14.practice14.Entity.GameAuthor;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerGameAuthor {
    private ArrayList<GameAuthor> list = new ArrayList<>();



    @PostMapping(value = "/add-gameAuthor")
    @ResponseBody
    public String createGameAuthor(@RequestParam("authorNickname") String nickname, @RequestParam("authorBirthDate") String birthDate) {
        System.out.println(nickname + " " + birthDate);
        GameAuthor gameAuthor = new GameAuthor(nickname, birthDate);
        System.out.println(gameAuthor.getNickname());
        list.add(gameAuthor);
        System.out.println(gameAuthor);
        return gameAuthor.toString();
    }

    @GetMapping(value = "/show-gameAuthor")
    @ResponseBody
    public Object[] showGameAuthor() {
        return list.stream()
                .filter(item -> item instanceof GameAuthor).toArray();
    }

    @GetMapping(value = "/delete-gameAuthor")
    @ResponseBody
    public boolean deleteGameAuthor(@RequestParam("authorNickname") String nickname, @RequestParam("authorBirthDate") String birthDate) {
        List<GameAuthor> rList = new ArrayList<>();
        list.stream()
                .filter(item -> item instanceof GameAuthor)
                .map(GameAuthor.class::cast)
                .filter(author -> author.getNickname().equals(nickname) &&
                        author.getBirthDate().equals(birthDate))
                .forEach(rList::add);
        list.removeAll(rList);
        return rList.size() != 0;
    }
}