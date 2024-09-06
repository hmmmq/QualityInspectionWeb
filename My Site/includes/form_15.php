<?php	
	
	
	$input_1155 = $_POST['input_1155'];
	$input_2288 = $_POST['input_2288'];
	$input_1155 = $_POST['input_1155'];
	$input_2585 = $_POST['input_2585'];
	$input_412 = $_POST['input_412'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Input_1155: $input_1155 \nInput_2288: $input_2288 \nInput_1155: $input_1155 \nInput_2585: $input_2585 \nInput_412: $input_412 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>