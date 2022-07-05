package ru.netology.domain;


import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    Affice first = new Affice(12, "Бладшот", "Боевик");
    Affice second = new Affice(13, "Вперед", "Мультфильм");
    Affice third = new Affice(14, "Отель Белград", "Комедия");
    Affice fourth = new Affice(15, "Джентельмены", "Комедия");
    Affice five = new Affice(16, "Человек невидимка", "Ужасы");
    Affice six = new Affice(17, "Тролли", "Мультфильм");
    Affice seven = new Affice(18, "Номер один", "Комедия");
    Affice eight = new Affice(19, "Терминатор", "Боевик");
    Affice nine = new Affice(20, "Матрица", "Фантастика");
    Affice ten = new Affice(21, "Колобок", "Мультфильм");
    Affice eleven = new Affice(22, "Спартак", "Боевик");


    @Test
    public void myTest(){
        Affice[]films = new Affice[0];
        FilmsManager manager = new FilmsManager();


        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
        manager.save(eleven);

    }

}


