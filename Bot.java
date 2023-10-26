import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot  extends JFrame {
    private JTextArea ChatArea = new JTextArea();
    private JTextField ChatBox = new JTextField();
    public Bot(){
        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setTitle("Chat Bot");
        frame.add(ChatArea);
        frame.add(ChatBox);
        //For text Area
        ChatArea.setSize(500,400);
        ChatArea.setLocation(2,2);
        //Textfield
        ChatBox.setSize(540,30);
        ChatBox.setLocation(2,500);

        ChatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gtext = ChatBox.getText().toLowerCase();
                ChatArea.append("You ->" + gtext + " \n");
                ChatBox.setText("");

                if(gtext.contains("hi")){
                bot("hola");

                } else{
                    int rand = (int) (Math.random()*3+1);
                    if(rand == 1){
                    bot("I don't understand");
                } else if(rand == 2){
                        bot("Sorry, i dont understand!");
                    }else if(rand == 3){
                        bot("I don't understand you");
                    }

                    }
            }
        });


    }
    private void bot(String string){
        ChatArea.append("Bot ->" + string + "\n");
    }
    public static void main(String args[]){
    new Bot();
    }
}
