package com.company;

public class Main {

    public static void main(String[] args) {
        Uy uy = new Uy("Milkyway",5, 80);
        Uy uy1 = new Uy("Milkyway1",6, 87);
        Uy uy2 = new Uy("Milkyway2",2, 90);
        Uy uy3 = new Uy("Milkyway3",7, 83);
        Uy uy4 = new Uy("Milkyway4",9, 70);
        Uy[] uylar = {uy, uy1, uy2, uy3, uy4};

        Koy koy1 = new Koy("Barashek1", 3, 30);
        Koy koy2 = new Koy("Barashek2", 3, 30);
        Koy koy3 = new Koy("Barashek3", 3, 30);
        Koy koy4 = new Koy("Barashek4", 3, 30);
        Koy koy5 = new Koy("Barashek5", 3, 30);
        Koy koy6 = new Koy("Barashek6", 3, 30);
        Koy koy7 = new Koy("Barashek7", 3, 30);
        Koy koy8 = new Koy("Barashek8", 3, 30);
        Koy[] koylor = {koy1, koy2, koy3, koy4, koy5, koy6, koy7, koy8};

        At at = new At("Sugar", 8, 150);
        At at1 = new At("Sugar1", 8, 150);
        At[] attar = {at, at1};

        Jailoo jailoo1 = new Jailoo("Chyiyrchyk", "Alay", "Aizhurok", uylar, koylor, attar);

        Uy uy8 = new Uy("Korovushka1", 8, 98);
        Uy uy9 = new Uy("Korovushka2", 8, 98);
        Uy[] uylar2 = {uy8,uy9};

        Koy koy10 = new Koy("Kudryashka1", 5,56);
        Koy koy11 = new Koy("Kudryashka2", 1,76);
        Koy koy12 = new Koy("Kudryashka3", 3,58);
        Koy koy13 = new Koy("Kudryashka4", 2,120);
        Koy[] koylor14 = {koy10,koy11,koy12,koy13};

        At at8 = new At("Karajorgo1",6,168);
        At at9 = new At("Karajorgo2",3,178);
        At at10 = new At("Karajorgo3",8,128);
        At at11 = new At("Karajorgo4",12,188);
        At at12 = new At("Karajorgo5",7,190);
        At[] attar99 = {at8, at9, at10, at11, at12};

        Jailoo jailoo2 = new Jailoo("Koitash", "Jalalabad", "Chynara", uylar2, koylor14, attar99);

        System.out.println("Birinchi jailoonun aty:"+" "+jailoo1.getName()+";"+" "+"Jailoonun daregi:"+" "+jailoo1.getDaregi()+";"+" "+"Chabandyn aty:"+" "+jailoo1.getChabandynAty());
        System.out.println("Birinchi jailoodo:"+" "+uylar.length+" "+"uy"+","+" "+koylor.length+","+" koy"+","+" "+attar.length+" "+"at");
        System.out.println("Uylar:");

        for (Uy a: jailoo1.getUylar()){
            System.out.println(a.getName()+" "+a.getAge()+" "+a.getWeight());
        }
        System.out.println("Koylor:");
        for (Koy b: jailoo1.getKoylor()){
            System.out.println(b.getName()+" "+b.getAge()+" "+b.getWeight());
        }
        System.out.println("Attar:");
        for (At c: jailoo1.getAttar()){
            System.out.println(c.getName()+" "+c.getAge()+" "+c.getWeight());
        }
        System.out.println("                                                    ");
        System.out.println("Ekinchi jailoonun aty:"+" "+jailoo2.getName()+";"+" "+"Daregi:"+" "+jailoo2.getDaregi()+";"+" "+"Chabandyn aty:"+" "+jailoo2.getChabandynAty());
        System.out.println("Ekinchi jailoodo:"+" "+uylar2.length+" "+"uy"+","+" "+koylor14.length+" "+"koy"+","+" "+ " "+attar99.length+" "+"at");
        System.out.println("Uylar:");
        for (Uy j: jailoo2.getUylar()){
             System.out.println(j.getName()+" "+j.getAge()+" "+j.getWeight());
         }
        System.out.println("Koylor:");
        for (Koy k: jailoo2.getKoylor()){
            System.out.println(k.getName()+" "+k.getAge()+" "+k.getWeight());
         }
        System.out.println("Attar:");
        for (At t: jailoo2.getAttar()){
            System.out.println(t.getName()+" "+t.getAge()+" "+t.getWeight());
        }



    }
}
