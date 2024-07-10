package InterfaceSegregation.before;

public class Bird implements Animal{//burada fly run ve bark özelliklerini farklı interfacelerde yapmadığımız için
    //kuş için bark özelliğide gelir fakat bu kuş için geçerli olmaz bu yüzden interfaceleri ayırmalıyız
    @Override
    public void fly() {

    }
    @Override
    public void run() {

    }
    @Override
    public void bark() {

    }
}
