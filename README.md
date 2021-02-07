**Title**
Car Details API
  _The API fetches the Car Details from the JSON database stored in the MongoDB sorted by the dateAdded date in ascending order._

* **URL**

  _http://localhost:8080/cars_

* **Method:**
  
  _`GET`_
  
* **Success Response:**
  
  _The successful response will return list of vehicle object from the JSON database based dateAdded date in ascending order. The response contains a list of Vehicle objects._

  * **Code:** 200 <br />
    **Content:** `{ 
[{"id":"55","make":"Volvo","model":"850","yearModel":1995,"price":25762.08,"licensed":true,"dateAdded":"2017-10-03","location":"Suid wing","warehouse":"Warehouse C"},{"id":"22","make":"Infiniti","model":"I","yearModel":2002,"price":6910.16,"licensed":false,"dateAdded":"2017-10-15","location":"East wing","warehouse":"Warehouse B"}]
}`
 
* **Error Response:**

  _If the data is not available we would receive we will receive 404 response code._

  * **Code:** 404 NODATAFOUND <br />
    **Content:** `{ error : "No Data Found" }`
