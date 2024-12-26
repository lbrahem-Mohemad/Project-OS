
package loginandsignup;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;







public class OpeatingSystems extends javax.swing.JFrame {
     DefaultTableModel model;
//    private Object AlgorithmsList;
     
  
    public OpeatingSystems() {
        initComponents();
        NumberProcess.setText("1");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableData = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        StateProcces = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        QuantamTime = new javax.swing.JTextField();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CPUTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RunAlgorithm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AddProcessInTable = new javax.swing.JButton();
        AlgorithsList = new javax.swing.JComboBox<>();
        NumberProcess = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operating System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(153, 102, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 600));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        TableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.Process", "CPU.T", "Wait.T", "Turn.T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableData.setOpaque(false);
        TableData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableData);
        if (TableData.getColumnModel().getColumnCount() > 0) {
            TableData.getColumnModel().getColumn(0).setResizable(false);
            TableData.getColumnModel().getColumn(2).setResizable(false);
            TableData.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("State Of Proccses");

        StateProcces.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StateProcces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateProccesActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Quantam Time");

        QuantamTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        QuantamTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantamTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(QuantamTime, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(StateProcces, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RightLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StateProcces, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantamTime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(153, 102, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Algorithms");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("No.Process");

        CPUTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPUTime.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CPU Time");

        RunAlgorithm.setBackground(new java.awt.Color(102, 102, 255));
        RunAlgorithm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RunAlgorithm.setForeground(new java.awt.Color(255, 255, 255));
        RunAlgorithm.setText("Run Algorithm");
        RunAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunAlgorithmActionPerformed(evt);
            }
        });

        AddProcessInTable.setBackground(new java.awt.Color(102, 102, 255));
        AddProcessInTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddProcessInTable.setForeground(new java.awt.Color(255, 255, 255));
        AddProcessInTable.setText("Add Process");
        AddProcessInTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProcessInTableActionPerformed(evt);
            }
        });

        AlgorithsList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AlgorithsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Priority", "Round Robin" }));
        AlgorithsList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 150, 136)));
        AlgorithsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithsListActionPerformed(evt);
            }
        });

        NumberProcess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumberProcess.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LeftLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4))
                                .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LeftLayout.createSequentialGroup()
                                    .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(AlgorithsList, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RunAlgorithm, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(AddProcessInTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(AlgorithsList, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 520, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// FCFS
    private void RunAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunAlgorithmActionPerformed
        
        changeState("Running");
        int rowcount=model.getRowCount();
        int waitingtime[]= new int[rowcount];
        int Trunaroundtine [] = new int[rowcount];
        int Cputime[] = new int[rowcount];
        
        if (AlgorithsList.getSelectedItem().equals("FCFS")) {
           for (int i=0;i<rowcount;i++){
          Cputime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());//cpu time
      }
      waitingtime[0]=0;
      for (int i=1;i<rowcount;i++){
          waitingtime[i]=waitingtime[i-1]+Cputime[i-1];
      }
      for (int i=0;i<rowcount;i++){
          Trunaroundtine [i]=waitingtime[i]+Cputime[i];
      }
      SetWaitingAndTrunaroundtine(waitingtime,Trunaroundtine);
      ShowMessageAverageWT("FCFS");
        }
        
        // SJF 
        else if (AlgorithsList.getSelectedItem().equals("SJF")) {
           java.util.List<Object[]> tableData = new ArrayList<>();

    // **استخراج البيانات من الجدول**
    for (int i = 0; i < rowcount; i++) {
        Object[] row = new Object[4];
        row[0] = model.getValueAt(i, 0); // ID
        row[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // Burst Time
        row[2] = 0; // Waiting Time (تعيين مبدئيًا بـ 0)
        row[3] = 0; // Turnaround Time (تعيين مبدئيًا بـ 0)
        tableData.add(row);
    }
    
  // Sort Based on Cpu Time
   tableData.sort((a,b) -> Integer.compare((int) a[1], (int)b[1]));
    
    //     Operation 


   int CurrentTime = 0;
    for(int i=0; i<rowcount; i++){
        Object[] row = tableData.get(i);
       int CpuTime = (int) row[1];
       row[2] = CurrentTime ;
       row[3] = (int)row[2] + CpuTime;
       CurrentTime += CpuTime;
    }
    
    
    
    SeaderTableData(tableData);
        ShowMessageAverageWT("SJF"); 
        }
        
        
        else if (AlgorithsList.getSelectedItem().equals("Priority")) {
            model.addColumn("Priority Schaduling");
            
         for (int i = 0; i < rowcount; i++) {
        String PriorityInput = JOptionPane.showInputDialog(this, 
            "Input Priority Schaduling for process " + (i + 1) + ":", 
            "Priority Schaduling Input", 
            JOptionPane.QUESTION_MESSAGE);
         model.setValueAt(PriorityInput, i, 4);
        
        } 
         
              // **استخراج بيانات الجدول**
    java.util.List<Object[]> tableData = new ArrayList<>();
    for (int i = 0; i < rowcount; i++) {
        Object[] row = new Object[5];
        row[0] = model.getValueAt(i, 0); // ID 
        row[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // Burst Time
        row[2] = 0; // Waiting Time
        row[3] = 0; // Turnaround Time
        row[4] = Integer.parseInt(model.getValueAt(i, 4).toString()); // Quantum Time
        tableData.add(row);
    }
         
             // **ترتيب العمليات حسب Quantum Time**
    tableData.sort((a, b) -> Integer.compare((int) a[4], (int) b[4]));  
            
          
    // opertions 
    
      int currentTime = 0; // الوقت الحالي
    for (int i = 0; i < rowcount; i++) {
        Object[] row = tableData.get(i);

        // حساب Waiting Time
        int burstTime = (int) row[1];
        row[2] = currentTime; // Waiting Time = الوقت الحالي قبل بدء العملية

        // حساب Turnaround Time
        row[3] = (int) row[2] + burstTime; // Turnaround Time = Waiting Time + Burst Time

        // تحديث الوقت الحالي
        currentTime += burstTime;
    }
    
     SeaderTableData(tableData);
     ShowMessageAverageWT("Priority");
        } 
    
    // RR 
    else if (AlgorithsList.getSelectedItem().equals("Round Robin")) {
         
        rowcount = model.getRowCount();
         
         // **الحصول على Quantum Time مرة واحدة فقط**
    String quantumInput = JOptionPane.showInputDialog(this, 
        "Input Quantum Time for all processes:", 
        "Input Quantum Time", 
        JOptionPane.QUESTION_MESSAGE);
           
      QuantamTime.setText(quantumInput);
       int QuantamTime = Integer.parseInt(quantumInput);
     
            List<Object[]> tableData = new ArrayList<>();
       int [] backupcputime = new int[rowcount]; // نسخه احتياطيه ليcpu  
       
    for (int i = 0; i < rowcount; i++) {
        Object[] row = new Object[4];
        row[0] = model.getValueAt(i, 0); // ID
        row[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // Burst Time
       backupcputime[i] = Integer.parseInt(model.getValueAt(i, 1).toString()); // Cpu time of process 
        row[2] = 0; // Waiting Time
        row[3] = 0; // Turnaround Time
        tableData.add(row);
    }
    
    // operation 
    // // **تنفيذ خوارزمية Round Robin**
      int currentTime = 0;
    boolean allProcesses;
    do {
        allProcesses = true;
        
       for (Object[] process : tableData) {
            int CPUtime = (int) process[1]; // based on Burst Time

            if (CPUtime > 0) {
                allProcesses = false;

                if (CPUtime > QuantamTime) {
                    currentTime += QuantamTime;
                    
                    process[1] = (int) process[1]  - QuantamTime; // تحديث Remaining Time
                } 
                else {
                    currentTime += CPUtime;
                    process[1] = 0; // العملية انتهت
                    process[3] = currentTime; // Turnaround Time
                    process[2] = (int) process[3] - backupcputime[tableData.indexOf( process)] ; // Waiting Time
                }
            }
        } 
    }  while (!allProcesses);   
        
        // **إعادة تعبئة الجدول بالقيم المحسوبة**
    for (int i = 0; i < rowcount; i++) {
        Object[] process = tableData.get(i);
        model.setValueAt(process[0], i, 0); // ID
        model.setValueAt( backupcputime[i], i, 1); // Burst Time
        model.setValueAt((int) process[2], i, 2); // Waiting Time
        model.setValueAt((int) process[3], i, 3); // Turnaround Time
       
    
    
    }
     ShowMessageAverageWT("Round Robin");
        
    }  
  
    

   
    
    
    
        
        
        
        
   
    
             
            
    
        
        
        
        
        
        
        
        
        
        
      

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
      

      
      
      
    
    }//GEN-LAST:event_RunAlgorithmActionPerformed

    private void AddProcessInTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProcessInTableActionPerformed
        model = (DefaultTableModel) TableData.getModel();
       
       if ( CPUTime.getText().isEmpty()  || CPUTime.getText() == "0" ){
          JOptionPane.showMessageDialog(this, "CPU time is not correct", "error", JOptionPane.ERROR_MESSAGE);
       } else {
           
        Add_To_Table();
       ClearCPUTime();
        IncreamentNumberProcess();
        changeState("Wating");
       }
        

    }//GEN-LAST:event_AddProcessInTableActionPerformed

    private void AlgorithsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithsListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgorithsListActionPerformed

    private void QuantamTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantamTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantamTimeActionPerformed

    private void StateProccesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateProccesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateProccesActionPerformed
 
     
     private void changeState(String state ){
         StateProcces.setText(state);
     }
     private void SeaderTableData(java.util.List<Object[]> tableData){
         for (int i=0 ; i< tableData.size(); i++){
                    Object[] row = tableData.get(i);
                    model.setValueAt(row[0], i, 0);
                    model.setValueAt(row[1], i, 1);
                    model.setValueAt(row[2], i, 2);
                    model.setValueAt(row[3], i, 3);
                    if(model.getColumnCount() == 5){
                        model.setValueAt(row[4],i, 4);
                    }
      
                }
  
     }
     
     
     
      private void Add_To_Table(){
    model.addRow(new Object[]{"P"+ NumberProcess.getText(),CPUTime.getText(),0,0});
}

private void  ClearCPUTime(){
    CPUTime.setText("");
}
private void IncreamentNumberProcess(){
  int number = Integer.parseInt(NumberProcess.getText()) ;
  number++;
  NumberProcess.setText(number+"");
}
private void SetWaitingAndTrunaroundtine(int waitingtime[],int Trunaroundtine [] ){
    for (int i=0;i<model.getRowCount();i++){
        model.setValueAt(waitingtime[i], i, 2);
        model.setValueAt(Trunaroundtine [i], i, 3);
    }
}
    private void ShowMessageAverageWT(String Algorithm){
      double totalewaiting =0;
      double totaleTrunaround =0;
        for (int i=0;i<model.getRowCount();i++){
           totalewaiting += Integer.parseInt(model.getValueAt(i, 2).toString());
           totaleTrunaround += Integer.parseInt(model.getValueAt(i, 3).toString());
           
        }
        totalewaiting /= model.getRowCount();
         totaleTrunaround /= model.getRowCount();
         JOptionPane.showMessageDialog(this,
                 "in "+Algorithm+" \n Average wating time: " +totalewaiting+"\n Average Trunaround time: " + totaleTrunaround
                 ,"Result"
                 ,JOptionPane.INFORMATION_MESSAGE );
         

    }
    


    
    
 
//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProcessInTable;
    private javax.swing.JComboBox<String> AlgorithsList;
    private javax.swing.JTextField CPUTime;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField NumberProcess;
    private javax.swing.JTextField QuantamTime;
    private javax.swing.JPanel Right;
    private javax.swing.JButton RunAlgorithm;
    private javax.swing.JTextField StateProcces;
    private javax.swing.JTable TableData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
