<?php	
	if (empty($_POST['name_27230']) && strlen($_POST['name_27230']) == 0 || empty($_POST['email_27230']) && strlen($_POST['email_27230']) == 0 || empty($_POST['email_27230']) && strlen($_POST['email_27230']) == 0 || empty($_POST['message_27230']) && strlen($_POST['message_27230']) == 0)
	{
		return false;
	}
	
	$name_27230 = $_POST['name_27230'];
	$email_27230 = $_POST['email_27230'];
	$email_27230 = $_POST['email_27230'];
	$message_27230 = $_POST['message_27230'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name_27230: $name_27230 \nEmail_27230: $email_27230 \nEmail_27230: $email_27230 \nMessage_27230: $message_27230 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email_27230";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>