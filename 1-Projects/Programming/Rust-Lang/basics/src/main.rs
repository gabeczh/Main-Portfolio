use rand::Rng;
use std::cmp::Ordering;
use std::io;

fn main() {

    println!("Hello!\n");
    println!("the key word 'let' is used to declare variables.");
    println!("they key word 'mut' makes variables mutable.\n");

    println!("Mutable vs Immutable: \n");
    println!("For Immutables like 'let x = 5' cannot be assigned twice.");
    println!("For Mutables like 'let mut x = 5' can be assigned twice or more.\n");

     let mut mute = 5; //Let's say this is x
    println!("The value of x is: {mute}");
    mute = 6;
    println!("The value of x is: {mute}\n");

    println!("Shadowing: \n");
    println!("It works by overshadowing the first variable with 'let'.\n");

        let shadow = 5;//Let's say this is x

    let shadow = shadow + 1;

    {
        let shadow = shadow * 2;
        println!("The value of x in the inner scope is: {shadow}");
    }

    println!("The value of x is: {shadow}\n");


    println!("Guess the number!");

    let secret_number = rand::thread_rng().gen_range(1..=100);

    loop {
        println!("Please input your guess.");

        let mut guess = String::new();

        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line");

        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        println!("You guessed: {guess}");

        match guess.cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }
    }
}
