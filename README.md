<h2>Noah's pre-built and computer part shop</h2>
<p></p>
<p>WGU D287 - Task 1</p>
Format:<br>
Prompt: <br>
File Name: <br>
Line Number: <br>
Description of change:
<h2>Project Section C:</h2>
Prompt: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.<br>
Line Number: 18-20, 52<br>
Description of change: customized text for Noahs computer shop.<br>
<h2>Project Section D:</h2>
Prompt: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
File Name: About.html<br>
Line Number: All<br>
Description of change: Created About.html file that serves as an "About Us" page for Noah's computer shop.<br>
File Name: AboutController<br>
Line Number: All<br>
Description of change: Created AboutController to route requests via the @GetMapping method to about.html<br>
File Name: mainscreen.html<br>
Line Number: 15<br>
Description of change: Added navigation button to mainscreen.html that navigates to about.html<br>
<h2> Project Section E:</h2>
Prompt: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database
File Name: BootStrapData.java<br>
Line Number: 42 - 61<br>
Description of change: adds objects for in house parts and stores them.<br>
File Name: BootStrapData.java<br>
Line Number: 70 - 108<br>
Description of change: adds objects for out house parts and stores them.<br>
File Name: BootStrapData.java<br>
Line Number: 70 - 108<br>
Description of change: If statement  check to add inventory if inventory is empty.<br>
File Name: BootStrapData.java<br>
Line Number: 152 - 165<br>
Description of change: adds 5 product objects to application.  If product list is 0, it adds the sample inventory upon application starting.<br>
<h2>Project Section F:</h2>
Prompt: 
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

•The “Buy Now” button must be next to the buttons that update and delete products.

•The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

•Display a message that indicates the success or failure of a purchase.
File Name: mainscreen.html<br>
Line Number: 86<br>
Description of change: Added "Buy" button to products list.<br>
File Name: BuyController<br>
Line Number: ALL<br>
Description of change: Created controller that makes sure product is greater than 0. If it is then it subtracts the number by 1 and returns either sucpurchase.html or failedpurchase.html<br>
<h2>Project Section G:</h2>
Prompt: Modify the parts to track maximum and minimum inventory by doing the following:
• Add additional fields to the part entity for maximum and minimum inventory.
• Modify the sample inventory to include the maximum and minimum fields.
• Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
• Rename the file the persistent storage is saved to.
• Modify the code to enforce that the inventory is between or at the minimum and maximum value.
File Name: part.java<br>
Line Number: 30-33<br>
Description of change:Added minInventory and maxInventory  with the @Min and @Max methods.<br>

File Name: part.java<br>
Line Number: 48-49<br>
Description of change:Added minInventory and maxInventory to the part method.<br>

File Name: part.java<br>
Line Number: 98-106<br>
Description of change: Added geter and seter for minInventory and maxInventory.<br>

File Name: part.java<br>
Line Number: 107-112<br>
Description of change: added invIsValid method to check if the value is betweeen minInventory and maxInventory.<br>

File Name: BootStrapData.java<br>
Line Number: 46-47, 53-54, 60-61, 67-68, 74-75, 83-84, 92-93, 101-102, 110-111, 120-121<br>
Description of change:  Added min and max Inventory to the inHouse and outsourced-parts.<br>

File Name: InhousePartForm.html<br>
Line Number: 25-27<br>
Description of change: Added input fields for minInventory and maxInventory.<br>

File Name: OutsourcedPartForm.html<br>
Line Number: 25-27<br>
Description of change: Added input fields for minInventory and maxInventory.<br>

File Name: application.properties<br>
Line Number: 6<br>
Description of change: changed file source of db name to Noahs-computer-shop<br>

File Name: AddInhousePartController.java<br>
Line Number: 42-44<br>
Description of change:  Added if statement to call invIsValid().<br>

File Name: AddOutsourcedPartController.java.java<br>
Line Number: 43-45<br>
Description of change:  Added if statement to call invIsValid().<br>
<h2>Project Section: H</h2>
Prompt: Add validation for between or at the maximum and minimum fields. The validation must include the following:
• Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
• Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•Display error messages when adding and updating parts if the inventory is greater than the maximum.
File Name: Part.java<br>
Line Number: 113-118<br>
Description of change:  Added a method minBounds to check minIventory value.<br>

File Name: Part.java<br>
Line Number: 120-125<br>
Description of change:  Added a method maxBounds to check maxIventory value.<br>

File Name: AddInhousePartController.java<br>
Line Number: 46-52<br>
Description of change: Added if statments to call minBounds() and maxBounds()<br>
File Name: AddOutsourcedPartController.java<br>
Line Number: 46-52<br>
Description of change: Added if statments to call minBounds() and maxBounds()<br>

File Name: EnufPartsValidator.java<br>
Line Number: 36<br>
Description of change: Added a or to the if stament to make sure that invenotry does not drop below min values.<br>
<h2>Project Section I:</h2>
Prompt:
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
File Name: PartTest.java<br>
Line Number: 161 - 170<br>
Description of change: Added test to call and test minBounds()<br>

File Name: PartTest.java<br>
Line Number: 172 - 181<br>
Description of change: Added test to call and test maxBounds()<br>
<h2>Project Section: J</h2>
Prompt: Remove the class files for any unused validators in order to clean your code.
File Name:  DeletePartsValidator.java<br>
Line Number: All<br>
Description of change: Deleted the file DeletePartValidator.java as it had no uses in the application.<br>
