import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("podaj pierwsza liczbde")
    var liczba=scanner.nextInt()
    print("podaj druga liczbde")
    var liczba1=scanner.nextInt()
    if(liczba>liczba1){
        print("liczba "+liczba+"jest wieksza od"+liczba1)

    }
    else{
        print("liczba "+liczba1+"jest wieksza od"+liczba)
    }




}