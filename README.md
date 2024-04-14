# Currency Converter App

This Java application allows users to convert currencies using the Exchange Rate API. It uses Gson for JSON manipulation and HttpClient for API requests.

## Setup

1. Clone this repository to your local machine.
2. Open the project in IntelliJ IDEA or your preferred Java IDE.
3. Make sure you have Gson and HttpClient libraries added to your project dependencies.
4. Replace the API key in the `CurrencyApi.java` file with your own API key.

## Usage

1. Run the `CurrencyConverterApp.java` file to start the application.
2. Enter the base currency (e.g., USD), the amount to convert, and the target currency (e.g., EUR) when prompted.
3. The application will fetch the latest exchange rates from the API and display the converted amount.

## Project Structure

- `CurrencyApi.java`: Contains methods to fetch exchange rates from the API.
- `JsonParser.java`: Parses JSON responses from the API.
- `CurrencyConverter.java`: Performs currency conversion calculations.
- `CurrencyConverterApp.java`: Main class for user interaction via console.

## Dependencies

- Gson: [link to Gson](https://github.com/google/gson)
- HttpClient: [link to HttpClient](https://openjdk.java.net/groups/net/httpclient/intro.html)

## API Key

You need to obtain an API key from Exchange Rate API and replace it in the `CurrencyApi.java` file to use the application.


