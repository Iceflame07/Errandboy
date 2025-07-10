package walkingcompiler.utils;
import walkingcompiler.data.models.*;

public class ExceptionMapper {

    public static Items ItemNotfoundException(Items items){
        Items i = new Items();
        i.setItemName(items.getItemName());
        i.setItemCategory(items.getItemCategory());
        i.setItemDescription(items.getItemDescription());
        i.setItemUnits(items.getItemUnits());
        i.setItemPrice(items.getItemPrice());
        return i;
    }

    public static Product ProductNotfoundException(Product product){
        Product p = new Product();
        p.setCategory(product.getCategory());
        p.setDescription(product.getDescription());
        p.setPrice(product.getPrice());
        return p;
    }

    public static Order ItemsOutOfStock(Order items){
            return new Order(
                    items.getOrderId(),
                    items.getCustomerName(),
                    items.getCustomerContact(),
                    items.getOrderDate(),
                    items.getOrderTime(),
                    items.getOrderStatus(),
                    items.getBankName(),
                    items.getAccountNumber(),
                    items.getAccountType(),
                    items.getCardType(),
                    items.getCustomerAddress(),
                    items.getCustomerAddress(),
                    items.getCardNumber()
            );
    }

    public static Rider RiderNotfoundException(Rider rider){
        Rider r = new Rider();
        r.setRiderId(rider.getRiderId());
        r.setPassword(String.valueOf(rider.getPassword().hashCode()));
        r.setContact(rider.getContact());
        r.setFirstName(rider.getFirstName());
        r.setLastName(rider.getLastName());
        r.setPlateNumber(rider.getPlateNumber());
        r.setBankName(rider.getBankName());
        return r;
    }

    public static User UserNotfoundException(User user){
        User u = new User();
        u.setUserId(user.getUserId());
        u.setFirstName(user.getFirstName());
        u.setLastName(user.getLastName());
        u.setContact(user.getContact());
        u.setEmail(user.getEmail());
        u.setUsername(user.getUsername());
        u.setPassword(String.valueOf(user.getPassword().hashCode()));
        return u;
    }

    public static Vendor VendorNotfoundException(Vendor vendor){
        Vendor v = new Vendor();
        v.setVendorId(vendor.getVendorId());
        v.setVendorAddress(vendor.getVendorAddress());
        v.setVendorName(vendor.getVendorName());
        v.setVendorContact(vendor.getVendorContact());
        v.setVendorPassword(String.valueOf(vendor.getVendorPassword().hashCode()));
        v.setVendorStoreName(vendor.getVendorStoreName());
        v.setVendorStoreNumber(vendor.getVendorStoreNumber());
        return v;
    }

    public static Card CardNotfoundException(Card card){
        Card c = new Card();
        c.setVisaCard(card.getVisaCard());
        c.setMasterCard(card.getMasterCard());
        c.setCardLength(card.getCardLength());
        return c;
    }

    public static Cart CartNotfoundException(Cart cart){
        Cart c = new Cart();
        c.setCartId(cart.getCartId());
        return c;
    }
}
