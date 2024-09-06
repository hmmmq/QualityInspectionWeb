<?php	
	if (empty($_POST['name_528']) && strlen($_POST['name_528']) == 0 || empty($_POST['email_528']) && strlen($_POST['email_528']) == 0 || empty($_POST['message_528']) && strlen($_POST['message_528']) == 0)
	{
		return false;
	}
	
	$name_528 = $_POST['name_528'];
	$email_528 = $_POST['email_528'];
	$message_528 = $_POST['message_528'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name_528: $name_528 \nEmail_528: $email_528 \nMessage_528: $message_528 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: DoNotReply@yoursite.com";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>