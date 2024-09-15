import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class ConsonantCharts extends JFrame {
        JTextField InputField;
        JButton InfoButton;
        JTextArea Area;

        String[][] consonantChart = {
                        { "p", "bilabial", "Plosive", "Bilabial",
                                        "The closure is formed by bringing both lips together.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "b", "bilabial", "stop", "Bilabial",
                                        "The closure is formed by bringing both lips together.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "t", "alveolar", "Plosive", "Alveolar",
                                        "The closure is formed by raising the tongue to touch the alveolar ridge.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "ʈ", "Retrolex", "Plosive", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "ɖ", "Retroflex", "Plosive", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "c", "Palatal", "Plosive", "Palatal",
                                        "Palatals are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "ɟ", "Palatal", "Plosive", "Palatal",
                                        "Palatals are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "k", "velar", "Plosive", "Velar",
                                        "The closure is formed by raising the back of the tongue to the velum.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "g", "velar", "Plosive", "Velar",
                                        "The closure is formed by raising the back of the tongue to the velum.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "q", "Uvular", "Plosive", "Uvular",
                                        "Uvulars are consonants articulated with the back of the tongue against or near the uvula.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "G", "Uvular", "Plosive", "Uvular",
                                        "Uvulars are consonants articulated with the back of the tongue against or near the uvula.",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "ʔ", "Glottal", "Plosive", "Glottal",
                                        "A glottal consonant is a sound made using only the glottis",
                                        "A plosive, also known as an occlusive or simply a stop, is a pulmonic consonant in which the vocal tract is blocked so that all airflow ceases." },
                        { "m", "bilabial", "nasal", "Bilabial",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the lips are closed.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "ɱ", "bilabial", "nasal", "Bilabial",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the lips are closed.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "n", "alveolar", "nasal", "Alveolar",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the tongue is raised to the alveolar ridge.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "ɳ", "Retrolex", "Nasal", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "ɲ", "Palatal", "Nasal", "Palatal",
                                        "Palatals are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "ŋ", "velar", "nasal", "Velar",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the back of the tongue is raised to the velum.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "N", "Uvular", "Nasal", "Uvular",
                                        "Uvulars are consonants articulated with the back of the tongue against or near the uvula.",
                                        "A nasal, also called a nasal occlusive or nasal stop in contrast with an oral stop or nasalized consonant, is an occlusive consonant produced with a lowered velum" },
                        { "B", "Bilibial", "Trill", "Bilibial",
                                        "The closure is formed by bringing both lips together.",
                                        "A consonant sound made by vibrating an articulator, or hitting it against something else." },
                        { "r", "Alveolar", "Trill", "Alveolar",
                                        "The airflow is partially obstructed by bringing the tip of the tongue into contact with the alveolar ridge.",
                                        "A consonant sound made by vibrating an articulator, or hitting it against something else." },
                        { "R", "Uvular", "Trill", "Uvular",
                                        "Uvulars are consonants articulated with the back of the tongue against or near the uvula.",
                                        "A consonant sound made by vibrating an articulator, or hitting it against something else.",
                                        "Produced with a single contraction of the muscles so that the tongue makes very brief contact" },
                        { "ⱱ", "Labiodental", "Tap or Flap", "Labiodental",
                                        "The lower lip is brought into contact with the upper teeth, while the tongue approaches the upper teeth.",
                                        "Produced with a single contraction of the muscles so that the tongue makes very brief contact" },
                        { "ɾ", "Alveolar", "Tap or Flap", "Alveolar",
                                        "The tongue tip or blade briefly taps against the alveolar ridge.",
                                        "Produced with a single contraction of the muscles so that the tongue makes very brief contact" },
                        { "ɽ", "Retrolex", "Tap or Flap", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "Produced with a single contraction of the muscles so that the tongue makes very brief contact" },
                        { "ɸ", "Bilibial", "fricative", "Bilibial",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the lips are closed.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "β", "Bilibial", "fricative", "Bilibial",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the lips are closed.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "f", "Labiodental", "fricative", "Labiodental",
                                        "The airflow is partially obstructed by bringing the lower lip into contact with the upper teeth.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "v", "Labiodental", "fricative", "Labiodental",
                                        "The airflow is partially obstructed by bringing the lower lip into contact with the upper teeth.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "θ", "Dental", "fricative", "Dental",
                                        "The airflow is partially obstructed by bringing the tongue into contact with the upper teeth.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ð", "Dental", "fricative", "Dental",
                                        "The airflow is partially obstructed by bringing the tongue into contact with the upper teeth.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "s", "Alveolar", "fricative", "Alveolar",
                                        "The airflow is partially obstructed by bringing the tip of the tongue into contact with the alveolar ridge.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "z", "Alveolar", "fricative", "Alveolar",
                                        "The airflow is partially obstructed by bringing the tip of the tongue into contact with the alveolar ridge.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʃ", "Post-Alveolar", "fricative", "Post-alveolar",
                                        "The airflow is partially obstructed by bringing the tongue near the postalveolar region.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʒ", "Post-Alveolar", "fricative", "Post-alveolar",
                                        "The airflow is partially obstructed by bringing the tongue near the postalveolar region.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʂ", "Retroflex", "fricative", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʐ", "Retroflex", "fricative", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ç", "Palatal", "fricative", "Palatal",
                                        "Palatal are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʝ", "Palatal", "fricative", "Palatal",
                                        "Palatal are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "x", "velar", "fricative", "Velar",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the back of the tongue is raised to the velum.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ɣ", "velar", "fricative", "Velar",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the back of the tongue is raised to the velum.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "χ", "Uvular", "fricative", "Uvular",
                                        "Uvulars are consonants articulated with the back of the tongue against or near the uvula.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʁ", "Uvular", "fricative", "Uvular",
                                        "Uvulars are consonants articulated with the back of the tongue against or near the uvula.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ħ", "Pharyngeal", "fricative", "Pharyngeal",
                                        "A pharyngeal consonant is a consonant that is articulated primarily in the pharynx.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ʕ", "Pharyngeal", "fricative", "Pharyngeal",
                                        "A pharyngeal consonant is a consonant that is articulated primarily in the pharynx.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "h", "glottal", "fricative", "Glottal",
                                        "The airflow is partially obstructed by bringing the vocal folds together.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ɦ", "Glottal", "fricative", "Glottal",
                                        "The airflow is partially obstructed by bringing the vocal folds together.",
                                        "A fricative is a consonant sound created by forcing air through a narrow channel between two articulators, which partially blocks the airstream" },
                        { "ɬ", "Alveolar", "Lateral Fricative", "Alveolar",
                                        "The tongue tip or blade briefly taps against the alveolar ridge.",
                                        "Lateral fricative sounds are made when air from the lungs is directed around the contact between the tongue and the roof of the mouth" },
                        { "ɮ", "Alveolar", "Lateral Fricative", "Alveolar",
                                        "The tongue tip or blade briefly taps against the alveolar ridge.",
                                        "Lateral fricative sounds are made when air from the lungs is directed around the contact between the tongue and the roof of the mouth" },
                        { "ʋ", "Labiodental", "Approximant", "Labiodental",
                                        "The lower lip is brought into contact with the upper teeth, while the tongue approaches the upper teeth.",
                                        "They are made by bringing two parts of the mouth close together, but not close enough to block the air." },
                        { "ɹ", "Alveolar", "Approximant", "Alveolar",
                                        "The tongue is raised towards the alveolar ridge, but the airflow is not significantly obstructed.",
                                        "They are made by bringing two parts of the mouth close together, but not close enough to block the air." },
                        { "ɻ", "Retroflex", "Approximant", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "They are made by bringing two parts of the mouth close together, but not close enough to block the air." },
                        { "j", "Palatal", "approximant", "Palatal",
                                        "Palatal are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "They are made by bringing two parts of the mouth close together, but not close enough to block the air." },
                        { "ɰ", "Velar", "Approximant", "Velar",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the back of the tongue is raised to the velum.",
                                        "They are made by bringing two parts of the mouth close together, but not close enough to block the air." },
                        { "l", "Alveolar", "Lateral Approximant", "Alveolar",
                                        "The tongue tip or blade is raised towards the alveolar ridge, allowing the airflow over the sides of the tongue.",
                                        "a consonant whose articulation involves a central occlusion with an opening on one or both sides of the tongue that is not close enough to produce friction " },
                        { "ɭ", "Retroflex", "Lateral Approximant", "Retroflex",
                                        "The closure is formed where the tongue has a flat, concave, or even curled shape.",
                                        "a consonant whose articulation involves a central occlusion with an opening on one or both sides of the tongue that is not close enough to produce friction " },
                        { "ʎ", "Palatal", "Lateral Approximant", "Palatal",
                                        "Palatals are consonants articulated with the body of the tongue raised against the hard palate.",
                                        "a consonant whose articulation involves a central occlusion with an opening on one or both sides of the tongue that is not close enough to produce friction " },
                        { "L", "Velar", "Lateral Approximant", "Velar",
                                        "The soft palate is lowered, allowing air to pass through the nasal cavity while the back of the tongue is raised to the velum.",
                                        "a consonant whose articulation involves a central occlusion with an opening on one or both sides of the tongue that is not close enough to produce friction " }
        };

        public ConsonantCharts() {
                setTitle("Consonant Chart in International Phonetic Alphabet (IPA)");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new FlowLayout());

                JLabel ConsonantLabel = new JLabel(
                                "<html><b>Enter a consonant:</b></html>");
                InputField = new JTextField(5);
                InputField.setHorizontalAlignment(JTextField.CENTER);
                InfoButton = new JButton("Details");
                ConsonantLabel.setSize(100, 50);

                InfoButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                getConsonantInfo();
                        }
                });

                Area = new JTextArea(10, 50);
                Area.setLineWrap(true);
                Area.setWrapStyleWord(true);

                Border border = BorderFactory.createLineBorder(Color.BLACK);
                InputField.setBorder(border);
                Area.setEditable(false);

                Font boldFont = new Font("Arial", Font.BOLD, 17);
                Area.setFont(boldFont);

                add(ConsonantLabel);
                add(InputField);
                add(InfoButton);
                add(Area);

                setSize(800, 300);
                setLocationRelativeTo(null);
                setVisible(true);
        }

        private void getConsonantInfo() {
                StringBuilder Data = new StringBuilder();
                String userInput = InputField.getText();

                for (String[] consonant : consonantChart) {
                        if (consonant[0].equals(userInput)) {
                                Data.append("Consonant: ").append("/").append(consonant[0]).append("/").append("\n");
                                Data.append("Place of articulation: ").append(consonant[1]);
                                Data.append("\nManner of articulation: ").append(consonant[2]);
                                Data.append("\n").append(consonant[3]).append(": ").append(consonant[4]);
                                Data.append("\n").append(consonant[2]).append(": ").append(consonant[5]);
                                Area.setText(Data.toString());
                                return;
                        }
                }

                Area.setText("Invalid consonant input. Please enter a valid IPA consonant.");
        }

        public static void main(String[] args) {
                new ConsonantCharts();
        }
}
