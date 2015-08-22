
package calculatorapp;





public class CalculatorApp extends javax.swing.JFrame {

   private double total1=0.0;
   private double total2=0.0;
   private double total3=0.0;
   private char math_operator;
   private double fact=1.0;
  private String str;
    public CalculatorApp() {
        
          initComponents();
       
          
          
        
         b1.setToolTipText("This is  (1) buttom");
         b2.setToolTipText("This is  (2) buttom");
         b3.setToolTipText("This is  (3) buttom");
         b4.setToolTipText("This is  (4) buttom");
         b5.setToolTipText("This is  (5) buttom");
         b6.setToolTipText("This is  (6) buttom");
         b7.setToolTipText("This is  (7) buttom");
         b8.setToolTipText("This is  (8) buttom");
         b9.setToolTipText("This is  (9) buttom");
         b0.setToolTipText("This is  (0) buttom");
         add.setToolTipText("This is (+) buttom");
         sub.setToolTipText("This is  (-) buttom");
         mul.setToolTipText("This is  (x) buttom");
         div.setToolTipText("This is  (/) buttom");
         CE.setToolTipText("This is  Cancel buttom");
         sin.setToolTipText("This is  sin() buttom");
         cos.setToolTipText("This is  cos() buttom");
         tan.setToolTipText("This is  tan() buttom");
         pow.setToolTipText("This is  (x)2 buttom");
          equals.setToolTipText("This is  (=) buttom");
          log.setToolTipText("This is (log) buttom");
          fac.setToolTipText("This is (!) buttom");
          Sqrt.setToolTipText("This is (Root) buttom");
          XpowY.setToolTipText("This is (x^y) buttom");
        }
    private void getOperator(String btnText)
    {
    math_operator= btnText.charAt(0);
    if(btnText.charAt(0)=='s')
    { 
       total1=total1+Double.parseDouble(display.getText());
       display.setText("Sin"+"("+total1+")");
     
    }
else  if(btnText.charAt(0)=='c')
    { 
       
     total1=total1+Double.parseDouble(display.getText());
    display.setText("Cos"+"("+total1+")");}
else  if(btnText.charAt(0)=='t')
    { 
        total1=total1+Double.parseDouble(display.getText());
    display.setText("tan"+"("+total1+")");}
else  if(btnText.charAt(0)=='x')
    { 
        
       total1=total1+Double.parseDouble(display.getText());
    display.setText("("+total1+")"+"2");}
else  if(btnText.charAt(0)=='l')
    { 
        
        total1=total1+Double.parseDouble(display.getText());
    display.setText("Log"+"("+total1+")");}
else  if(btnText.charAt(0)=='X')
    { 
        total2=0.0;
        total1 = total1 + Double.parseDouble( display.getText( ) ) ;
   display.setText("");
    }
else  if(btnText.charAt(0)=='S')
    { 
         total1=total1+Double.parseDouble(display.getText());
    display.setText("Sqrt"+"("+total1+")");
       }
else  if(btnText.charAt(0)=='n')
    { 
        
        total3=total3+Double.parseDouble(display.getText());
        display.setText(total3+"!");
       factorial(total3);
      
    }
else 
        
    {
        total1 = total1 + Double.parseDouble( display.getText( ) ) ;
   display.setText("");}
   
     
    }
    private void factorial(double total)
    {
     int   total4=(int)total;
    for(int i=total4;i>=1;i--)
    {
     double  j=(int)i;
    fact=fact*j;
    }
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        div = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        Sqrt = new javax.swing.JButton();
        XpowY = new javax.swing.JButton();
        fac = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar5.add(jMenu1);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar6.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar6.add(jMenu11);

        jMenu12.setText("jMenu12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setToolTipText("");
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusable(false);

        display.setBackground(new java.awt.Color(204, 255, 255));
        display.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 204));
        b1.setForeground(new java.awt.Color(0, 0, 255));
        b1.setText("1");
        b1.setToolTipText("");
        b1.setFocusCycleRoot(true);
        b1.setFocusable(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 204));
        b2.setForeground(new java.awt.Color(0, 0, 255));
        b2.setText("2");
        b2.setToolTipText("");
        b2.setFocusCycleRoot(true);
        b2.setFocusable(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 204));
        b3.setForeground(new java.awt.Color(0, 0, 255));
        b3.setText("3");
        b3.setToolTipText("");
        b3.setFocusCycleRoot(true);
        b3.setFocusable(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 255, 204));
        add.setForeground(new java.awt.Color(0, 0, 255));
        add.setText("+");
        add.setToolTipText("");
        add.setFocusCycleRoot(true);
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 204));
        b4.setForeground(new java.awt.Color(0, 0, 255));
        b4.setText("4");
        b4.setToolTipText("");
        b4.setFocusCycleRoot(true);
        b4.setFocusable(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 204));
        b5.setForeground(new java.awt.Color(0, 0, 255));
        b5.setText("5");
        b5.setToolTipText("");
        b5.setFocusCycleRoot(true);
        b5.setFocusable(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 204));
        b6.setForeground(new java.awt.Color(0, 0, 255));
        b6.setText("6");
        b6.setToolTipText("");
        b6.setFocusCycleRoot(true);
        b6.setFocusable(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        sub.setBackground(new java.awt.Color(255, 255, 204));
        sub.setForeground(new java.awt.Color(0, 0, 255));
        sub.setText("-");
        sub.setToolTipText("");
        sub.setFocusCycleRoot(true);
        sub.setFocusable(false);
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 204));
        b7.setForeground(new java.awt.Color(0, 0, 255));
        b7.setText("7");
        b7.setToolTipText("");
        b7.setFocusCycleRoot(true);
        b7.setFocusable(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 204));
        b8.setForeground(new java.awt.Color(0, 0, 255));
        b8.setText("8");
        b8.setToolTipText("");
        b8.setFocusCycleRoot(true);
        b8.setFocusable(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 204));
        b9.setForeground(new java.awt.Color(0, 0, 255));
        b9.setText("9");
        b9.setToolTipText("");
        b9.setFocusCycleRoot(true);
        b9.setFocusable(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        mul.setBackground(new java.awt.Color(255, 255, 204));
        mul.setForeground(new java.awt.Color(0, 0, 255));
        mul.setText("*");
        mul.setToolTipText("");
        mul.setFocusCycleRoot(true);
        mul.setFocusable(false);
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        CE.setBackground(new java.awt.Color(255, 255, 204));
        CE.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        CE.setForeground(new java.awt.Color(0, 0, 255));
        CE.setText("C");
        CE.setToolTipText("");
        CE.setFocusCycleRoot(true);
        CE.setFocusable(false);
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(255, 255, 204));
        b0.setForeground(new java.awt.Color(0, 0, 255));
        b0.setText("0");
        b0.setToolTipText("");
        b0.setFocusCycleRoot(true);
        b0.setFocusable(false);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(255, 255, 204));
        equals.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        equals.setForeground(new java.awt.Color(0, 0, 255));
        equals.setText("=");
        equals.setToolTipText("");
        equals.setFocusCycleRoot(true);
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(255, 255, 204));
        div.setForeground(new java.awt.Color(0, 0, 255));
        div.setText("/");
        div.setToolTipText("");
        div.setFocusCycleRoot(true);
        div.setFocusable(false);
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(255, 255, 204));
        sin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sin.setForeground(new java.awt.Color(51, 51, 255));
        sin.setText("sin");
        sin.setToolTipText("");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(255, 255, 204));
        cos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        cos.setForeground(new java.awt.Color(0, 0, 255));
        cos.setText("cos");
        cos.setToolTipText("");
        cos.setFocusCycleRoot(true);
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(255, 255, 204));
        tan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        tan.setForeground(new java.awt.Color(0, 0, 255));
        tan.setText("tan");
        tan.setToolTipText("");
        tan.setFocusCycleRoot(true);
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        pow.setBackground(new java.awt.Color(255, 255, 204));
        pow.setForeground(new java.awt.Color(0, 0, 255));
        pow.setText("x²");
        pow.setToolTipText("");
        pow.setFocusCycleRoot(true);
        pow.setFocusable(false);
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(255, 255, 204));
        log.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        log.setForeground(new java.awt.Color(0, 0, 255));
        log.setText("log");
        log.setToolTipText("");
        log.setFocusCycleRoot(true);
        log.setFocusable(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        Sqrt.setBackground(new java.awt.Color(255, 255, 204));
        Sqrt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Sqrt.setForeground(new java.awt.Color(0, 0, 255));
        Sqrt.setText("√");
        Sqrt.setToolTipText("");
        Sqrt.setFocusCycleRoot(true);
        Sqrt.setFocusable(false);
        Sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrtActionPerformed(evt);
            }
        });

        XpowY.setBackground(new java.awt.Color(255, 255, 204));
        XpowY.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        XpowY.setForeground(new java.awt.Color(0, 0, 255));
        XpowY.setText("X^Y");
        XpowY.setToolTipText("");
        XpowY.setFocusCycleRoot(true);
        XpowY.setFocusable(false);
        XpowY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XpowYActionPerformed(evt);
            }
        });

        fac.setBackground(new java.awt.Color(255, 255, 204));
        fac.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        fac.setForeground(new java.awt.Color(0, 0, 255));
        fac.setText("n!");
        fac.setToolTipText("");
        fac.setFocusCycleRoot(true);
        fac.setFocusable(false);
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(pic)
                            .addGap(142, 142, 142))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(XpowY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(log, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CE, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(b9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(b6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sin)
                    .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(XpowY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    
         String btn6Text = display.getText() + b4.getText();
        display.setText(btn6Text);
    }//GEN-LAST:event_b4ActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
       
        
    }//GEN-LAST:event_displayActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     
        String btnOneText = display.getText() + b1.getText();
        
        display.setText(btnOneText);
       
       
    
      
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
     
        
        String btntwoText = display.getText() + b2.getText();
        display.setText(btntwoText);
        
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         String btnthreeText = display.getText() + b3.getText();
        display.setText(btnthreeText);
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
 
         String btn5Text = display.getText() + b5.getText();
        display.setText(btn5Text);

    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
      
         String btn6Text = display.getText() + b6.getText();
        display.setText(btn6Text);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
      
         String btn7Text = display.getText() + b7.getText();
        display.setText(btn7Text);
       
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
 String btn8Text = display.getText() + b8.getText();
        display.setText(btn8Text);}
         //display.setText(b8.getText());    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       
         String btn9Text = display.getText() + b9.getText();
        display.setText(btn9Text);
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
 String btn0Text = display.getText() + b0.getText();
        display.setText(btn0Text);        
    }//GEN-LAST:event_b0ActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
    total2=0;     
        display.setText("");   
    }//GEN-LAST:event_CEActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
      switch ( math_operator ) {
        case '+':
            total2 = total1 + Double.parseDouble(display.getText( ) );
        break;
        case '-':
            total2 = total1 - Double.parseDouble(display.getText( ) );
        break;
        case '/':
            total2 = total1 / Double.parseDouble(display.getText( ) );
        break;
        case '*':
            
            total2 = total1*Double.parseDouble(display.getText( ) );
           
        break;
        case 's':
          
            total2=java.lang.Math.sin(total1*(Math.PI/180.0));
            
            break;
              case 'c':
            total2=java.lang.Math.cos(total1*Math.PI/180.0);
            break;
                    case 't':
            total2=java.lang.Math.tan(total1*Math.PI/180.0);
            break;
                         case 'x':
                          total2=java.lang.Math.pow(total1,2);
            break;
            case 'l':
                          total2=java.lang.Math.log(total1);
            break;
                case 'S':
                          total2=java.lang.Math.sqrt(total1);
            break;
                     case 'X':
                          total2=total2+Double.parseDouble(display.getText( ));
                         
                          total2=java.lang.Math.pow(total1, total2);
                          
                          
                          
                          
            break;
                         case 'n':
                          total2=fact;
                          total3=0;
                          fact=1;
                         
            break;
        }
        
      
        display.setText( Double.toString(total2) );
        total1 = 0;
        
    
    }//GEN-LAST:event_equalsActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       String button_text = add.getText();
        getOperator(button_text);
        
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
       
         String button_text = sub.getText();
        getOperator(button_text);
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
       
         String button_text = mul.getText();
        getOperator(button_text);
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
       
         String button_text = div.getText();
        getOperator(button_text);
    }//GEN-LAST:event_divActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
         
         String sinText =sin.getText();
       
        getOperator(sinText);
       
        
         
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        String cosText =cos.getText();
         
        getOperator(cosText); 
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
       String tanText =tan.getText();
         
        getOperator(tanText); 
    }//GEN-LAST:event_tanActionPerformed

    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed
       String powbtn=pow.getText();
      
       getOperator(powbtn); 
       
       
    }//GEN-LAST:event_powActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
       String logbtn=log.getText();
       
       getOperator(logbtn); 
    }//GEN-LAST:event_logActionPerformed

    private void SqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrtActionPerformed
       String Sqrtbtn=Sqrt.getText();
      
       getOperator(Sqrtbtn); 
    }//GEN-LAST:event_SqrtActionPerformed

    private void XpowYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XpowYActionPerformed
        
      
       String XpowYbtn=XpowY.getText();
       getOperator(XpowYbtn);
    }//GEN-LAST:event_XpowYActionPerformed

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed
      
      
        String fbtn=fac.getText();
      
       getOperator(fbtn);
    }//GEN-LAST:event_facActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CE;
    private javax.swing.JButton Sqrt;
    private javax.swing.JButton XpowY;
    private javax.swing.JButton add;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton cos;
    private javax.swing.JTextField display;
    private javax.swing.JButton div;
    private javax.swing.JButton equals;
    private javax.swing.JButton fac;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log;
    private javax.swing.JButton mul;
    private javax.swing.JLabel pic;
    private javax.swing.JButton pow;
    private javax.swing.JButton sin;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables



    
}
