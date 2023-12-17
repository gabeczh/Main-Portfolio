use std::io; //Standard Library: Input/Output

//Fibonacci Function
//Parameter: variable n equals to i32 (signed 32-bit), return type = i32 (signed 32-bit)
fn fibonacci(nth: i32) -> i32 {
    if nth == 0 {
        return 0;
    }
    if nth == 1 {
        return 1;
    }
    //fibonacci formula
    fibonacci(nth - 1) + fibonacci(nth - 2)
}

fn main() {

    println!("Enter a number");

    let mut number = String::new();

    io::stdin().read_line(&mut number)
        .expect("Failed to read line");

    //If anything entered that is not an integer, thread will panic and print "Invalid number".
    let number: i32 = number.trim().parse()
        .expect("Invalid number");

    //If anything entered that is below 0, thread will panic and print "Invalid number for Fibonacci".
    if number < 0 {
        panic!("Invalid number for Fibonacci");
    }

    //Otherwise it will print the result 
    println!("Fibonacci of {} is {}", number, fibonacci(number));

}
