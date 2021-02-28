package mains;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import net.sf.jasperreports.engine.JRException;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class MemoryGameMedio {

    public ImageView zeroZero;
    public ImageView oneZero;
    public ImageView twoZero;
    public ImageView threeZero;
    public ImageView zeroOne;
    public ImageView oneOne;
    public ImageView twoOne;
    public ImageView threeOne;
    public ImageView zeroTwo;
    public ImageView oneTwo;
    public ImageView twoTwo;
    public ImageView threeTwo;
    public ImageView zeroThree;
    public ImageView oneThree;
    public ImageView twoThree;
    public ImageView threeThree;
    public Text tLabel;
    public Button finishButt = new Button();

    private ArrayList<Image> images;
    //fixme
    private static String time;


    Timer timeline;
    int secs = 0, mins = 0;

    private static final double INV = .00000000000001, VIS = 100;
    private static int wrong = 0;
    private int correct = 0;

    private static Pix pix;

    public MemoryGameMedio() {
    	
    
    	
     	 Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("Bienvenido al modo normal!");
         alert.setHeaderText(null);
         alert.setContentText("En esta difucultad tienes 1 min para resolver el panel");

         alert.showAndWait();
    	
    	
        timeline = new Timer(1000, e -> {
            if (correct == 8) {
                timeline.stop();
                finishButt.setDisable(false);
                finishButt.setVisible(true);
            }
            secs++;
            if (secs == 60) {
                secs = 0;
                mins++;
            }
            
            if ( mins == 1) {
                
         	   timeline.stop();
              
               finishButt.setVisible(true);
                
               finishButt.setDisable(false);
   	   
         zeroZero.setDisable(true);
         oneZero.setDisable(true);
         twoZero.setDisable(true);
         threeZero.setDisable(true);
         zeroOne.setDisable(true);
         oneOne.setDisable(true);
         twoOne.setDisable(true);
         threeOne.setDisable(true);
         zeroTwo.setDisable(true);
         oneTwo.setDisable(true);
         twoTwo.setDisable(true);
         threeTwo.setDisable(true);
         zeroThree.setDisable(true);
         oneThree.setDisable(true);
         twoThree.setDisable(true);
         threeThree.setDisable(true);
        
         
         JOptionPane.showMessageDialog(null, "Se Acabo el tiempo");
         
         
         }
            
            
            
            tLabel.setText(String.format("%d:%02d", mins, secs));
        });
        timeline.start();
        pix = new Pix();
        images = pix.getImageViews();
        Collections.shuffle(images);
    }

    public static Pix getPix() {
        return pix;
    }

    public static int getWrong() {
        return wrong;
    }

    public static String getTime() {
        return time;
    }

    public void initialize() {
        zeroZero.setImage(images.get(0));
        oneZero.setImage(images.get(1));
        twoZero.setImage(images.get(2));
        threeZero.setImage(images.get(3));
        zeroOne.setImage(images.get(4));
        oneOne.setImage(images.get(5));
        twoOne.setImage(images.get(6));
        threeOne.setImage(images.get(7));
        zeroTwo.setImage(images.get(8));
        oneTwo.setImage(images.get(9));
        twoTwo.setImage(images.get(10));
        threeTwo.setImage(images.get(11));
        zeroThree.setImage(images.get(12));
        oneThree.setImage(images.get(13));
        twoThree.setImage(images.get(14));
        threeThree.setImage(images.get(15));
        
        zeroZero.setOpacity(INV);
        oneZero.setOpacity(INV);
        twoZero.setOpacity(INV);
        threeZero.setOpacity(INV);
        zeroOne.setOpacity(INV);
        oneOne.setOpacity(INV);
        twoOne.setOpacity(INV);
        threeOne.setOpacity(INV);
        zeroTwo.setOpacity(INV);
        oneTwo.setOpacity(INV);
        twoTwo.setOpacity(INV);
        threeTwo.setOpacity(INV);
        zeroThree.setOpacity(INV);
        oneThree.setOpacity(INV);
        twoThree.setOpacity(INV);
        threeThree.setOpacity(INV);
//        finishButt.setDisable(false);//fixme
        finishButt.setVisible(false);
    }
    private ArrayList<ImageView> futureCompare = new ArrayList<>();
    private ArrayList<ImageView> check2 = new ArrayList<>();
    
    public void reveal(MouseEvent m) {
//        System.out.println("method starts future comparable size "  + futureCompare.size());
//        System.out.println("method start check2 size " + check2.size());

        if (futureCompare.size() >= 2) {
//            System.out.println("greater than two so i must wait until the thingies are removed");
            return;
        }

        check2.add((ImageView) m.getSource());
        if (check2.size() == 2) {
            if (check2.get(0) == check2.get(1)) {
//                System.out.println("they are the same so i will remove one now");
                check2.remove(0);//todo
//                check2.remove(0);
                return;
            } else {
                check2.remove(0);
                check2.remove(0);
            }
        }

        futureCompare.add((ImageView) m.getSource());
        if(futureCompare.size()==2) {
            oof();
        }

        ImageView a = (ImageView) m.getSource();
        if(m.getSource()==zeroZero){
//            System.out.println("0,0");
            zeroZero.setOpacity(VIS);
            zeroZero.setDisable(true);
        }
        if(m.getSource()==oneZero){
//            System.out.println("1,0");
            oneZero.setOpacity(VIS);
            oneZero.setDisable(true);
        }
        if(m.getSource()==twoZero){
//            System.out.println("2,0");
            twoZero.setOpacity(VIS);
            twoZero.setDisable(true);
        }
        if(m.getSource()==threeZero){
//            System.out.println("3,0");
            threeZero.setOpacity(VIS);
            threeZero.setDisable(true);
        }
        if(m.getSource()==zeroOne){
//            System.out.println("0,1");
            zeroOne.setOpacity(VIS);
            zeroOne.setDisable(true);
        }
        if(m.getSource()==oneOne){
//            System.out.println("1,1");
            oneOne.setOpacity(VIS);
            oneOne.setDisable(true);
        }
        if(m.getSource()==twoOne){
//            System.out.println("2,1");
            twoOne.setOpacity(VIS);
            twoOne.setDisable(true);
        }
        if(m.getSource()==threeOne){
//            System.out.println("3,1");
            threeOne.setOpacity(VIS);
            threeOne.setDisable(true);
        }
        if(m.getSource()==zeroTwo){
//            System.out.println("0,2");
            zeroTwo.setOpacity(VIS);
            zeroTwo.setDisable(true);
        }
        if(m.getSource()==oneTwo){
//            System.out.println("1,2");
            oneTwo.setOpacity(VIS);
            oneTwo.setDisable(true);
        }
        if(m.getSource()==twoTwo){
//            System.out.println("2,2");
            twoTwo.setOpacity(VIS);
            twoTwo.setDisable(true);
        }
        if(m.getSource()==threeTwo){
//            System.out.println("3,2");
            threeTwo.setOpacity(VIS);
            threeTwo.setDisable(true);
        }
        if(m.getSource()==zeroThree){
//            System.out.println("0,3");
            zeroThree.setOpacity(VIS);
            zeroThree.setDisable(true);
        }
        if(m.getSource()==oneThree){
//            System.out.println("1,3");
            oneThree.setOpacity(VIS);
            oneThree.setDisable(true);
        }
        if(m.getSource()==twoThree){
//            System.out.println("2,3");
            twoThree.setOpacity(VIS);
            twoThree.setDisable(true);
        }if(m.getSource()==threeThree){
//            System.out.println("3,3");
            threeThree.setOpacity(VIS);
            threeThree.setDisable(true);
        }
        //fixme 12/8/19 makin sure same img doesnt get selected twice
        //fixme do this by making an arraylist of positions and if the same one is added twice dont let it!!!
        a.setDisable(false);


    }

    private Timer t,t2;

    public void oof() {
        ImageView one = futureCompare.get(0);
        ImageView two = futureCompare.get(1);
         t = new Timer(1000, e -> {
//            System.err.println("Check result : true ");
            one.setOpacity(VIS);
            one.setDisable(true);
            two.setOpacity(VIS);
            two.setDisable(true);
            futureCompare.remove(one);
            correct++;
//            System.out.println("correct " + correct);

            futureCompare.remove(two);
             if(!futureCompare.contains(two)){
                 t.stop();
//                 System.err.println("correct timer ended");
             }

        });
         t2 = new Timer(1000, e -> {
//            System.err.println("Check result : false");
            one.setOpacity(INV);
            two.setOpacity(INV);
            futureCompare.remove(one);
            futureCompare.remove(two);
            wrong++;
//             System.out.println("wrong: " + wrong);
             if(!futureCompare.contains(two)){
                 t2.stop();
//                 System.err.println("false timer ended");
             }
        });

        if(check(one.getImage(),two.getImage())){
            t.start();
        }else{
            t2.start();
        }
    }

    public void finish() throws IOException, JRException {
        timeline.stop();
//        System.err.println("done");
        Scene scene = zeroZero.getScene();
        Window window = scene.getWindow();
        Stage stage = (Stage)window;
        stage.centerOnScreen();
        stage.setTitle("Fin");
        time = tLabel.getText();
        
        Puntuacion puntuacion = new Puntuacion(getWrong(), time);
        PuntuacionProvider.setPuntuaciones(puntuacion);
        PuntuacionProvider.generarPdf();
        
        scene.setRoot(FXMLLoader.load(getClass().getResource("/fxml/Picture.fxml")));
    }


    public boolean check(Image i, Image j){
//        System.out.println("check method: " + i.equals(j));
        return i.equals(j);
    }


//    public ImageView zeroZero1;
//    public ImageView oneZero1;
//    public ImageView twoZero1;
//    public ImageView threeZero1;
//    public ImageView zeroOne1;
//    public ImageView oneOne1;
//    public ImageView twoOne1;
//    public ImageView threeOne1;

}
