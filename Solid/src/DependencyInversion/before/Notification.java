package DependencyInversion.before;

public class Notification {
    private Email email = new Email();
    private SMS sms = new SMS();

    public void sender() {

        email.sendEmail();
        sms.sendSMS();
    }
}
/*
* Çok kötü gözükmeyen sınıflarımız var olmasına rağmen dikkat etmemiz gereken önemli bir nokta daha var.
* Notification sınıfımız yüksek seviye bir sınıf olmasına rağmen daha düşük seviyeli olan
* Email ve SMS sınıflarına bağımlı halde. Sms ve Email sınıflarında yada metodlarındaki değişimler
* direkt olarak notification sınıfını da etkileyecektir. Yeni bir module eklendiğinde de notification
* sınıfımızda değişiklik yapmak zorunda kalacağız.
* Bu durumda Dependency Inversion prensibine aykırı hareket etmiş olduk.
* */
