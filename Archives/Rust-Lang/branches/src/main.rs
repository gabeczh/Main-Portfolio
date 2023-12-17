
//If Expressions Example
//Virtually the same as every other programming language (syntax)
/* 
fn main() {
    //Test the conditions 
    //let number = 3; //will produce True
    let number = 7; //will produce False

    if number < 5 {
        println!("condition was true");
    } else {
        println!("condition was false");
    }
}
*/

//If Expressions Error Example
/* 
fn main() {
    let number = 3;

    //In the conditional portion, it is worth noting that it must be a bool or else it would produce an error
    //Such as <,>,==, <=, >=, !=, &&, ||, !
    if number {
        println!("number was three");
    }
}
*/

//If Expression 2 Example
/* 
fn main() {
    let number = 3;

    if number != 0 {
        println!("number was something other than zero");
    }
}
*/

//If Expressions 3 Multi Expressions Example
//It is important to note that Rust only checks until the first right expression
/* 
fn main() {
    let number = 6;

    if number % 4 == 0 {
        println!("number is divisible by 4");
    } else if number % 3 == 0 {
        println!("number is divisible by 3");
    } else if number % 2 == 0 {
        println!("number is divisible by 2");
    } else {
        println!("number is not divisible by 4, 3, or 2");
    }
}
*/

//If Expression 4 If Let Example
fn main() {
    let condition = true;
    let number = if condition { 5 } else { 6 };

    println!("The value of number is: {}", number);
}

//If Expression 5 If Let Error Example
/* 
fn main() {
    let condition = true;

    //As mentioned before if the variable is of another data type, the entire assignment must be of that data type
    let number = if condition { 5 } else { "six" };

    println!("The value of number is: {}", number);
}
*/