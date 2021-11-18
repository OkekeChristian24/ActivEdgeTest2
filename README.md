## Exercise Two
### Purpose: To build a Restful CRUD API program

This program demonstrates the CRUD (Create, Read, Update, and Delete) principle in software APIs development.
Apache Derby in-memory database and GlassFish server form the components of this program

#### Data Sample:
The sample fields of the data to be manipulated are as shown below:
* id: (Number),
* name: (String),
* current_price: (Amount),
* create_date: (Timestamp),
* last_update: (Timestamp).

#### CRUD APIs:
REST(REpresentational State Transfer) API uses the HTTP protocol methods which are POST, GET, PUT, and DELETE.
Examples of the APIs are: 
* GET /api/stocks … (get the List of Stocks)
* GET /api/stocks/1 … (get a single Stock from the list by its ID)
* PUT /api/stocks/1 … (update the current_price/name of a single Stock)
* DELETE /api/stocks/1 … (delete a single Stock by its ID)
* POST /api/stocks … (create a new Stock)


PS: Honestly, this is my first time of writing a web application in Java, it is interesting, and I am loving it already. I use Java in competitive programming, and Node.js or PHP for web apps. Thank you
