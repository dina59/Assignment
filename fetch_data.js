function fetchDataAndLog(url) {
    return new Promise((resolve, reject) => {
      fetch(url)
        .then((response) => {
          if (!response.ok) {
            throw new Error('Network response was not ok');
          }
          return response.json();
        })
        .then((data) => {
          console.log('Fetched and parsed data:', data);
          resolve(data);
        })
        .catch((error) => {
          console.error('Error:', error);
          reject(error);
        });
    });
  }
  
  // Example usage:
  const apiUrl = 'https://jsonplaceholder.typicode.com/posts/1'; // Replace with your API URL
  fetchDataAndLog(apiUrl)
    .then((result) => {
      // Do something with the result if needed
    })
    .catch((error) => {
      // Handle any errors
    });
  