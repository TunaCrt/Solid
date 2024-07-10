package SingleResponsibility;

import SingleResponsibility.before.User;

public class AddressService {
    public void changeAddress(Address address) {
        // Sadece addressle ilgileniyorum ve ondan sorumluyum userdaki değişiklikler beni etkilemez.
        //logic
    }
}
