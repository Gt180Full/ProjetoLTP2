package TelaPrincipal;

import Ajuda.JInternalFrame_Sobre;
import Pessoa.*;
import Relatório.JInternalFrame_RelatorioMensal;
import Turma.*;


public class TelaPrincipal extends javax.swing.JFrame {

    private final JInternalFrame_InserirPessoa internalFrame_InserirPessoa;
    private final JInternalFrame_AlterarPessoa internalFrame_AlterarPessoa;
    private final JInternalFrame_RemoverPessoa internalFrame_RemoverPessoa;
    private final JInternalFrame_VisualizarPessoa internalFrame_VisualizarPessoa;
    
    private final JInternalFrame_RelatorioMensal internalFrame_RelatorioMensal;
    
    private final JInternalFrame_Sobre internalFrame_Sobre;
    
    private final JInternalFrame_InserirTurma internalFrame_InserirTurma;
    private final JInternalFrame_AlterarTurma internalFrame_AlterarTurma;
    private final JInternalFrame_RemoverTurma internalFrame_RemoverTurma;   
    private final JInternalFrame_VisualizarTurma internalFrame_VisualizarTurma; 
    
    public TelaPrincipal() {
        initComponents();
        
        internalFrame_InserirPessoa = new JInternalFrame_InserirPessoa();
        internalFrame_AlterarPessoa = new JInternalFrame_AlterarPessoa();
        internalFrame_RemoverPessoa = new JInternalFrame_RemoverPessoa();
        internalFrame_VisualizarPessoa = new JInternalFrame_VisualizarPessoa();
    
        internalFrame_RelatorioMensal = new JInternalFrame_RelatorioMensal();
        
        internalFrame_Sobre = new JInternalFrame_Sobre();
    
        internalFrame_InserirTurma = new JInternalFrame_InserirTurma();
        internalFrame_AlterarTurma = new JInternalFrame_AlterarTurma();
        internalFrame_RemoverTurma = new JInternalFrame_RemoverTurma();
        internalFrame_VisualizarTurma = new JInternalFrame_VisualizarTurma();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuFerramentas = new javax.swing.JMenuBar();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuPessoaInserir = new javax.swing.JMenuItem();
        jMenuPessoaAlterar = new javax.swing.JMenuItem();
        jMenuPessoaRemover = new javax.swing.JMenuItem();
        jMenuPessoaVisualizar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuTurmas = new javax.swing.JMenu();
        jMenuTurmasInserir = new javax.swing.JMenuItem();
        jMenuTurmasAlterar = new javax.swing.JMenuItem();
        jMenuTurmasRemover = new javax.swing.JMenuItem();
        jMenuTurmasVisualizar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenu_RelatorioMensal = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jMenuAlunos.setText("Pessoa");

        jMenuPessoaInserir.setText("Inserir");
        jMenuPessoaInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPessoaInserirActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuPessoaInserir);

        jMenuPessoaAlterar.setText("Alterar");
        jMenuPessoaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPessoaAlterarActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuPessoaAlterar);

        jMenuPessoaRemover.setText("Remover");
        jMenuPessoaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPessoaRemoverActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuPessoaRemover);

        jMenuPessoaVisualizar.setText("Visualizar");
        jMenuPessoaVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPessoaVisualizarActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuPessoaVisualizar);
        jMenuAlunos.add(jSeparator1);

        jMenuFerramentas.add(jMenuAlunos);

        jMenuTurmas.setText("Turmas");

        jMenuTurmasInserir.setText("Inserir");
        jMenuTurmasInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTurmasInserirActionPerformed(evt);
            }
        });
        jMenuTurmas.add(jMenuTurmasInserir);

        jMenuTurmasAlterar.setText("Alterar");
        jMenuTurmasAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTurmasAlterarActionPerformed(evt);
            }
        });
        jMenuTurmas.add(jMenuTurmasAlterar);

        jMenuTurmasRemover.setText("Remover");
        jMenuTurmasRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTurmasRemoverActionPerformed(evt);
            }
        });
        jMenuTurmas.add(jMenuTurmasRemover);

        jMenuTurmasVisualizar.setText("Visualizar");
        jMenuTurmasVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTurmasVisualizarActionPerformed(evt);
            }
        });
        jMenuTurmas.add(jMenuTurmasVisualizar);
        jMenuTurmas.add(jSeparator2);

        jMenuFerramentas.add(jMenuTurmas);

        jMenu1.setText("Relatório Finaceiro");

        jMenu_RelatorioMensal.setText("Reçatório Mensal");
        jMenu_RelatorioMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_RelatorioMensalActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_RelatorioMensal);

        jMenuFerramentas.add(jMenu1);

        jMenuAjuda.setText("Ajuda");

        jMenuAjudaSobre.setText("Sobre");
        jMenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjudaSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuAjudaSobre);

        jMenuFerramentas.add(jMenuAjuda);

        setJMenuBar(jMenuFerramentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPessoaInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPessoaInserirActionPerformed
        
        //necessário para limpar o item Inserir Pessoa do destop(caso haja, "limpar o cache") -- mfernandes
        desktop.remove(internalFrame_InserirPessoa);
        desktop.add(internalFrame_InserirPessoa);
        internalFrame_InserirPessoa.setVisible(true);
        
    }//GEN-LAST:event_jMenuPessoaInserirActionPerformed

    private void jMenuPessoaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPessoaAlterarActionPerformed
        
        desktop.remove(internalFrame_AlterarPessoa);
        desktop.add(internalFrame_AlterarPessoa);
        internalFrame_AlterarPessoa.setVisible(true);
    }//GEN-LAST:event_jMenuPessoaAlterarActionPerformed

    private void jMenuPessoaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPessoaRemoverActionPerformed
        
        desktop.remove(internalFrame_AlterarPessoa);
        desktop.add(internalFrame_RemoverPessoa);
        internalFrame_RemoverPessoa.setVisible(true);
    }//GEN-LAST:event_jMenuPessoaRemoverActionPerformed

    private void jMenuPessoaVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPessoaVisualizarActionPerformed
        
        desktop.remove(internalFrame_VisualizarPessoa);
        desktop.add(internalFrame_VisualizarPessoa);
        internalFrame_VisualizarPessoa.setVisible(true);
    }//GEN-LAST:event_jMenuPessoaVisualizarActionPerformed

    private void jMenuTurmasInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTurmasInserirActionPerformed
        
        desktop.remove(internalFrame_InserirTurma);
        desktop.add(internalFrame_InserirTurma);
        internalFrame_InserirTurma.setVisible(true);
    }//GEN-LAST:event_jMenuTurmasInserirActionPerformed

    private void jMenuTurmasAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTurmasAlterarActionPerformed
        
        desktop.remove(internalFrame_AlterarTurma);
        desktop.add(internalFrame_AlterarTurma);
        internalFrame_AlterarTurma.setVisible(true);
    }//GEN-LAST:event_jMenuTurmasAlterarActionPerformed

    private void jMenuTurmasRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTurmasRemoverActionPerformed
        
        desktop.remove(internalFrame_RemoverTurma);
        desktop.add(internalFrame_RemoverTurma);
        internalFrame_RemoverTurma.setVisible(true);
    }//GEN-LAST:event_jMenuTurmasRemoverActionPerformed

    private void jMenuTurmasVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTurmasVisualizarActionPerformed
        
        desktop.remove(internalFrame_VisualizarTurma);
        desktop.add(internalFrame_VisualizarTurma);
        internalFrame_VisualizarTurma.setVisible(true);
    }//GEN-LAST:event_jMenuTurmasVisualizarActionPerformed

    private void jMenu_RelatorioMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_RelatorioMensalActionPerformed
        
        desktop.remove(internalFrame_RelatorioMensal);
        desktop.add(internalFrame_RelatorioMensal);
        internalFrame_RelatorioMensal.setVisible(true);
    }//GEN-LAST:event_jMenu_RelatorioMensalActionPerformed

    private void jMenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaSobreActionPerformed
        
        desktop.remove(internalFrame_Sobre);
        desktop.add(internalFrame_Sobre);
        internalFrame_Sobre.setVisible(true);
    }//GEN-LAST:event_jMenuAjudaSobreActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jMenuAjudaSobre;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuFerramentas;
    private javax.swing.JMenuItem jMenuPessoaAlterar;
    private javax.swing.JMenuItem jMenuPessoaInserir;
    private javax.swing.JMenuItem jMenuPessoaRemover;
    private javax.swing.JMenuItem jMenuPessoaVisualizar;
    private javax.swing.JMenu jMenuTurmas;
    private javax.swing.JMenuItem jMenuTurmasAlterar;
    private javax.swing.JMenuItem jMenuTurmasInserir;
    private javax.swing.JMenuItem jMenuTurmasRemover;
    private javax.swing.JMenuItem jMenuTurmasVisualizar;
    private javax.swing.JMenuItem jMenu_RelatorioMensal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
