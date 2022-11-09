/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.BLL;

import java.util.List;
import moirottoiec.salesmanagement.DAL.StatisticsDAL;

/**
 *
 * @author Admin
 */
public class StatisticsBLL {
    private StatisticsDAL statisticsDAL;
    public List getRevenueByMouth(int month,int year){
        List results = null;
        statisticsDAL = new StatisticsDAL();
        results = statisticsDAL.getRevenueByMouth(month, year);
        return results;
    }
}
