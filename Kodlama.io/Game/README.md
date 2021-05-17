# 4. GÜN - ÖDEV 3
- Bir oyun yazmak istiyoruz. Bu yazılım için backend kodlarını JAVA ile geliştirmeyi planlıyoruz. Yeni üye, satış ve kampanya yönetimi yapılması isteniyor. 
- Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule edildi. Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz. (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

- Oyun satışı yapılabilecek satış ortamını simule edildi.( Yapılan satışlar oyuncu ile ilişkilendirilmelidir )

- Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanları simule edildi.

- Satışlarda kampanya entegrasyonunu simule edildi.


![image](https://user-images.githubusercontent.com/54233566/118509549-cc62a300-b738-11eb-9c94-e36e5bbf839d.png)

## Output

```java
Sevda isimli kullanıcı başarıyla giriş yaptı.
Ayşe isimli kişinin doğrulaması yapıldı.
 
---------------------Bilgi güncelleme-----------------------------
Ayşe isimli kullanıcı başarıyla bilgilerini güncelledi.
 
-----------------------İndirim ekleme silme vs.---------------------------
Sisteme Yılbaşı indirimi isimli kampanya başarıyla eklendi.
Sistemden Yılbaşı indirimi isimli kampanya başarıyla silindi.
Sistemde bulunan Yılbaşı indirimi isimli kampanya değerleri başarıyla güncellendi.
 
------------------------Satış--------------------------
 Ayşe isimli kullanıcı Counter-Strike isimli oyunu Yılbaşı indirimi isimli kampanya ile yüzde 10 indirim oranıyla 85 TL fiyat?na aldı.

