<?php	
	if (empty($_POST['name25']) && strlen($_POST['name25']) == 0 || empty($_POST['email25']) && strlen($_POST['email25']) == 0 || empty($_POST['message25']) && strlen($_POST['message25']) == 0)
	{
		return false;
	}
	
	$name25 = $_POST['name25'];
	$email25 = $_POST['email25'];
	$message25 = $_POST['message25'];
	$optin25 = $_POST['optin25'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name25: $name25 \nEmail25: $email25 \nMessage25: $message25 \nOptin25: $optin25 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email25";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>