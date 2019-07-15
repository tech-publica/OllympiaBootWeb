document.querySelector("#loadReservations").addEventListener("click", 
                    (evt) => {
                    	document.querySelector("#reservationTable").style.display = "block";
                    	var xhttp = new XMLHttpRequest();
                    	  xhttp.onreadystatechange = () => showReservations(xhttp);
                    	  xhttp.open("GET", "/data/reservations.json", true);
                    	  xhttp.send();                  
                    });

function showReservations(xhttp) {
	let table = document.querySelector("#reservationTable tbody");
	let data = JSON.parse(xhttp.responseText);
	let rows = '';
	for(let r of data) {
		rows += '<tr>';
		
		rows += '<td>';
		rows += r.id;
		rows+= '</td>';
		
		rows += '<td>';
		rows += r.start;
		rows+= '</td>';
		
		rows += '<td>';
		rows += r.end;
		rows+= '</td>';
		
		rows += '<td>';
		rows += r.client;
		rows+= '</td>';
		
		rows += '<td>';
		rows += r.court;
		rows+= '</td>';

		rows += '<td>';
		rows += r.cost;
		rows+= '</td>';
		
		rows += '</tr>';
	}
	table.innerHTML = rows;
}