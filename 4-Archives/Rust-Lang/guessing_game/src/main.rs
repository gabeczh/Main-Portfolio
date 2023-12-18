use rand::Rng; //Random Library of RNG in Rust Lang
use std::cmp::Ordering;
use std::io; //Standard Library of Input/Output in Rust Lang

//Signed integer = negative numericals
//Unsigned integer = positive numericals
// Every class (including the main) starts with the keyword 'fn'
// :: is the equivalent to associating or equal to a new datatype or value
// & is the equivalent to referencing a variable etc
//Print statements in rust lang are usually println!();
//To create variables 'let' keyword must be used
// To format a user input to output ("{}",x);
// loops in Rust Lang are loop{}, for{}, while{}, while let{}
//if/else if/else statement is the same as any language in Rust Lang but there is an if let {} and a match {} statement 

//Main function in Rust Lang
fn main() { //Start fn = function pointer similar to how classes are made in python or java
    println!("Guess the number!"); //Print statement in Rust Lang

    let secret_number = rand::thread_rng().gen_range(1,101);

    //println!("The secret number is: {}", secret_number);
    loop {
        println!("Please input your guess."); //Print statement in Rust Lang

        let mut guess = String::new(); //User Input Variable in Rust Lang 

        //Receiving and Scanning User Input in Rust Lang
        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line"); //Error Handling  Other Example: io::stdin().read_line(&mut guess).expect("Failed to read line");
    
        let guess:u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        println!("You guessed: {}", guess); //Output print statement in Rust Lang

        match guess.cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }
    }   
} //Close