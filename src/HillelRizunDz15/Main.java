package HillelRizunDz15;

public class Main {

//    1) Зробіть клас MusicStyles, який міститиме метод playMusic()
//    2) Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
//    3) Спадкоємці повинні реалізовувати метод playMusic().
//    4) У мейн-класі створіть музичні гурти для кожного стилю
//    5) За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()

    public static void main(String[] args) {

        Player[] styles = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (Player group : styles) {
            group.playMusic();
        }
    }
}
