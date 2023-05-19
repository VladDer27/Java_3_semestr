package practice14.practice14.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//используем Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private String name;
    private String creationDate;

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}
