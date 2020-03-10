package ru.job4j.oop;

public class Jukebox {
    private String[] songs;

    public Jukebox() {
        this.songs = new String[2];
        this.songs[0] =
            "Пусть бегут неуклюже" + System.lineSeparator() +
            "Пешеходы по лужам," + System.lineSeparator() +
            "А вода по асфальту рекой." + System.lineSeparator() +
            "И неясно прохожим" + System.lineSeparator() +
            "В этот день непогожий," + System.lineSeparator() +
            "Почему я веселый такой?" + System.lineSeparator() +
            "А я играю на гармошке" + System.lineSeparator() +
            "У прохожих на виду." + System.lineSeparator() +
            "К сожаленью, день рожденья" + System.lineSeparator() +
            "Только раз в году." + System.lineSeparator() +
            "Прилетит вдруг волшебник" + System.lineSeparator() +
            "В голубом вертолете" + System.lineSeparator() +
            "И бесплатно покажет кино." + System.lineSeparator() +
            "С днем рожденья поздравит" + System.lineSeparator() +
            "И, наверно, оставит" + System.lineSeparator() +
            "Мне в подарок пятьсот эскимо." + System.lineSeparator() +
            "А я играю на гармошке" + System.lineSeparator() +
            "У прохожих на виду." + System.lineSeparator() +
            "К сожаленью, день рожденья" + System.lineSeparator() +
            "Только раз в году." + System.lineSeparator() +
            "К сожаленью, день рожденья" + System.lineSeparator() +
            "Только раз в году." + System.lineSeparator();

        this.songs[1] =
            "Спят усталые игрушки" + System.lineSeparator() +
            "Спят усталые игрушки, книжки спят." + System.lineSeparator() +
            "Одеяла и подушки ждут ребят." + System.lineSeparator() +
            "Даже сказка спать ложится," + System.lineSeparator() +
            "Чтобы ночью нам присниться." + System.lineSeparator() +
            "Ты ей пожелай:" + System.lineSeparator() +
            "Баю-бай." + System.lineSeparator() +
            "Обязательно по дому в этот час" + System.lineSeparator() +
            "Тихо-тихо ходит дрема возле нас." + System.lineSeparator() +
            "За окошком всё темнее," + System.lineSeparator() +
            "Утро ночи мудренее." + System.lineSeparator() +
            "Глазки закрывай," + System.lineSeparator() +
            "Баю-бай." + System.lineSeparator() +
            "Баю-бай, должны все люди ночью спать." + System.lineSeparator() +
            "Баю-баю, завтра будет день опять." + System.lineSeparator() +
            "За день мы устали очень," + System.lineSeparator() +
            "Скажем всем: \"Спокойной ночи!\"" + System.lineSeparator() +
            "Глазки закрывай," + System.lineSeparator() +
            "Баю-бай." + System.lineSeparator();
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();

        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println(this.songs[0]);
        } else if (position == 2) {
            System.out.println(this.songs[1]);
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
