<?php	
	
	
	$input_282 = $_POST['input_282'];
	$input_334 = $_POST['input_334'];
	$input_2238 = $_POST['input_2238'];
	$input_334 = $_POST['input_334'];
	$input_949 = $_POST['input_949'];
	$input_334 = $_POST['input_334'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Input_282: $input_282 \nInput_334: $input_334 \nInput_2238: $input_2238 \nInput_334: $input_334 \nInput_949: $input_949 \nInput_334: $input_334 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>