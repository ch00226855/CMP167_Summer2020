# Week 4
# Console Input / Output
## Output Streams
- An **OutputStream** is a class that supports output data to a screen, file, or elsewhere.
- `System.out` is a predefined OutputStream object reference that is associated with a system's standard output, usually a computer screen.
- **Methods**: `print`, `println`, `printf`.

## Output Streams
- An **InputStream** is a class that receives data from an input device such as keyboard, mouse, or touchscreen.
- `System.in` is a predefined input stream object reference that is associated with a system's standard input, which is usually a keyboard.
- **Methods**: `nextInt`, `next`, `nextLine`, `nextDouble`.

## Output Formatting
- A programmer can adjust the way that a program's output appears, a task known as **output formatting**.
- The first argument of the printf() method, the **format string**, specifies the format of the text to print along with any number of **format specifiers** for printing numeric values.
- A format specifier begins with the % character followed by another character that indicates the value type to be printed.
- [Table 3.2.1: Format specifiers](https://learn.zybooks.com/zybook/CUNYCMP167Summer2020/chapter/3/section/2?content_resource_id=42397781)

## Format Integer Values
Formatting integer numbers commonly requires two additional sub-specifiers
> %(flags)(width)specifier
- flags: + (show +/- sign), - (left align), 0 (pad with zeros at the beginning)
- width: minimum number of characters to print


## Format Floating-Point Values
Formatting floating-point numbers commonly requires sub-specifiers
> %(flags)(width)(.precision)specifier
- .precision: number of decimal digits


## Format Strings
> %(flags)(width)(.precision)specifier
- flags: - (left align)
- .precision: maximum number of characters to print (string will be truncated if it exceeds the limit)
