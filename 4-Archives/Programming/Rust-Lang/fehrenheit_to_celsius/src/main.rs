use std::io;

fn main() {

    println!("Enter a temperature to convert from Fehrenheit to Celsius");

    let mut ferenheit = String::new();

    io::stdin().read_line(&mut ferenheit)
        .expect("Failed to read line");

    let ferenheit = ferenheit.trim().parse::<f32>().unwrap();

    let celsius = (ferenheit - 32.0) * (5.0 / 9.0);

    println!("{}° in Fehrenheit is {:.2}° in Celsius", ferenheit, celsius);

}
