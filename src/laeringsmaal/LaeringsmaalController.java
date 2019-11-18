import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Emner;
import model.Sporgsmaal;


public class LaeringsmaalController {

    private int emneCounter = 0;
    private int qCounter = 0;
    Emner emner = new Emner();
    Sporgsmaal q = new Sporgsmaal();
    private int qAntal = q.getAlleSporgsmaal().size();
    private int emneAntal = emner.getEmner().length;

    @FXML
    TextField emneTextField;

    @FXML
    TextArea spoergsmaalTextArea;

    @FXML
    private void indlaes() {
        if (emneCounter >=0 || emneCounter <= emneAntal){
        System.out.println(emner.getEmne(emneCounter));
        emneTextField.setText(emner.getEmne(emneCounter));
        if (qCounter >=0|| qCounter < qAntal) {
            spoergsmaalTextArea.setText(q.getSporgsmaal(qCounter) + "\n");
        }
        }
    }

    @FXML
    private void naeste() {
        if (qCounter < qAntal -1){
        emneCounter++;
        qCounter++;
        System.out.println(emneCounter);
            System.out.println(qCounter);
        indlaes();}

    }

    @FXML
    private void forrige() {
        if (emneCounter >0 && qCounter >0){
        emneCounter--;
        qCounter--;
        indlaes();}
        System.out.println(emneCounter);
        System.out.println(qCounter);
    }
    @FXML
    private void gem(){
        System.out.println(emneCounter + "," + qCounter);
        emner.setEmne(emneCounter,emneTextField.getText());
        q.setSporgsmaal(qCounter,spoergsmaalTextArea.getText());
    }

}
