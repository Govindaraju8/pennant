// Sample JSON data containing items list for the button
const buttonItemsData = {
    "bir": ["Item 1", "Item 2", "Item 3"],
  };
  
  // Function to display items list for the clicked button
  function displayItemsList(event) {
    const buttonId = event.target.id;
    const items = buttonItemsData[buttonId];
    const itemsTableDiv = document.getElementById("itemsTable");
  
    if (items) {
      let itemsTableHTML = "<table>";
      itemsTableHTML += "<thead><tr><th>Items</th></tr></thead>";
      itemsTableHTML += "<tbody>";
      items.forEach(item => {
        itemsTableHTML += `<tr><td>${item}</td></tr>`;
      });
      itemsTableHTML += "</tbody></table>";
      itemsTableDiv.innerHTML = itemsTableHTML;
    } else {
      itemsTableDiv.innerHTML = "No items available.";
    }
  }
  
  // Event listener for the button
  document.getElementById("button1").addEventListener("click", displayItemsList);
  