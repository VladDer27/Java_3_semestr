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
public class GameAuthor {
    private String nickname;
    private String birthDate;

    @Override
    public String toString() {
        return "GameAuthor{" +
                "nickname='" + nickname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
