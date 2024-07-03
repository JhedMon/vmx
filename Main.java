//LAB ACTIVITY 1
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {

    private JComboBox<String> combobox;
    private JComboBox<String> combobox1;

    public Main() {
        JFrame frame = new JFrame("Guess the Vivamax actress");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        
        combobox = new JComboBox<>(new String[]{""});
        combobox.setBounds(30, 100, 170, 30);
        combobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCombobox1((String) combobox.getSelectedItem());
            }
        });

        
        combobox1 = new JComboBox<>(new String[]{""});
        combobox1.setBounds(300, 100, 170, 30);

        
        String[] names = {"Angeli Khang", "Azi Acosta", "Christine Bermas", "AJ Raval", "Ataska", "Angela Morena", "Stephanie Raz", "Micaella Raz","Rose Van Ginkel","Arah Alonzo", "Robb Gunito", "Ayanna Misola", "Yen Durano",  "Aiko Garcia", "Angelica Hart", "Apple Dy", "Cess Garcia", "Armina Alegre", "Aila Cruz", "Aria Bench", "Audrey Avila","Ava Mendez","Cara Gonzales", "Rica Gonzales", "Denise Esteban", "Tiffany Grey", "Andrea Garcia","Zsara Laxamana", "Angeline Aril", "Cariz Manzano", "Chloe Jenna", "Angelica Cervantes", "Dyessa Garcia", "Sahara Bernales", "Jela Cuenca", "Jenn Rosa", "Salome Salvi", "Alexa Ocampo", "Zia Zamora", "Erika Balagtas", "Quinn Carrillo", "Hershie De Leon", "Vern Kaye", "Aica Veloso", "Candy Veloso","Julia Victoria", "Shiena Yu", "Christy Imperial"};
        for (String name : names) {
            combobox.addItem(name);
        }

        
        JButton resultButton = new JButton("Show");
        resultButton.setBounds(180, 200, 140, 30);
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSelectedItems();
            }
        });

        
        frame.add(combobox);
        frame.add(combobox1);
        frame.add(resultButton);

        
        frame.setVisible(true);
    }

    private void updateCombobox1(String selectedItem) {
        
        combobox1.removeAllItems();

        
        combobox1.addItem("");

        
        if (selectedItem != null && !selectedItem.isEmpty()) {
            switch (selectedItem) {
                case "Angeli Khang":
                    combobox1.addItem("VMX Queen");
                    combobox1.addItem("VMX K-Crush");
                    combobox1.addItem("VMX OG");
                    combobox1.addItem("VMX A-Lister");
                    break;
                case "Azi Acosta":
                    combobox1.addItem("VMX A-Lister");
                    combobox1.addItem("VMX Crush");
                    break;
                case "Christine Bermas":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX OG");
                    break;
                case "AJ Raval":
                    combobox1.addItem("VMX A-Lister");
                    combobox1.addItem("Former VMX Queen");
                    combobox1.addItem("VMX OG");
                    combobox1.addItem("VMX Goddess");
                    break;
                case "Angela Morena":
                    combobox1.addItem("VMX Heavenly Crush");
                    combobox1.addItem("VMX A-Lister");
                    combobox1.addItem("VMX OG");
                    combobox1.addItem("Eldest Raz Sister");
                    break;
                case "Stephanie Raz":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX OG");
                    combobox1.addItem("Middle Raz Sister");
                    break;
                case "Micaella Raz":
                    combobox1.addItem("VMX Fantasy Crush");
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Youngest Raz Sister");
                    break;
                case "Robb Gunito":
                    combobox1.addItem("VMX Crush");
                    break;
                case "Ayanna Misola":
                    combobox1.addItem("VMX A-Lister");
                    combobox1.addItem("VMX OG");
                    break;
                case "Yen Durano":
                    combobox1.addItem("VMX Crush");
                    break;
                case "Ataska":
                    combobox1.addItem("VMX Princess");
                    combobox1.addItem("VMX Crush");
                    break;
                case "Ava Mendez":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX OG");
                    break;
                case "Cara Gonzales":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX OG");
                    break;
                case "Rica Gonzales":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Newbie");
                    break;
                case "Denise Esteban":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Bella");
                    break;
                case "Aiko Garcia":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX A-Lister");
                    combobox1.addItem("Pretty Young Thing");
                    combobox1.addItem("Grand Winner of Pantaxa: Laiya");
                    break;
                case "Angelica Hart":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("The Hypebae");
                    combobox1.addItem("VMX Bisyo ng Bayan");
                    combobox1.addItem("Grand Winner of Pantaxa: Laiya");
                    break;
                case "Apple Dy":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Expensive and Forbidden Fruit");
                    combobox1.addItem("Pantaxa: Laiya Contestant");
                    break;
                case "Cess Garcia":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Mysterious Candy");
                    combobox1.addItem("Pantaxa: Laiya Contestant");
                    break;
                case "Armina Alegre":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Pure Girl Love");
                    combobox1.addItem("Pantaxa: Laiya Contestant");
                    break;
                case "Aila Cruz":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Southern Spice");
                    combobox1.addItem("Pantaxa: Laiya Contestant");
                    break;
                case "Aria Bench":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Funny Honey");
                    combobox1.addItem("Pantaxa: Laiya Contestant");
                    break;
                case "Audrey Avila":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("Rebel Chick");
                    combobox1.addItem("Pantaxa: Laiya Contestant");
                    break;
                case "Tiffany Grey":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("MMFF Best Actress Nominee");
                    break;
                case "Andrea Garcia":
                    combobox1.addItem("VMX Crush");
                    break;
                case "Cariz Manzano":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Newbie");
                    break;
                case "Angelica Cervantes":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Bella");
                    break;
                case "Dyessa Garcia":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Newbie");
                    break;
                case "Sahara Bernales":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Newbie");
                    break;
                    case "Julia Victoria":
                    combobox1.addItem("VMX Crush");
                    break;
                case "Jela Cuenca":
                    combobox1.addItem("VMX Crush");
                    break;
                    case "Chloe Jenna":
                        combobox1.addItem("VMX Crush");
                    break;
                case "Jenn Rosa":
                    combobox1.addItem("VMX Crush");
                    combobox1.addItem("VMX Newbie");
                    break;
                    case "Salome Salvi":
                        combobox1.addItem("VMX Sexpert");
                        combobox1.addItem("VMX Crush");
                    break;
                    case "Alexa Ocampo":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX A-Lister");
                    break;
                    case "Quinn Carrillo":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX Bella");
                    break;
                    case "Hershie De Leon":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX Bella");
                    break;
                    case "Vern Kaye":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX Newbie");
                    break;
                    case "Aica Veloso":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX OG");
                    break;
                    case "Candy Veloso":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX Newbie");
                    break;
                    case "Shiena Yu":
                        combobox1.addItem("VMX Crush");
                    break;
                    case "Zia Zamora":
                        combobox1.addItem("VMX Crush");
                    break;
                    case "Erika Balagtas":
                        combobox1.addItem("VMX Crush");
                    break;
                    case "Christy Imperial":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX Newbie");
                    break;
                    case "Zsara Laxamana":
                        combobox1.addItem("VMX Crush");
                    break;
                    case "Angeline Aril":
                        combobox1.addItem("VMX Crush");
                        combobox1.addItem("VMX Newbie");
                    break;
                    case "Rose Van Ginkel":
                        combobox1.addItem("VMX Crush");
                    break;
                    case "Arah Alonzo":
                        combobox1.addItem("VMX Crush");
                default:
                    break;
            }
        }
    }

    private void showSelectedItems() {
        String selectedName = (String) combobox.getSelectedItem();
        String selectedTitle = (String) combobox1.getSelectedItem();

        if (selectedName == null || selectedName.isEmpty() || selectedTitle == null || selectedTitle.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select name, title or both.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, selectedName + ", " + selectedTitle);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
