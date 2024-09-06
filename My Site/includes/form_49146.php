<?php	
	
	
	$input_229 = $_POST['input_229'];
	$input_1241 = $_POST['input_1241'];
	$input_2496 = $_POST['input_2496'];
	$input_1241 = $_POST['input_1241'];
	$input_140 = $_POST['input_140'];
	$input_1241 = $_POST['input_1241'];
	$input_2248 = $_POST['input_2248'];
	$input_1241 = $_POST['input_1241'];
	$input_200 = $_POST['input_200'];
	$input_1241 = $_POST['input_1241'];
	$input_15 = $_POST['input_15'];
	$input_1241 = $_POST['input_1241'];
	$input_1309 = $_POST['input_1309'];
	$input_1241 = $_POST['input_1241'];
	$input_2314 = $_POST['input_2314'];
	$input_1241 = $_POST['input_1241'];
	$input_1177 = $_POST['input_1177'];
	$input_1241 = $_POST['input_1241'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Input_229: $input_229 \nInput_1241: $input_1241 \nInput_2496: $input_2496 \nInput_1241: $input_1241 \nInput_140: $input_140 \nInput_1241: $input_1241 \nInput_2248: $input_2248 \nInput_1241: $input_1241 \nInput_200: $input_200 \nInput_1241: $input_1241 \nInput_15: $input_15 \nInput_1241: $input_1241 \nInput_1309: $input_1309 \nInput_1241: $input_1241 \nInput_2314: $input_2314 \nInput_1241: $input_1241 \nInput_1177: $input_1177 \nInput_1241: $input_1241 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>