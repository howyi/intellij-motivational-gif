import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.DialogBuilder;
import javax.swing.*;
import java.awt.*;

public class MotivateAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Icon icon = new ImageIcon(getClass().getResource("do-it.gif"));
        JLabel label = new JLabel("", icon, JLabel.CENTER);
        panel.add(label);

        DialogBuilder builder = new DialogBuilder(getEventProject(e));
        builder.setCenterPanel(panel);
        builder.setDimensionServiceKey("FrameSwitcherCloseProjects");
        builder.setTitle("Motivational GIF");
        builder.removeAllActions();
        builder.show();
    }
}
