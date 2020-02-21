/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.view;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import project.model.Disciplinas;
import javax.swing.JOptionPane;
import project.connection.ConectionSingleton;
import project.controller.CursosControle;
import project.model.Cursos;
import project.repository.DisciplinaDAO;
import project.repository.Tipo;

/**
 *
 * @author Yara
 */
public class CadastroDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDisciplina
     */
    Disciplinas disciplina = null;
    Cursos curso = null;
    Tipo persist;
    CursosControle cursoControle;
    List<Disciplinas> preRequisitos;
    DefaultListModel model;

    public CadastroDisciplina() {
        initComponents();
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         preRequisitos = new ArrayList<Disciplinas>();
         model = new DefaultListModel();
          jComboBoxPre.setModel((ComboBoxModel<String>) model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxHoraria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ementa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxPre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        biblio = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        IDdisciplina = new javax.swing.JTextField();
        buscarIDCurso = new javax.swing.JButton();
        IDcurso = new javax.swing.JTextField();
        buscarIDisciplina = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 220, -1));
        getContentPane().add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 220, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Onyx", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Disciplina");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("CargaHoraria:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 30));

        jComboBoxHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2.400 ", "3.600 ", "4.000 ", "7.200" }));
        jComboBoxHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorariaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 127, 30));

        ementa.setColumns(20);
        ementa.setRows(5);
        jScrollPane1.setViewportView(ementa);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 354, 44));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Ementa:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Pré - requisitos:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 30));

        jComboBoxPre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBoxPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 127, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Descrição:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        biblio.setColumns(20);
        biblio.setRows(5);
        jScrollPane2.setViewportView(biblio);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 354, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Bibliografia:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        voltar.setBackground(new java.awt.Color(255, 51, 0));
        voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.setBorderPainted(false);
        voltar.setFocusPainted(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel3.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 100, -1));

        salvar.setBackground(new java.awt.Color(51, 255, 51));
        salvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salvar.setText("Salvar");
        salvar.setBorderPainted(false);
        salvar.setFocusPainted(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        jPanel3.add(salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 100, -1));

        IDdisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDdisciplinaActionPerformed(evt);
            }
        });
        jPanel3.add(IDdisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 50, 30));

        buscarIDCurso.setText("buscar curso");
        buscarIDCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIDCursoActionPerformed(evt);
            }
        });
        jPanel3.add(buscarIDCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 90, 30));
        jPanel3.add(IDcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 60, 30));

        buscarIDisciplina.setText("BuscarDisciplina");
        buscarIDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIDisciplinaActionPerformed(evt);
            }
        });
        jPanel3.add(buscarIDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 80, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        persist = new Tipo(new DisciplinaDAO((ConectionSingleton.getEntity())));
        try {

            if (isInsert()) {

                disciplina = unir();
                persist.save(disciplina);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            } else {
                disciplina = persist.find(Integer.parseInt(IDdisciplina.getText()));
                atualizar(disciplina);
                persist.update(disciplina);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_salvarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
      
        SecretariaP f = new SecretariaP ();
         f.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jComboBoxHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorariaActionPerformed
        jComboBoxHoraria.addItem("2.400");
        jComboBoxHoraria.addItem("3.600");
        jComboBoxHoraria.addItem("4.000");
        jComboBoxHoraria.addItem("7.200");

    }//GEN-LAST:event_jComboBoxHorariaActionPerformed

    private void IDdisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDdisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDdisciplinaActionPerformed

    private void buscarIDCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIDCursoActionPerformed
        // TODO add your handling code here:
        ConsultarCurso f = new ConsultarCurso();
        f.setVisible(true);
    }//GEN-LAST:event_buscarIDCursoActionPerformed

    private void buscarIDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIDisciplinaActionPerformed
        // TODO add your handling code here:
        ConsultarDisciplina f = new ConsultarDisciplina();
        f.setVisible(true);
    }//GEN-LAST:event_buscarIDisciplinaActionPerformed
    public void addPreRequisito(Disciplinas disciplina) {
        preRequisitos.add(disciplina);

        model.addElement(disciplina.getId_disciplina() + "||" + disciplina.getDescricao());

    }

    public void addPreRequisito(Iterator<Disciplinas> disciplina) {
        Iterator<Disciplinas> iterator = disciplina;
        while (iterator.hasNext()) {
            Disciplinas aux = iterator.next();
            preRequisitos.add(aux);
            String temp = aux.getId_disciplina() + "||" + aux.getDescricao();
            model.addElement(temp);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDisciplina().setVisible(true);
            }
        });
    }

    public void dadosID(Cursos curso) {
        IDcurso.setText(curso.getId_curso().toString());
    }

    public boolean isInsert() {
        String id = IDdisciplina.getText();
        return id.isEmpty();
    }

    public void atualizar(Disciplinas disciplina) {

        disciplina.setDescricao(nome.getText());
        disciplina.setCargaHoraria(Integer.parseInt(jComboBoxHoraria.getSelectedItem().toString()));
        disciplina.setBibliografia(biblio.getText());
        disciplina.setEmenda(ementa.getText());
        for (Disciplinas e : preRequisitos) {
            disciplina.setDisciplinaPreRequisito(e);
        }
        disciplina.setId_curso(curso);

    }

    public Disciplinas unir() {
        String descricaoDisciplina = nome.getText();
        Integer cargaHoraria = Integer.parseInt(jComboBoxHoraria.getSelectedItem().toString());
        String bibliografia = biblio.getText();
        String emenda = ementa.getText();
        Disciplinas d = new Disciplinas(curso, emenda, cargaHoraria, descricaoDisciplina, bibliografia);
        persist = new Tipo(new DisciplinaDAO((ConectionSingleton.getEntity())));

        for (Disciplinas e : preRequisitos) {
            d.setDisciplinaPreRequisito(e);
        }
        //Integer cod_Curso = Integer.parseInt(jTextCadastroIdCurso.getText());
        return d;
    }

    public void dados(Disciplinas disciplina) {
        IDdisciplina.setText(disciplina.getId_disciplina().toString());
        nome.setText(disciplina.getDescricao());
        jComboBoxHoraria.setSelectedItem(disciplina.getCargaHoraria());
        biblio.setText(disciplina.getBibliografia());
        ementa.setText(disciplina.getEmenda());
        addPreRequisito(disciplina.getIterator());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDcurso;
    private javax.swing.JTextField IDdisciplina;
    private javax.swing.JTextArea biblio;
    private javax.swing.JButton buscarIDCurso;
    private javax.swing.JButton buscarIDisciplina;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextArea ementa;
    private javax.swing.JComboBox<String> jComboBoxHoraria;
    private javax.swing.JComboBox<String> jComboBoxPre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JButton salvar;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
