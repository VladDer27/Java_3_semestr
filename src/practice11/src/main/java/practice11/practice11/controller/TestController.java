package practice11.practice11.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @RequestMapping("/test")
    public ResponseEntity getTest(){
        try{
            return ResponseEntity.ok("Сервер работает!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка!");
        }
    }
}
