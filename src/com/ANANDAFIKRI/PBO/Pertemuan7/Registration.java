package com.ANANDAFIKRI.PBO.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Registration extends JFrame {
    private JTextField TxtName;
    private JTextField TxtNIM;
    private JComboBox CBProdi;
    private JTextField TxtTelp;
    private JTextArea TxtAreaAlamat;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel mainPanel;
    private JLabel BGJenisKelamin;
    private ButtonGroup JK;

    public Registration() {

        super("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtName.setText("");
                TxtNIM.setText("");
                TxtTelp.setText("");
                TxtAreaAlamat.setText("");
                CBProdi.setSelectedIndex(0);
                lakiLakiRadioButton.setSelected(false);
                perempuanRadioButton.setSelected(false);
                JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = TxtName.getText();
                String NIM = TxtNIM.getText();
                String alamat = TxtAreaAlamat.getText();
                String prodi = (String) CBProdi.getSelectedItem();
                String telp = TxtTelp.getText();
                String JK;

                if (lakiLakiRadioButton.isSelected()) {
                    JK = "Laki-Laki";
                } else if (perempuanRadioButton.isSelected()) {
                    JK = "Perempuan";
                } else {
                    JK = "Tidak diketahui!";
                }

                // menampilkan msgbox
                JOptionPane.showMessageDialog
                        (null, "Data berhasil disimpan!");
            }
        });
        mainPanel.addComponentListener(new ComponentAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}