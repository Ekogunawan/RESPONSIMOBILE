package com.gmail.akakom16.eko.responsimobile;
//TODO 1 java : yaitu program di atas  adalah package dari nama projec
import java.io.Serializable;
//TODO 2 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun
public class PlayerItem implements Serializable {
    String no, name, Position, birth_date, Poster;
//TODO 3 java: Yaitu program di atas adalah class PlayItem dengan mengimplementasikan dari serialzable dan kemudian mendeklarasikan variabel

    public PlayerItem(String no, String name, String Position, String birth_date, String Poster ) {
        this.no = no;
        this.name = name;
        this.Position = Position;
        this.birth_date = birth_date;
        this.Poster = Poster;
    }

//TODO 4 java: Yaitu program diatas untuk membuat method dengan mendeklarasikan variabel yang sudah di deklarasikan di atas

    public String getNo() {
        return no;
    }
//TODO 5 java: Yaitu program diatas untuk membuat method dengan get no degnan menagmbil variabel no

    public String getName() {
        return name;
    }
//TODO 6 java: Yaitu program diatas untuk membuat method dengan get nama degnan menagmbil variabel name

    public String getPosition() {
        return Position;
    }
    //TODO 7 java: Yaitu program diatas untuk membuat method dengan getposition degnan menagmbil variabel position
    public String getBirth_date(){
        return birth_date;
    }
    //TODO 8 java: Yaitu program diatas untuk membuat method dengan getbritdate degnan menagmbil variabel brithdate
    public String getPoster() {
        return Poster;
    }
    //TODO 9 java: Yaitu program diatas untuk membuat method dengan getposter degnan menagmbil variabel poster
}