package domain;

import dao.OrderList;

import java.util.List;

public interface OrderListDao {
    public List<OrderList>getAllOrderList();
    public OrderList getOrderByIdandAccount(int id, String account);
    public void insertOrder(OrderList orderList);
}
