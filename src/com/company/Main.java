package com.company;

import com.company.enums.FishEnum;
import com.company.model.Fish;
import com.company.model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Anna", "Marseniuk");
        Fish fish = new Fish(FishEnum.karp, 1.2, 15.0);
    }
}
