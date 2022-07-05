package ru.netology.domain;


public class FilmsManager {

    private Affice[] films = new Affice[0];

    private int limit;




    public FilmsManager(){
        limit = 10;
    }
    public FilmsManager(int limit){
        this.limit = limit;

    }



    public void save(Affice film){
        Affice[] tmp = new Affice[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;

        films = tmp;
    }


    public Affice[] findAll(){
        return films;
    }

    public Affice[] findLast(){

        Affice[] recent = new Affice[limit];
        if (limit < films.length){
            recent = new Affice[limit];
        }else {
            recent = new Affice[films.length];
        }
        return recent;
    }

}
