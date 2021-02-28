package mains;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pix {

    private Image one,one1,two,two1,three,three1,four,four1,five,five1,six,six1,seven,seven1,eight,eight1;
    int selection;
    private ArrayList<Image> images, originals;

    public Pix() {
        String folder = "";
        selection = (int) (Math.random() * 5);
        if (selection == 0) {
            folder = "imagenes1";
        } else if (selection == 1) {
            folder = "imagenes2";
        } else if (selection == 2) {
            folder = "imagenes3";
        } else if (selection == 3) {
            folder = "imagenes4";
        } else if (selection == 4) {
            folder = "imagenes5";
        }
        System.out.println(selection + "selection");
        setUpImages(folder);
        setUpArrayList();
    }

    public ArrayList<Image> getOriginals() {
        return originals;
    }

    public ArrayList<Image> getImageViews() {
        return images;
    }

    private void setUpImages(String fName) {
        one = new Image("/imagenes/" + fName + "/imagen1.png");
        one1 = one;
        two = new Image("/imagenes/" + fName + "/imagen2.png");
        two1 = two;
        three = new Image("/imagenes/" + fName + "/imagen3.png");
        three1 = three;
        four = new Image("/imagenes/" + fName + "/imagen4.png");
        four1 = four;
        five = new Image("/imagenes/" + fName + "/imagen5.png");
        five1 = five;
        six = new Image("/imagenes/" + fName + "/imagen6.png");
        six1 = six;
        seven = new Image("/imagenes/" + fName + "/imagen7.png");
        seven1 = seven;
        eight = new Image("/imagenes/" + fName + "/imagen8.png");
        eight1 = eight;
    }

    private void setUpArrayList() {
        images = new ArrayList<>(16);
        images.add(one);
        images.add(one1);
        images.add(two);
        images.add(two1);
        images.add(three);
        images.add(three1);
        images.add(four);
        images.add(four1);
        images.add(five);
        images.add(five1);
        images.add(six);
        images.add(six1);
        images.add(seven);
        images.add(seven1);
        images.add(eight);
        images.add(eight1);
        originals = (ArrayList<Image>) images.clone();

        Collections.shuffle(images,new Random());
    }
}
