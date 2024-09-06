<?php	
	
	
	$input_1961 = $_POST['input_1961'];
	$input_334 = $_POST['input_334'];
	$input_33 = $_POST['input_33'];
	$input_334 = $_POST['input_334'];
	$input_2273 = $_POST['input_2273'];
	$input_334 = $_POST['input_334'];
	$input_1167 = $_POST['input_1167'];
	$input_334 = $_POST['input_334'];
	$input_875 = $_POST['input_875'];
	$input_334 = $_POST['input_334'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Input_1961: $input_1961 \nInput_334: $input_334 \nInput_33: $input_33 \nInput_334: $input_334 \nInput_2273: $input_2273 \nInput_334: $input_334 \nInput_1167: $input_1167 \nInput_334: $input_334 \nInput_875: $input_875 \nInput_334: $input_334 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>