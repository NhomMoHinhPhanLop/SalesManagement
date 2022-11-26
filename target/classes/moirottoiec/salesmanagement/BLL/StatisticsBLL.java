/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.BLL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import moirottoiec.salesmanagement.DAL.StatisticsDAL;
import moirottoiec.salesmanagement.Entity.Order;
import moirottoiec.salesmanagement.Entity.OrderDetail;

/**
 *
 * @author Admin
 */
public class StatisticsBLL {
    private StatisticsDAL statisticsDAL;
    public List getRevenueByMouth(int month,int year){
        List<Order> results = null;
        statisticsDAL = new StatisticsDAL();
        results = statisticsDAL.getRevenueByMouth(month, year);
        ArrayList<Order> data = new ArrayList<>();
        if(results.size()>0){
            data.add(results.get(0));
            int j=0;
            for(int i=1;i<results.size();i++){
                LocalDate currentDate1 = LocalDate.parse(results.get(i).getDate().toString());
                LocalDate currentDate2 = LocalDate.parse(results.get(i-1).getDate().toString());
                if (currentDate1.getDayOfMonth()==currentDate2.getDayOfMonth()) {
                    data.get(j).setTotal(data.get(j).getTotal()+results.get(i).getTotal());
                    }
                    else{
                        data.add(++j, results.get(i));
                        }
                    }
        }
        return data;
    }
        public List getRevenueByYear(int year){
        List<Order> results = null;
        statisticsDAL = new StatisticsDAL();
        results = statisticsDAL.getRevenueByYear(year);
        ArrayList<Order> data = new ArrayList<>();
        data.add(results.get(0));
        int j=0;
        for(int i=1;i<results.size();i++){
            LocalDate currentDate1 = LocalDate.parse(results.get(i).getDate().toString());
            LocalDate currentDate2 = LocalDate.parse(results.get(i-1).getDate().toString());
            if (currentDate1.getMonthValue()==currentDate2.getMonthValue()) {
                data.get(j).setTotal(data.get(j).getTotal()+results.get(i).getTotal());
                }
                else{
                    data.add(++j, results.get(i));
                }
            }
        return data;
    }
        public List ListSellingProducts(int month,int year){
            List<OrderDetail> results = null;
            statisticsDAL = new StatisticsDAL();
            results = statisticsDAL.ListSellingProducts(month, year);
            ArrayList<OrderDetail> data = new ArrayList<>();
            data.add(results.get(0));
            int j=0;
            for (int i = 1; i < results.size(); i++) {
                if(results.get(i-1).getVegetable().getVegetableID()==(results.get(i).getVegetable().getVegetableID())){
                    data.get(j).setQuantity(data.get(j).getQuantity()+results.get(i).getQuantity());
                    if(j>0){
                        if(data.get(j).getQuantity()>data.get(j-1).getQuantity()){
                        OrderDetail temDetail = data.get(j);
                        data.set(j, data.get(j-1));
                        data.set(j-1,temDetail);
                    }
                    }
                }
                else{
                    data.add(++j, results.get(i));
                }
            }
            return data;
        }
}
