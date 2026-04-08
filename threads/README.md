## Multithreading ve Multiasking
- Multitasking: Bilgisayarýn birçok process'i (iþlem) ayný anda çalýþtýrmasýdýr. 
  - Örneðin : hem Web Browser'ý çalýþtýtýrken 'ayný zamanda' Spotify'ý çalýþtýrmasý gibi
- Multithreading: Bir process içinde birçok thread oluþturup birçok iþi bir arada yapmaktýr
  - Örneðin : Word'de yazý yazarken ayný anda Word içinde yazdýklarýmýzýn word içindeki baþka bir thread tarafýndan kontrol edilmesi.

--- 

## Process ve Thread Kavramlarý
- Process : Bilgisayarda çalýþabilecek her türlü uygulamamýzdýr. Spotify, Windows Media Player, Google Chrome
     Her process bellekte kendi memory space'ine sahiptir.
    Biz bir java uygulamasýný çalýþtýrdýðýmýz zaman bu uygulama JVM üzerinde çalýþacak bir process'e dönüþür. Java projeleri process'e dönüþtükleri zaman kendi heap'ini (memory space) oluþturur. Eðer o an elimizde 2 tane çalýþr durumda process varsa bu uygulamalar birbirlerinin **memory space ya da heap'lerine**  eriþemez. Isolation vardýr.

- Thread : Bir processin içinde bulunan bir çalýþma ünitesidir ve her java programý en az bir thread'a sahiptir. Eðer biz hiç thread oluþturmasak bile Java projeleri main metodunu çalýþtýrýrken bir tane main thread oluþturur. Bu main thread'inin yanýna kendimiz deðiþik iþlemler yaptýrmak için kendi threadlerimizi oluþturabiliriz. 
- Threadler processlerin içinde oluþturuðu için processlerin oluþturduðu bellek alanýna direkt olarak eriþim saðlayabilirler.
- Ayrýca bellek alanýndan ayrý olarak her threadin sadece kendinin eriþebileceði bir tane 'thread stack'i bulunur.

--- 

## Multithreading'e Neden Ýhtiyaç Duyuyoruz ? 
- Aslýnda amaç concurrency ile birçok iþlemi ayný anda yapabilmek (paralleling) ve bloklanmanýn önüne geçebilmektir. Örneðiz internetten bir dosya indirmek gibi uzun zaman alacak bir iþlem var ve bu iþlemden sonra daha birçok yapýlacak iþ bulunuyor. Eðer bu iþlemi multithreading yapýsý kullanmadan yapar ve sadece main thread kullanýrsak iþlem bitene kadar diðer hiçbir iþleme geçilemeyecektir yani bloklanma olacaktýr. Anca Multithreading sayesinde birbirinden farklý ve birbirine baðýmlý olmayan bu iþlerin her birisini ayrý ayrý threadlerde gerçekleþtirirsek bloklanmanýn önüne geçeriz. Yani concurrency (eþzamanlýlýk) ilkesiyle birçok iþlemi paralel olarak yapacak seviyeye gelmiþ oluruz.

--- 

## Threadlerin Çalýþmasý
- Programda birçok thread oluþturulduðunda JVM ve Ýþletim sistemi bu threadlerin ne zaman çalýþacaðýný ve ne zaman baþlayacaðýný kendisi belirlerler. Ayrýca threadlerin çalýþma ve baþlatýlma sýrasý farklý olabileceði için programlarýmýzda ortaya çýkan outputlar farkýlýlýk gösterebilir.
  - **ÖRNEK**
`   thread1.start()
    thread2.start()
    thread2.start()`
Bu threadlerin ne zaman baþlayacaðý JVM ve Ýþletim Sistemi'ne baðlýdýr.

--- 

## Synchorized ve Join 
- Java Threadlerde **Join** (ThreadJoin.java) Kullanýmýmýn Amacý: Bu metot o an çalýþan ve sýrada olan baþka bir thread varsa sýrada olan Thread'in çalýþmasýný bitirmeden harekete geçmemesini (execute) söyler. Yani JVM ve Operating system'in garanti etmediði çalýþma sýrasýný belirlemeyi saðlar. 
  - Yani: çaðrýldýðý iþ parçacýðýnýn (thread) çalýþmasý tamamen bitene kadar onu çaðýran mevcut iþ parçacýðýnýn beklemesini saðlayarak, iþlemlerin birbirini ezmeden ve istenilen sýrayla yürütülmesini garanti eden bir senkronizasyon aracýdýr. (ThreadJoin.java sýnýfý örnektir)
  - Java Threadler **Synchorized (ThreadSafeWithSychorized.java)** Kullaným Amacý: Join threadlerin yürütülme-bekleme sýrasýný belirlerken synchorized ortak eriþilen verinin kilitlenmesini/veri güvenliðini saðlar. Örneðin paylaþýlan bir kaynaða (bir deðiþkene veya metoda) ayný anda birden fazla thread'in girmesini engeller. "Bu kaynapa ayný anda sadece birimizi müdahale edebiliriz, iþimi bitirene kadar kapýyý kitliyorum der diðer sýradaki thread(ler)'e"
  - Eðer bir sýnýfta bir metodu synchorized olarak iþaretlersek bu sýnýfta da birden fazla thread bu metodu call ediyorsa bu metodu ilk çaðýran thread iþlemini bitirene kadar diðer thread metodu boþta bekleyecektir. ANCAK: Sýnýfta 2 adet synchorized metot varsa ve sýradaki Thread hala iþlemdeki Thread'i bekliyorsa bu bloklanmaya neden olacaktýr. ÇÜNKÜ: synchorized metodun bulunduðu sýnýfta metot için bir key(lock) yaratýlmaz, bu lock tüm sýnýf için 1 adet yaratýlýr. Yani concurrency ortadan kalkar.  
    - Ek olarak: Eðer 1. Thread 2.Thread'in elindeki lock'u release etmesini beklerken, 2. Thread ise 1. Thread'in elindeki lock'u release etmesini beklerse sistem sonsuza kadar beklemeye devam edecektir ve program donacaktýr (**DEADLOCK**). Bu yapýda maalesef "Þu kilidi almayý 3 saniye dene; eðer alamazsan vageç ve baþka iþe geç" diyemeyiz (ancak bunu geliþmiþ Java Thread'de yapabiliriz). Kilit açýlana kadar sýradaki thread iþlemdeki thread'i beklemeye devam edecektir ve performans kaybý meydana gelecektir.
      - (ThreadJoin.java sýnýfý örnektir)
 
`Kýsacasý: Join ile sen bitir sonra ben baþlayayým derken, synhcorized ile ayný anda ayný veriyi deðiþtirmeyelim, birbirimizi ezmeyelim, sýramýzý bekleyelim deriz. Yani synchorized bir metot yüzlerce Thread sýrada olsa bile o an metodu kullanan Thread iþini bitirene kadar diðer Thread'lerin metodu kullanmasýný engelleyerek tutarlýlýk saðlayacaktýr. Ancak synchorized metot yazmak çok eski bir yöntemdir. Modern Java'da bu sorunu çözmek ReentrantLock, Async Threads (Executor Service) gibi birçok yöntem vardýr`

### Synchorized Metodun Getirdiði DeadLock ve Performans Sorununu Çözme
ListWorkerProblemSolvingWithManuelLock.java sýnýfýnda eðer addList1 ve addList2 metotlarý synchorized olarak kalýrsa sorun þu olur: addAllToList metodu Thread1 tarafýndan execute edilirse addList1 ve addList2 metotlarýnda thread1 metotlarýnýn iþi bitene kadar Thread2 metodu devreye girmez. Çünkü bu synchorized metot için sýnýfta yalnýzca 1 adet Lock oluþturulur ve Thread2 bu lock'u thread1 iþini bitirmeden devralamaz. Metotlar synchorized yapýlarak thread-safety saðlanmýþ olur ancak lock sorunundan da kaçýlamaz. 

--- 
Ancak metotlarýn deadlock yememesi için metotlar synchorized yapýlmamýþ 2 thread için sýnýfta 2 adet lock objesi oluþturulup ilgili metotlarda synchorized kullanýmýyla düzeltilmiþtir. Sýnýfta tanýmlanan Object tipindeki locklar synchorized(lock1) kodsal ifadesiyle sýnýftaki locklarýn ayrý ayrý kullanýlabilmesini (performans artýþý ve locklanmamasý için) saðlarýz.
- Ancak direkt Lock nesnesi oluþturmanýn da dezavantajlarý vardýr.Lock yerine daha da geliþmiþ Lock sýnýfý olan **ReentrantLock** kullanýlabilir. 
  - Bu sýnýf bize (***ListWorkerProblemSolvingWithReentrantLock.java*** sýnýfý incelenebilir.):
    - Metodun synchorized olma zorunluluðunda kurtulmasýný,
    - tryLock(timeout,timeUnit) (addListWithReentrantTryLockWithTimeOut) - Þu kilidi almayý dene, eðer belirtilen timeout süresi içerisinde alamazsan vazgeç ve baþka bir iþine bak -, tryLock() - threadlerin sonsuza kadar bloklanmasýný önleyebilir. Örneðin (addListWithReentrantLockParameterFree): 100 thread'in ayný anda veritabanýna veri yazmaya çalýþtýðýnda, bloklamayý önleyebilir ve sistemin yanýt verme kabileyitini koruyabiliriz, lock() - standart kilitleme metodudur - geliþmiþ metotlar,
    - Fair Lock(Adil Kilit) aktif edebilme (Threadlerde FIFO mantýðýnýn uygulanmasý),
    - lockInterruptibly() metodu sayesinde bir thread'in baþka bir thread'in elindeki lock'u release etmesini bekleyebilmesini,
gibi özellikleri saðlar.

--- 
## Executor Service—Thread Pooling
Manuel olarak Thread oluþturmanýn (new Thread) ve bu Threadlerin kilitlerle (synchorized, ReentrantLock) yönetmenin maliyetli ve riskli olduðu durumlarda ExecutorService devreye girer.
Executor Service bu manuel yönetme maliyetlinin ve hataya açýklýðýn önüne geçerek eþzamanlý (concurrent) thread yönetimini saðlayan bir mimaridir.
- ExecutorService en basit tabiriyle bir Thred Pool Manager'dýr. Bir restoran düþün; her müþteri (görev) geldiðinde yeni bir garson (thread) iþe alýp, müþteri gidince garsonu kovmak mantýksýzdýr. Bunun yerine, restoranda sabit sayýda uzman garson (Thread Pool) bulundurursun. Müþteriler geldikçe garsonlar ilgilenir, iþi biten garson sýradaki yeni müþteriye geçer. Müþteri sayýsý garsonlarý aþarsa, müþteriler bekleme salonunda (Task Queue) bekletilir.
- Bu iþi yap (task) komutu ile 'Bu iþin nasýl ve ne zaman yapýlacaðý (Thread Execution)' kavramlarýnýn birbirinden ayrýlmasýný saðlar. Sadece tasklarý göndeririz ve tüm süreçleri (locking, adil kilit, thread-safety, thread-pooling) kendisi yönetir.

### Hangi Sorunlarý Çözer ?
- **Overhead**: Yeni bir thread oluþturmak iþletim sistemi seviyesinde pahalý bir iþlemdir (yaklaþýk 1MB ram ve CPU context-switch maliyeti). Threadleri havuzda tutup yeniden kullanmak sistemin inanýlmaz derece hýzlanmasýný saðlar.
- **OOM (OutOfMemory)**: Uygulamaya ayný anda 10.000 request gelirse, manuel yapýda 10.000 thread açmaya çalýþý sunucuyu çökertebiliriz. ExecutorService ile "Sadece 50 Thread aç, geri kalanýný kuyrukta hazýrda beklet" diyerek sunucunun çökmemesini saðlarýz. (Java 21 ile beraber Virtual Thread kullanarak performansý iyice arttýrabiliriz.)
- **Sonuç Döndürebilme (Future)**: ExecutorService ile bir thread'in sonucunu bekleyebiliriz. Runnable ise hiçbir þey return etmez. ExecutorService ile `callable` kullanarak, görev bittiðinde bir deðer (örneðin B2B sisteminde hesaplanan daðýtý msayýsý veya bir PayTr ödeme sonucu) elde edebiliriz.
- **DeadLock** 
- **Performans**
- **Thread-Safety**
- **Thread-Life-Cycle**
- **Thread-Priority**
- **Thread-Communication**
- **Thread-Synchronization**
- **Thread-Deadlock**

## Hangi Sorunlarý Meydana Getirir ?
- **Sessizce Kaybolan Hatalar (Silent Failures)**: `submit()` metodu ile gönderilen bir görevde Exception çýkarsa, bu hata konsola basýlmaz ! Hatayý görmek için dönen `Future` nesnesinin `get()` metodunun çaðýrmak gerekir. Aksi taktirde thread sessizce ölür ve farkedemebiliriz.
- **ThreadLocal Kirliliði**: Thread'ler havuzda tekrar kullanýldýðý için, bir önceki görevin ThreadLocal üzerinde býraktýðý veriler temizlenmezse, bir sonraski alakasýz göreve sýzabilir (Veri sýzýntýsý).
- **Shutdown Olmayan Uygulamalar**: Pool Thread'ler genelde ana uygulamayý hayatta tutan (non-daemon) thread'lerdir. Eðer uygulama kapanýrken `executorService.shutdown()` ifadesi kullanýlmazsa, JVM sonsuza kadar askýda kalýr ve uygulama kapanmaz. (awaitTermination metodu ile aslýnda kapanmayan threadler belirlenen timeout süresi sonra otomatik kapatýlabilir)
- **Havuz Ýçi DeadLock(Thread-Starvation)**: 5 kiþilik bir thread havuzunda, 5 task'ý içeri aldýðýmýzda bu 5 task eðer kendi için bitmek için yine ayný havuza baþka alt-görevler gönderin onlarýn sonucu beklerse, tüm havuzlar kitlenid.r Ýçeridekiler dýþarýdakiler bekler, dýþardakiler giremez. 
