<?php	
	
	
	$input_2311 = $_POST['input_2311'];
	$input_438 = $_POST['input_438'];
	$input_1757 = $_POST['input_1757'];
	$input_515 = $_POST['input_515'];
	$input_315 = $_POST['input_315'];
	$input_1163 = $_POST['input_1163'];
	$input_1632 = $_POST['input_1632'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Input_2311: $input_2311 \nInput_438: $input_438 \nInput_1757: $input_1757 \nInput_515: $input_515 \nInput_315: $input_315 \nInput_1163: $input_1163 \nInput_1632: $input_1632 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>