package service.Imp;

import domain.Imp.OrderListDaoImp;
import domain.OrderListDao;
import dao.OrderList;
import service.OrderListService;

import java.util.List;

public class OrderListServiceImp implements OrderListService {
    private OrderListDao dao=new OrderListDaoImp();

    @Override
    public List<OrderList> getAllOrderList() {
        return dao.getAllOrderList();
    }
    public OrderList getOrderByIdandAccount(int id,String account){
        return dao.getOrderByIdandAccount(id,account);
    }

    @Override
    public void insertOrder(OrderList orderList) {
        dao.insertOrder(orderList);
    }
}
