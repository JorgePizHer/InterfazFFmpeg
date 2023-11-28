package ffmpeg;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FFmpeg extends javax.swing.JFrame {
 
    // Variables declaration                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration
    
    public FFmpeg() {
        initComponents();
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Textos por defecto
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Indica la ruta del ejecutable");

        jTextField1.setText("D://ffmpeg//ffmpeg//bin//ffmpeg.exe");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Indica el archivo de entrada");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 2, 12));
        jTextField2.setText("Ej: D://codificar//original.avi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Indica el archivo de salida");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 2, 12));
        jTextField3.setText("Ej: D://codificar//destino");

        jLabel4.setText("Cambiar formato");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "avi", "mp4", "mkv" }));
        jButton1.setText("¡Vamos allá!");
        
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        
        jLabel5.setText("Cambia la velocidad con la barra");
        jSlider1.setMaximum(4);
        jSlider1.setMinimum(1/4);
        jSlider1.setValue(3);
        jSlider1.setMinorTickSpacing(1/4);
        jSlider1.setMajorTickSpacing(1/4);
        jLabel6.setText("x" + (double)jSlider1.getValue()/2);
        jButton2.setText("Más rápido");
        
        jLabel7.setText("Opciones de audio");
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Extraer audio", "Eliminar audio"}));
        jButton3.setText("Extraer");
        
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        
        jLabel8.setText("Convertir a GIF");
        jLabel9.setText("⮃");
        jButton4.setText("¡Hazlo!");
        
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);  
        
        //Listeners
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
         
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        
        //Maquetación
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jButton1)))
                                .addGap(31, 31, 31)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton2)))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)))
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel9)))))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton1)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1))
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addContainerGap())))
        );

        pack();
    }
    
    //Métodos de los escuchadores
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String programa = jTextField1.getText();
        String entrada = jTextField2.getText();
        String salida = jTextField3.getText();
        String formato = jComboBox1.getSelectedItem().toString();
        String comando = programa + " -i " + entrada + " " + salida + "." + formato;
        try {
            ProcessBuilder proceso = new ProcessBuilder("cmd.exe","/c",comando);
            Process miproceso = proceso.start();
            System.out.println("OK");
        }catch(Exception e){
        e.printStackTrace();
        
        }
    }
    
    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
       
        jLabel6.setText("x" + (double)jSlider1.getValue()/2);
        
        if (jSlider1.getValue()/2 < 1){
            jButton2.setText("Más lento"); 
        }else {
           jButton2.setText("Más rápido");
     }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
          
        String programa = jTextField1.getText();
        String entrada = jTextField2.getText();
        String salida = jTextField3.getText();
        String formato = jComboBox1.getSelectedItem().toString();
        double velocidadVideo = 0;
        double velocidadAudio = 0;       
       
        try{
        
        if (jSlider1.getValue()/2 == 0){
        velocidadVideo = 2.0;
        velocidadAudio=0.5;
        String comando = programa + " -i " + entrada + " -vf" + " \"setpts=" + velocidadVideo + "*PTS\"" 
                + " -filter:a \"atempo=" + velocidadAudio + "\"" + " " + salida + "." + formato;
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe","/c",comando);
        Process miproceso = proceso.start();
        }else if (jSlider1.getValue()/2 >0 && jSlider1.getValue()/2 <2){
        velocidadVideo = 0.75;
        velocidadAudio = 1.5;
        String comando = programa + " -i " + entrada + " -vf" + " \"setpts=" + velocidadVideo + "*PTS\"" 
                + " -filter:a \"atempo=" + velocidadAudio + "\"" + " " + salida + "." + formato;
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe","/c",comando);
        Process miproceso = proceso.start();
        
        }else if (jSlider1.getValue()/2 == 2){
        velocidadVideo = 0.5;
        velocidadAudio = 2;   
        String comando = programa + " -i " + entrada + " -vf" + " \"setpts=" + velocidadVideo + "*PTS\"" 
                + " -filter:a \"atempo=" + velocidadAudio + "\"" + " " + salida + "." + formato;
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe","/c",comando);
        Process miproceso = proceso.start();
        
        }
        
        }catch (Exception e){
        e.printStackTrace();
        
        }
        
    }
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jComboBox2.getSelectedIndex()==0){
            jButton3.setText("Extraer");
        }else 
           jButton3.setText("Eliminar");
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
        
        String programa = jTextField1.getText();
        String entrada = jTextField2.getText();
        String salida = jTextField3.getText();
        String formato = jComboBox1.getSelectedItem().toString();
        String comandoExtraer = programa + " -i " + entrada + " -vn" + " -acodec" + " mp3" + " " + salida + ".mp3";
        String comandoEliminar = programa + " -i " + entrada + " -map 0 -map -0:a -c copy" + " " + salida + "." + formato;
        
        try{
        ProcessBuilder proceso1 = new ProcessBuilder("cmd.exe","/c",comandoExtraer);
        ProcessBuilder proceso2 = new ProcessBuilder("cmd.exe","/c",comandoEliminar);
            if (jComboBox2.getSelectedIndex()==0)
            {
                Process miproceso1 = proceso1.start();
                System.out.println("OK");
                
            }else{
                Process miproceso2 = proceso2.start();
                System.out.println("OK");
                
            }
            
        }catch (Exception e){
            e.printStackTrace();
            
        }
        
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String programa = jTextField1.getText();
        String entrada = jTextField2.getText();
        String salida = jTextField3.getText();
        String formato = jComboBox1.getSelectedItem().toString();
        String comando = programa + " -i " + entrada + " " + salida + ".gif";
        try {
            ProcessBuilder proceso = new ProcessBuilder("cmd.exe","/c",comando);
            Process miproceso = proceso.start();
            System.out.println("OK");
        }catch(Exception e){
        e.printStackTrace();
        
        }
    }
    
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFmpeg().setVisible(true);
            }
        });             
    }
    
}
//D:\>ffmpeg\ffmpeg\bin\ffmpeg.exe -i D:\codificar\original.avi D:\codificar\destino.mp4