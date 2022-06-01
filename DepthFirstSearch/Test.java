import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 * Aluno
 */
class Aluno {

    private String name;
    private int ra;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Aluno() {
    }

    public Aluno(String name, int ra) {
        this.name = name;
        this.ra = ra;
    }

}

/**
 * Test
 */
public class Test extends JFrame {

    // private Vector<Aluno> listAlunos;
    // private Vector<String> listHeaders;
    JTable table;

    public Test() {

        JButton b = new JButton("TEST");
        this.add(b);

        // String[][] data = {
        // { "Kundan Kumar Jha", "4031", "CSE" },
        // { "Anand Jha", "6014", "IT" }
        // };

        // Column Names
        // String[] columnNames = { "Name", "Roll Number", "Department" };

        List<String> header = new ArrayList<>();
        header.add("NAME");
        header.add("RA");

        String[] columnNames = new String[header.size()];
        for (int i = 0; i < header.size(); i++) {
            columnNames[i] = header.get(i);
        }

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("RAFAEL", 42069));
        alunos.add(new Aluno("MAT", 42069));

        String[][] data = new String[alunos.size()][header.size()];

        for (int i = 0; i < alunos.size(); i++) {
            for (int j = 0; j < header.size(); j++) {
                if (j == 0) {
                    data[i][j] = alunos.get(i).getName();
                } else {
                    data[i][j] = Integer.toString(alunos.get(i).getRa());
                }

            }
        }

        table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(table);
        this.add(sp);

        // listAlunos = new Vector<>();
        // listAlunos.add(new Aluno("Rafael", 696969));
        // listAlunos.add(new Aluno("Rafael 2", 42069));

        // listHeaders = new Vector<>();
        // listHeaders.add("Name");
        // listHeaders.add("Ra");

        // table = new JTable(listAlunos);

        // JScrollPane scrollPane = new JScrollPane(table);
        // this.add(scrollPane);

        this.setTitle("TEST FOR MATEUS");
        this.setSize(500, 200);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Test();
            }

        });
    }
}
