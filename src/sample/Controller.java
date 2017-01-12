package sample;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    private Rectangle carre;

    @FXML
    public void moveRight(){
        carre.setX(carre.getX()+60);
    }

    public void moveLeft(){
        carre.setX(carre.getX()-60);
    }

    public void moveDown(){
        carre.setY(carre.getY()+60);
    }

    public void moveTop(){
        carre.setY(carre.getY()-60);
    }
}
