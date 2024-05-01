import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RegistrationForm{
    Frame obj;
    Label name,regno,mobile;
    TextField nameF,regnoF,mobileF;
    Button submit;
    RegistrationForm()
    {
        obj=new Frame();
        name=new Label("Enter your name : ");
        regno=new Label("Enter your registered number : ");
        mobile=new Label("Enter your mobile no : ");
        nameF=new TextField();
        regnoF=new TextField();
        mobileF=new TextField();
        submit=new Button("Submit");
        obj.add(name);
        obj.add(nameF);
        obj.add(regno);
        obj.add(regnoF);
        obj.add(mobile);
        obj.add(mobileF);
        obj.add(submit);
        name.setBounds(300,100,200,40);
        regno.setBounds(300,200,200,40);
        mobile.setBounds(300,300,200,40);
        nameF.setBounds(550,100,200,40);
        regnoF.setBounds(550,200,200,40);
        mobileF.setBounds(550,300,200,40);
        submit.setBounds(425,450,85,85);
        obj.setSize(900,900);
        obj.setLayout(null);
        obj.setVisible(true);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                obj.dispose();
            }
        });
    }
    public static void main(String[] args) {
        RegistrationForm obj=new RegistrationForm();
    }
}
