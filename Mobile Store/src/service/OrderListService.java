package service;

import dao.OrderList;

import java.util.List;

public interface OrderListService {

    public List<OrderList> getAllOrderList();
    public OrderList getOrderByIdandAccount(int id, String account);
    public void insertOrder(OrderList orderList);
}
