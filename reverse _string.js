function reverseString(inputString) {
    // Convert the input string to an array of characters
    var charArray = inputString.split('');
  
    // Reverse the array
    charArray.reverse();
  
    // Join the characters back into a string
    var reversedString = charArray.join('');
  
    return reversedString;
  }
  
  // Example usage:
  var input = "Hello, World!";
  var reversed = reverseString(input);
  console.log(reversed); // Output: "!dlroW ,olleH"
  