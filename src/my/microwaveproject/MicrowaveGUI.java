/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.microwaveproject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author K00243015
 */
public class MicrowaveGUI extends javax.swing.JFrame
{
    /**
     * Creates new form MicrowaveGUI
     */
    public MicrowaveGUI()
    {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rightPanel = new javax.swing.JPanel();
        timePanel = new javax.swing.JPanel();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        doorButton = new javax.swing.JButton();
        timeTextField = new javax.swing.JTextField();
        timerBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Microwave");
        setResizable(false);

        rightPanel.setLayout(new java.awt.BorderLayout());

        timePanel.setLayout(new java.awt.GridLayout(4, 3, 1, 1));

        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                oneButtonActionPerformed(evt);
            }
        });
        timePanel.add(oneButton);

        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                twoButtonActionPerformed(evt);
            }
        });
        timePanel.add(twoButton);

        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                threeButtonActionPerformed(evt);
            }
        });
        timePanel.add(threeButton);

        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fourButtonActionPerformed(evt);
            }
        });
        timePanel.add(fourButton);

        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fiveButtonActionPerformed(evt);
            }
        });
        timePanel.add(fiveButton);

        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sixButtonActionPerformed(evt);
            }
        });
        timePanel.add(sixButton);

        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sevenButtonActionPerformed(evt);
            }
        });
        timePanel.add(sevenButton);

        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eightButtonActionPerformed(evt);
            }
        });
        timePanel.add(eightButton);

        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nineButtonActionPerformed(evt);
            }
        });
        timePanel.add(nineButton);

        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                zeroButtonActionPerformed(evt);
            }
        });
        timePanel.add(zeroButton);

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                startButtonActionPerformed(evt);
            }
        });
        timePanel.add(startButton);

        stopButton.setText("Stop/Clear");
        stopButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                stopButtonActionPerformed(evt);
            }
        });
        timePanel.add(stopButton);

        rightPanel.add(timePanel, java.awt.BorderLayout.PAGE_END);

        doorButton.setText("Food To Be Placed Here");

        timeTextField.setEditable(false);
        timeTextField.setBackground(new java.awt.Color(255, 255, 255));
        timeTextField.setText("Enter Number Of Seconds");

        timerBar.setForeground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(doorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(timerBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timerBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_oneButtonActionPerformed
    {//GEN-HEADEREND:event_oneButtonActionPerformed
        time(1); //Pass value into time variable to display in GUI
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_twoButtonActionPerformed
    {//GEN-HEADEREND:event_twoButtonActionPerformed
        time(2);
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_threeButtonActionPerformed
    {//GEN-HEADEREND:event_threeButtonActionPerformed
        time(3);
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fourButtonActionPerformed
    {//GEN-HEADEREND:event_fourButtonActionPerformed
        time(4);
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fiveButtonActionPerformed
    {//GEN-HEADEREND:event_fiveButtonActionPerformed
        time(5);
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sixButtonActionPerformed
    {//GEN-HEADEREND:event_sixButtonActionPerformed
        time(6);
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sevenButtonActionPerformed
    {//GEN-HEADEREND:event_sevenButtonActionPerformed
        time(7);
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eightButtonActionPerformed
    {//GEN-HEADEREND:event_eightButtonActionPerformed
        time(8);
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nineButtonActionPerformed
    {//GEN-HEADEREND:event_nineButtonActionPerformed
        time(9);
    }//GEN-LAST:event_nineButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_zeroButtonActionPerformed
    {//GEN-HEADEREND:event_zeroButtonActionPerformed
        time(0);
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startButtonActionPerformed
    {//GEN-HEADEREND:event_startButtonActionPerformed
        //Do calculations & start timer
        numTime = Integer.parseInt(time);
        minute = numTime / 60;
        second = numTime % 60;
        timeTextField.setText(twoZeros.format(minute)+":"+twoZeros.format(second));
        timerBar.setMaximum(second);
        timerBar.setValue(second);
        t1.start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_stopButtonActionPerformed
    {//GEN-HEADEREND:event_stopButtonActionPerformed
        //Reset GUI
        t1.stop();
        timeTextField.setText("Enter Number Of Seconds");
        timerBar.setValue(0);
        time = "";
        doorButton.setIcon(null);
    }//GEN-LAST:event_stopButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MicrowaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MicrowaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MicrowaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MicrowaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MicrowaveGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doorButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JPanel timePanel;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JProgressBar timerBar;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
    
    //Custom Variable Declaration
    String time = "";
    int numTime, minute, second = 0;
    DecimalFormat twoZeros = new DecimalFormat("00");
    
    //Timer init - fire event every 1000 milliseconds
    Timer t1 = new Timer(1000, new ActionListener()
    {
        @Override //Needed if using method name actionPerformed
        public void actionPerformed(ActionEvent ae)
        {
            if (second > 0)
            {
                second -= 1;
            }
            else if (second == 0 && minute > 0)
            {
                minute -= 1;
                second += 59;
                timerBar.setMaximum(second); //Set progress bars max value to 59
            }
            if (minute == 0 && second == 0)
            {
                t1.stop();
                try //Display image when countdown is finished
                {
                    Image img = ImageIO.read(getClass().getResource("/images/kfc.jpg")); //Read in image as new object
                    doorButton.setIcon(new ImageIcon(img)); //Set image object as icon & display
                } catch (Exception ex) {System.out.println(ex);}
            }
            timeTextField.setText(twoZeros.format(minute)+":"+twoZeros.format(second)); //Format current GUI time to 00:00
            timerBar.setValue(second); //Update progress bars current fill level
        }
    });
    
    //Method to display time entered in GUI
    private void time(int t)
    {
        time += String.valueOf(t); 
        timeTextField.setText(time+"");
    }
}
