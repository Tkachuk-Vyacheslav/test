package org.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Bicycle {

    final void run(){
        System.out.println("velic run!!");
    }

   final void run(int x){
        System.out.println("velic run!!");
    }



    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    //inner class
    public class HandleBar {

        public void right() {
            System.out.println("Руль вправо!");
            Bicycle peugeot = new Bicycle("Peugeot", 120);
            Bicycle.HandleBar handleBar = peugeot.new HandleBar();

        }

        public void left() {

            System.out.println("Руль влево!");
        }
    }

    //inner class
    public class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }
    }
}
