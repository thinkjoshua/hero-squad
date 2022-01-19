package models;

import java.util.ArrayList;
import java.util.List;


    public class Hero {

        private String name;
        private int age;
        private String power;
        private String weakness;
        private int id;
        private static ArrayList<models.Hero> instances = new ArrayList<>();

        public Hero(String name, Integer age, String power, String weakness) {
            this.name = name;
            this.age = age;
            this.power = power;
            this.weakness = weakness;
            instances.add(this);
            this.id = instances.size();
        }

        public String getName() {return this.name;}
        //    public String getCv() {
//        String cv = this.name && this.power;
//    }
        public int getAge() {return this.age;}
        public String getPower() {return this.power;}
        public String getWeakness() {return this.weakness;}
        public static ArrayList<models.Hero> getAllInstances() {return instances;}
        public static void clearAllHeroes(){instances.clear();}
        public int getId(){return id;}
        public static models.Hero findById(int id) {return instances.get(id-1);}

        public static models.Hero setUpNewHero(){
            return new models.Hero("Green-Lantern",70,"Strong will","color yellow");
        }
        public static models.Hero setUpNewHero1(){
            return new models.Hero("Arrow",35,"Archery","Trust");
        }



    }

