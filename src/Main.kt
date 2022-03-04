fun main(){
    word()
    statement("Ahimbisibwe Prudence",24)
    val k= counting("codehive")
    println(k)


    clarify()







//    Given a string “akirachix”. Write a function that prints out a string composed of
//    the first, third and fourth characters of the string (2 points)
//    2.Write a function that takes in 2 parameters, name and age and returns a
//    String with this structure “Hi, my name is x and I am y years old.” Where x and
//    y are the provided name and age respectively. (3 points)
//    3.Write a function that takes in a String and returns its length (2 points)
//    4.Write a function that takes in a name and prints out “That’s me!” when your
//    name is passed to it, otherwise it prints out “I don’t know who that is” (3

 }//question 1
fun word(){
    val chars = "akirachix"
    val character = chars[0].toString() + chars[2] + chars[3]
    println(character)
}
//question 2
fun statement(name:String,age:Int){
    val x = "Hi, my name is $name and I am $age years old"
    println(x)
}
//question 3
fun counting(text:String):Int{
    val b = text.length
    return(b)

}
//question 4
fun clarify(){
    val name = "Ahimbisibwe"
    if("Ahimbisibwe" in name){
        println("Thats me")}
    else{
        println("I don't know who that is")}

}







