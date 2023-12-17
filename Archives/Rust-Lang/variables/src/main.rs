//Mutable Example:
/* 
fn main() {
    let mut x = 5;
    println!("The value of x is: {}", x);
    x = 6;
    println!("The value of x is: {}", x);
}
*/

//Immutable Example: Outputs Error
/*
fn main() {
    let x = 5;
    println!("The value of x is: {}", x);
    x = 6;
    println!("The value of x is: {}", x);
} 
*/

//Constant Example:
//Naming Convention for Constant UPPERCASE = words, UNDERSCORES = spaces
//const THREE_HOURS_IN_SECONDS: u32 = 60 * 60 * 3;

//Shadowing Example:
fn main() {
    let x = 5; //first variable

    let x = x + 1; //second variable shadowed the first

    {
        let x = x * 2; //third variable shadowed the second
        println!("The value of x in the inner scope is: {}", x);
    }

    println!("The value of x is: {}", x);
} 


/* Immutable and Mutable Examples in different datatypes
//Able to Output because of shadowing concept
let spaces = "   "; //String
let spaces = spaces.len(); //Numerical  

//Unable to Output because both are different datatypes
let mut spaces = "   ";
    spaces = spaces.len();
*/

//Data Types in Rust
//Scalar and Compound
//Scalar = Integers, floating points, Booleans, and Characters.
//Compound = Tuples, Structs, Tuple Structs, Newtypes, Enums.
//Length: 8-bit, 16-bit, 32-bit, 64-bit, 128-bit, arch
//Signed: i8, i16, i32, i64, i128, isize      
//Unsigned: u8, u16, u32, u64, u128, usize
//Signed is stored in two's complement
//Unsigned is positive whereas Signed is negative
//Arch depends on the architecture of your system
//Number Literals: Decimal: 98_222, Hex: 0xff, Octal: 0o77, Binary: 0b1111_0000, Byte (u8) only: b'A'

//Parsing Example
/* 
fn main(){
    let guess: u32 = "42".parse().expect("Not a number!");
    //let guess = "42".parse().expect("Not a number!"); //no type annotation will produce error
}
*/

//Floating points Example
/*
fn main() {
    let x = 2.0; // f64

    let y: f32 = 3.0; // f32
}
*/

//Numeric Operations Example
/* 
fn main() {
    // addition
    let sum = 5 + 10;

    // subtraction
    let difference = 95.5 - 4.3;

    // multiplication
    let product = 4 * 30;

    // division
    let quotient = 56.7 / 32.2;
    let floored = 2 / 3; // Results in 0

    // remainder
    let remainder = 43 % 5;
}
*/

//Boolean Example
/*
fn main() {
    let t = true;

    let f: bool = false; // with explicit type annotation
}
*/

//Character Example
/* 
fn main() {
    let c = 'z';
    let z = 'ℤ';
    let heart_eyed_cat = '😻';
}
*/

//Compound Examples:
//Tuple Example
/* 
fn main() {
    let tup: (i32, f64, u8) = (500, 6.4, 1);
}

//Tuple Output/Access Example
fn main() {
    let tup = (500, 6.4, 1);

    let (x, y, z) = tup;

    println!("The value of y is: {}", y);
}
*/

//Tuple Output/Access 2 Example
/* 
fn main() {
    let x: (i32, f64, u8) = (500, 6.4, 1);

    let five_hundred = x.0;

    let six_point_four = x.1;

    let one = x.2;
}
*/

//Array Example
/* 
fn main() {
    //Default value of Array is [type of each element; depends on elements in array]
    let a = [1, 2, 3, 4, 5];

    let months = ["January", "February", "March", "April", "May", "June", "July",
              "August", "September", "October", "November", "December"];
    //When value of Array is hard coded
    let a: [i32; 5] = [1, 2, 3, 4, 5];

    //initialized array
    let a = [3; 5];
}
*/

//Accessing Elements in Array
/* 
fn main() {
    let a = [1, 2, 3, 4, 5];

    let first = a[0];
    let second = a[1];
}
*/

/* //Example of User Input Array
//If inputted elements are within the array range (index value: 0,1,2,3,4), no error will be produced
//If inputted elements are not within the array range (index value: 5,6,7,8,9,10), error will be produced
use std::io;

fn main() {
    let a = [1, 2, 3, 4, 5];

    println!("Please enter an array index.");

    let mut index = String::new();

    io::stdin()
        .read_line(&mut index)
        .expect("Failed to read line");

    let index: usize = index
        .trim()
        .parse()
        .expect("Index entered was not a number");

    let element = a[index];

    println!(
        "The value of the element at index {} is: {}",
        index, element
    );
} */




