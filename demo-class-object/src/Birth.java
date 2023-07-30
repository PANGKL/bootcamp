import java.rmi.registry.LocateRegistry;
import java.security.KeyStore.LoadStoreParameter;
import java.time.LocalDate;
import java.time.Month;

public class Birth {

  public static void main(String[] args) {


    LocalDate today = LocalDate.now();
    System.out.println(today);// 2023-07-28
    LocalDate specifiedDate = LocalDate.of(2023, Month.FEBRUARY, 28);
    System.out.println(specifiedDate);// 2023-02-28


    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.println(d1.getDayOfWeek());
    System.out.println(d1.getMonth());
    System.out.println(d1.getYear());
    Month result = d1.getMonth();
    System.out.println(result.getValue()); // 12
    System.out.println(d1.getDayOfYear()); // 30
    System.out.println(d1.getDayOfMonth()); // 30
    System.out.println(LocalDate.parse("2023-09-04").getDayOfYear());
    System.out.println(LocalDate.parse("2023-09-04").getDayOfWeek());

    System.out.println(d1.plusMonths(3)); // 2024-03-30
    // PlusDays
    // PlusYears

    boolean expiry = false;
    LocalDate effectDay = LocalDate.of(2023, 7, 21);
    if (LocalDate.now().isAfter(effectDay.plusMonths(3L))) { // 728 !> 721+3 month
      expiry = true;

    }

    System.out.println(expiry);


  }



}
