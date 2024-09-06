<?php	
	if (empty($_POST['name24']) && strlen($_POST['name24']) == 0 || empty($_POST['email24']) && strlen($_POST['email24']) == 0 || empty($_POST['message']) && strlen($_POST['message']) == 0)
	{
		return false;
	}
	
	$name24 = $_POST['name24'];
	$email24 = $_POST['email24'];
	$message = $_POST['message'];
	$optin = $_POST['optin'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name24: $name24 \nEmail24: $email24 \nMessage: $message \nOptin: $optin \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email24";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>