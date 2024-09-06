<?php	
	
	
	$undefined_29537 = $_POST['undefined_29537'];
	$input_2288_29537 = $_POST['input_2288_29537'];
	$input_1155_29537 = $_POST['input_1155_29537'];
	$input_2585_29537 = $_POST['input_2585_29537'];
	$input_412_29537 = $_POST['input_412_29537'];
	$input_412_29537 = $_POST['input_412_29537'];
	$input_412_29537 = $_POST['input_412_29537'];
	$input_412_29537 = $_POST['input_412_29537'];
	$input_412_29537 = $_POST['input_412_29537'];
	$input_412_29537 = $_POST['input_412_29537'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Undefined_29537: $undefined_29537 \nInput_2288_29537: $input_2288_29537 \nInput_1155_29537: $input_1155_29537 \nInput_2585_29537: $input_2585_29537 \nInput_412_29537: $input_412_29537 \nInput_412_29537: $input_412_29537 \nInput_412_29537: $input_412_29537 \nInput_412_29537: $input_412_29537 \nInput_412_29537: $input_412_29537 \nInput_412_29537: $input_412_29537 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>