package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;

public class Controller {
    private @FXML WebView introScreen;
    private @FXML WebView lessonScreen;
    private @FXML WebView practiceScreen;
    private @FXML WebView projectScreen;
    private @FXML Button backButton;

    public void initialize()
    {
        WebEngine webEngine = introScreen.getEngine();
        URL urlIntro = getClass().getResource("Introduction.html");
        webEngine.load(urlIntro.toExternalForm());

        WebEngine webEngine2 = lessonScreen.getEngine();
        URL urlLesson = getClass().getResource("Lesson.html");
        webEngine2.load(urlLesson.toExternalForm());

        WebEngine webEngine3 = practiceScreen.getEngine();
        URL urlPractice = getClass().getResource("Practice.html");
        webEngine3.load(urlPractice.toExternalForm());

        WebEngine webEngine4 = projectScreen.getEngine();
        URL urlProject = getClass().getResource("Project.html");
        webEngine4.load(urlProject.toExternalForm());
    }

    public void back()
    {
        WebEngine webEngine2 = lessonScreen.getEngine();
        URL urlLesson = getClass().getResource("Lesson.html");
        webEngine2.load(urlLesson.toExternalForm());
    }
}
