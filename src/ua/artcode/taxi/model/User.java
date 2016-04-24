package ua.artcode.taxi.model;


public class User extends UserAbstract {

    private Order[] orders = new Order[4];
    private int ordersNum;

    public User(int id, String name, String phone, String pass) {
        setId(id);
        setName(name);
        setPhone(phone);
        setPass(pass);
    }

    public Order makeOrder(Address from, Address to){
        if (ordersNum < 4){
            return orders[ordersNum++] = new Order(from,to,this);
        }
        return null;
    }



    @Override
    public Order[] getCurrentOrder() {
        return orders;
    }
}
