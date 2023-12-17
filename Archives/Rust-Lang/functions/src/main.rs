//Function Example
//Rust uses snake case for function and variables names
//Such as letters as lowercase and underscores as separators

fn main() {
    println!("Hello, world!");

    another_function();
}

fn another_function() {
    println!("Another function.");
}



//Parameters Example
/* 
fn main() {
    another_function(5);
}

fn another_function(x: i32) {
    println!("The value of x is: {}", x);
}

//Parameters 2 Example
fn main() {
    print_labeled_measurement(5, 'h');
}
//Data type must always be defined in parameters and separated with commas
fn print_labeled_measurement(value: i32, unit_label: char) {
    println!("The measurement is: {}{}", value, unit_label);
}
*/

//Statements and Expressions
//Statement Example
/* 
fn main() {
    let y = 6;
}
//Statement 2 Example with Error
//Statements do not return values which means that you cannot assign a let statement to another variable 
fn main() {
    let x = (let y = 6);
}
*/

//Expression Example
//An expression unlike a statement does not need a semicolon, that is the only difference between a statement and a expression
/*
fn main() {

    let y = {
        //Scope block
        let x = 3;
        //Expression:
        x + 1
    };

    println!("The value of y is: {}", y);
}
*/
//Functions with Return Values Example
//Function, return type, return value.
/* 
fn five() -> i32 {
    //return value
    5
}

fn main() {
    //Assign function call to variable
    let x = five(); //let x = 5;

    println!("The value of x is: {}", x);
}
*/
//Functions with Return Values 2 Example
/* 
fn main() {
    let x = plus_one(5);

    println!("The value of x is: {}", x);
}

fn plus_one(x: i32) -> i32 {
    x + 1
}
*/

/*
//Function with Return Values 3 Example with Error
fn main() {
    let x = plus_one(5);

    println!("The value of x is: {}", x);
}

fn plus_one(x: i32) -> i32 {
    x + 1; //As mentioned before expressions do not include semicolons.
}
*/