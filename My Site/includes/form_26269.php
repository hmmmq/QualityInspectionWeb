<?php	
	if (empty($_POST['name_26269']) && strlen($_POST['name_26269']) == 0 || empty($_POST['name_26269']) && strlen($_POST['name_26269']) == 0 || empty($_POST['name_26269']) && strlen($_POST['name_26269']) == 0 || empty($_POST['name_26269']) && strlen($_POST['name_26269']) == 0 || empty($_POST['email_26269']) && strlen($_POST['email_26269']) == 0 || empty($_POST['message_26269']) && strlen($_POST['message_26269']) == 0)
	{
		return false;
	}
	
	$name_26269 = $_POST['name_26269'];
	$name_26269 = $_POST['name_26269'];
	$name_26269 = $_POST['name_26269'];
	$name_26269 = $_POST['name_26269'];
	$email_26269 = $_POST['email_26269'];
	$message_26269 = $_POST['message_26269'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name_26269: $name_26269 \nName_26269: $name_26269 \nName_26269: $name_26269 \nName_26269: $name_26269 \nEmail_26269: $email_26269 \nMessage_26269: $message_26269 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>