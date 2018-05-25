package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class BooksOfDrinks {

    private DrinksMapper drinksMapper;
    private DbService dbService;

    @GetMapping("/drinks")
    public List<DrinksDto> getDrinks(){

    }

    public void deleteDrink(DrinksDto drinksDto){

    }
    public void createDrink(DrinksDto drinksDto) {

    }
    public DrinksDto updateDrink (DrinksDto drinksDto){

    }
}
