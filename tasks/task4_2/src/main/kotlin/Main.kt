// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("Options of pizza are:\n a for cheese, b for pepperoni, c for ham,d for sausage please input abcd for your chosen pizza:")
    val pizzaInput = readln().lowercase()
    if (pizzaInput.length == 1 && pizzaInput[0]in 'a'..'d') {
        println("Order Accepted")
    }
    else {
        println("Invalid Choice!")
    }
}
