import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("masz do wyboru 4 pory dnia 0 6 12 18")
    val pora=scanner.nextInt()
    while(pora <= 7) {
        if(pora==0){
            print("idz spac")
            break
        }
        else   if(pora==8){
            print("obudz sie")
            break
        }
        else  if(pora==12){
            print("zjedz obiad")
            break
        }
        else  if(pora==18){
            print("kladz sie spac")
            break
        }


    }



}