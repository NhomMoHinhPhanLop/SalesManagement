/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package moirottoiec.salesmanagement.GUI;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import moirottoiec.salesmanagement.BLL.StatisticsBLL;
import moirottoiec.salesmanagement.Entity.Order;
import moirottoiec.salesmanagement.Entity.OrderDetail;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class StatisticsGUI extends javax.swing.JPanel {

    /**
     * Creates new form StatisticsGUI
     */
    private ChartPanel chartPanel;
    public StatisticsGUI() {
        initComponents();
        InitializationComboBox();
        chartPanel = new ChartPanel(createChart("year"));
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.validate();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        monthCB1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        yearCB1 = new javax.swing.JComboBox<>();
        btn_filter_pd = new javax.swing.JButton();
        scrolltable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        limit = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        monthCB = new javax.swing.JComboBox<>();
        yearCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_filter_month = new javax.swing.JButton();
        btn_filter_year = new javax.swing.JButton();

        jLabel5.setText(" Selling Products");

        jLabel6.setText("Month");

        jLabel7.setText("Year");

        btn_filter_pd.setText("Filter");
        btn_filter_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filter_pdActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrolltable.setViewportView(table);

        limit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "25", "30" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(scrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_filter_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(limit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monthCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(yearCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(limit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_filter_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/salesmanagement/GUI/img/analysis.png"))); // NOI18N
        jLabel1.setText("Statistics MANAGEMENT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Statistics Revenue");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Month");

        jLabel3.setText("Year");

        btn_filter_month.setText("Filter By Month");
        btn_filter_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filter_monthActionPerformed(evt);
            }
        });

        btn_filter_year.setText("Filter By Year");
        btn_filter_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filter_yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_filter_month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_filter_year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_filter_month))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_filter_year))
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel4)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addContainerGap(357, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_filter_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filter_yearActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        chartPanel = new ChartPanel(createChart("year"));
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.validate();
    }//GEN-LAST:event_btn_filter_yearActionPerformed

    private void btn_filter_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filter_monthActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        chartPanel = new ChartPanel(createChart("month"));
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.validate();
    }//GEN-LAST:event_btn_filter_monthActionPerformed

    private void btn_filter_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filter_pdActionPerformed
        // TODO add your handling code here:
        loadTable();        
    }//GEN-LAST:event_btn_filter_pdActionPerformed
    public void InitializationComboBox(){
        java.util.Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        for(int i=1;i<13;i++){
            monthCB.addItem(Integer.toString(i));
            monthCB1.addItem(Integer.toString(i));
        }
        for(int i=year;i>=2010;i--){
            yearCB.addItem(Integer.toString(i));
            yearCB1.addItem(Integer.toString(i));
        }
        monthCB.setSelectedItem(Integer.toString(month+1));
        yearCB.setSelectedItem(Integer.toString(year));
        monthCB1.setSelectedItem(Integer.toString(month+1));
        yearCB1.setSelectedItem(Integer.toString(year));        
    }
    public JFreeChart createChart(String type) {
        JFreeChart barChart;
        switch (type) {
            case "year":
                    barChart = ChartFactory.createBarChart(
                    "Th???ng k?? doanh thu theo n??m "+yearCB.getSelectedItem().toString(),
                    "Th??ng", "VND",
                    createDataset(type), PlotOrientation.VERTICAL, 
                    false, false, false);
                break;
            case "month":
                    barChart = ChartFactory.createBarChart(
                    "Th???ng k?? doanh thu theo th??ng "+monthCB.getSelectedItem().toString()
                            +" n??m "+yearCB.getSelectedItem().toString(),
                    "Ng??y", "VND",
                    createDataset(type), PlotOrientation.VERTICAL, 
                    false, false, false);
                break;
            default:
                throw new AssertionError();
        }
        return barChart;
    }
        private CategoryDataset createDataset(String type) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            StatisticsBLL statisticsBLL = new StatisticsBLL();
            List<Order> results=null;
            int year = Integer. parseInt(yearCB.getSelectedItem().toString());
            int month = Integer. parseInt(monthCB.getSelectedItem().toString());
            int j=0;
            switch (type) {
                case "year":
                    results = statisticsBLL.getRevenueByYear(year);
                    if(results.size()>0){
                       for(int i = 0;i<results.size();i++){
                           LocalDate currentDate = LocalDate.parse(results.get(i).getDate().toString());
                           dataset.addValue(results.get(i).getTotal(), "VND", 
                                   Integer.toString(currentDate.getMonthValue()));

                       }
                    }
                    
                    break;

                case "month":
                    results = statisticsBLL.getRevenueByMouth(month, year);
                    if(results.size()>0){
                       for(int i = 0;i<results.size();i++){
                           LocalDate currentDate = LocalDate.parse(results.get(i).getDate().toString());
                           dataset.addValue(results.get(i).getTotal(), "VND", 
                                   Integer.toString(currentDate.getDayOfMonth()));

                       }
                    }
                    break;
                default:
                    throw new AssertionError();
        }
        return dataset;
    }
      private void loadTable(){
          StatisticsBLL statisticsBLL = new StatisticsBLL();
          DefaultTableModel model = new DefaultTableModel();
          table.setModel(model);
          model.addColumn("Number");
          model.addColumn("Vegetable");
          model.addColumn("Quantity");
          model.addColumn("Total");
          int year = Integer. parseInt(yearCB1.getSelectedItem().toString());
          int month = Integer. parseInt(monthCB1.getSelectedItem().toString());
          int limit = Integer. parseInt(this.limit.getSelectedItem().toString());
          List results = statisticsBLL.ListSellingProducts(month, year);
          if (results !=null) {
            int i=1;
            for (Iterator iterator = results.iterator(); iterator.hasNext();) {
                OrderDetail detail = (OrderDetail) iterator.next();
                model.addRow(new Object[] {
                    i++,
                    detail.getVegetable().getVegetableName(),
                    detail.getQuantity(),
                    detail.getPrice()*detail.getQuantity()

                });
                if(i==limit)
                    break;
            }             
          }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_filter_month;
    private javax.swing.JButton btn_filter_pd;
    private javax.swing.JButton btn_filter_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> limit;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JComboBox<String> monthCB1;
    private javax.swing.JScrollPane scrolltable;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> yearCB;
    private javax.swing.JComboBox<String> yearCB1;
    // End of variables declaration//GEN-END:variables
}
