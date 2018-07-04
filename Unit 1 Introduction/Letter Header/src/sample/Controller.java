package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    private @FXML
    TextArea letterBody;

    public void initialize()
    {
        letterBody.setText("Dear Mr. Grundy, \n\n" +
                "Thank you for your inquiry into App Solutions. We have the best solutions for your company." +
                " We can ");
    }
}
