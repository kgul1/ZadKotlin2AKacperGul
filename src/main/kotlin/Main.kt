import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("podaj dzien tygodnia")
    val dzien=scanner.nextInt()
   while(dzien <= 7) {
       if(dzien==1){
           print("poniedzialek")
           break
       }
    else   if(dzien==2){
           print("wtorek")
           break
       }
       else  if(dzien==3){
           print("sroda")
           break
       }
       else  if(dzien==4){
           print("czwartek")
           break
       }
       else  if(dzien==5){
           print("piatek")
           break
       }
       else   if(dzien==6){
           print("sobota")
           break
       }
       else  if(dzien==7){
           print("niedziela")
           break
       }
       
   }



}