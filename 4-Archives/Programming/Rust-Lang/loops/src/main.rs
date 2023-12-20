//Loops Example
//Infinite Loop
/* 
fn main() {
    loop {
        println!("again!"); 
    }
}
*/

//Loops 2 Example
//Nested Loops
//To specify break or continue in a nested loop, labelling is needed for annotations such as the outer loop
/* 
fn main() {
    let mut count = 0;
    //Labelling Example "'counting_up"
    //Loop 1
    'counting_up: loop {
        println!("count = {}", count);
        let mut remaining = 10;
        //Loop 2
        loop {
            println!("remaining = {}", remaining);
            if remaining == 9 {
                //This will only break the remaining loop (inner loop)
                break;
            }
            if count == 2 {
                //this will only break the counting_up loop (outer loop)
                break 'counting_up;
            }
            remaining -= 1;
        }

        count += 1;
    }
    println!("End count = {}", count);
}
*/

//Loops 3 Example
//Returning values from Loops
/* 
fn main() {
    let mut counter = 0;

    let result = loop {
        counter += 1;

        if counter == 10 {
            //Retrying an operation to check whether a thread has completed or to pass the result out of the loop
            break counter * 2;
        }
    };

    println!("The result is {}", result);
}
*/

//Loops 4 Example
//Conditional Loops with While
//The while loop works the same way in any other language
/* 
fn main() {
    let mut number = 3;
    
    //While condition is true, loop until condition is false
    while number != 0 {
        println!("{}!", number);

        number -= 1;
    }

    println!("LIFTOFF!!!");
}

//Loops 4 Example in For loop
fn main() {
    //the rev method or reverse is used in this example
    for number in (1..4).rev() {
        println!("{}!", number);
    }
    println!("LIFTOFF!!!");
}
*/

//Loops 5 Example
//Looping Through a Collection with For
//What it looks like in a while loop
//However, since it runs until the index hits 5. It can easily be error prone when there are more or less elements in an array.
//Or when the condition is changed into something else or it stays the same.
/* 
fn main() {
    let a = [10, 20, 30, 40, 50];
    let mut index = 0;

    while index < 5 {
        println!("the value is: {}", a[index]);

        index += 1;
    }
}
*/

//What it looks like in a for loop
//This example is much more concise and a lot safer for array
fn main() {
    let a = [10, 20, 30, 40, 50];

    for element in a {
        println!("the value is: {}", element);
    }
}


