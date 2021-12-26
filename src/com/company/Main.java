package com.company;

public class Main {

    public static void main(String[] args) {
        /**Балык, Попугай, мышык жана ит деген класс тузунуз
         *Алардын свойстваларын ойлоп табыныз
         *Бир канча объектилерин тузуп жана аларга маанилерин бериниз
         *Аларды консольго чыгарыныз
         *Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек*/

	Fish fish=new Fish();
    fish.setName("Nemo");
    fish.setSort("dolphin");
    fish.setAge(8);
    fish.setColor("blue");
    fish.setWeight(15);
        System.out.println("Fish name:"+fish.getName()+"\n"+"Sort:"+fish.getSort()+"\n"+"Age:"+fish.getAge());
        System.out.println("Color:"+fish.getColor()+"\n"+"Weight:"+fish.getWeight());
        System.out.println("*********************************");
    Parrot parrot=new Parrot();
    parrot.setName("Kesha");
    parrot.setSort("ara");
    parrot.setAge(2);
    parrot.setColor("blue-yellow");
    parrot.setWeight(1);
        System.out.println("Parrot name:"+parrot.getName()+"\n"+"Sort:"+parrot.getSort()+"\n"+"Age:"+parrot.getAge());
        System.out.println("Color:"+parrot.getColor()+"\n"+"Weight:"+parrot.getWeight());
        System.out.println("*********************************");
    Cat cat=new Cat();
    cat.setName("Snejok");
    cat.setSort("pushistik");
    cat.setAge(1);
    cat.setColor("white");
    cat.setWeight(1);
        System.out.println("Cat name:"+cat.getName()+"\n"+"Sort:"+cat.getSort()+"\n"+"Age:"+cat.getAge());
        System.out.println("Color:"+cat.getColor()+"\n"+"Weight:"+cat.getWeight());
        System.out.println("*********************************");
    Dog dog=new Dog();
    dog.setName("Lucky");
    dog.setSort("doberman");
    dog.setAge(3);
    dog.setColor("black");
    dog.setWeight(8);
        System.out.println("Dog name:"+dog.getName()+"\n"+"Sort:"+dog.getSort()+"\n"+"Age:"+dog.getAge());
        System.out.println("Color:"+dog.getColor()+"\n"+"Age:"+dog.getAge());
    }
}
