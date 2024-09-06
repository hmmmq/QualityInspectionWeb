<?php	
	if (empty($_POST['name25_48779']) && strlen($_POST['name25_48779']) == 0 || empty($_POST['email25_48779']) && strlen($_POST['email25_48779']) == 0 || empty($_POST['message25_48779']) && strlen($_POST['message25_48779']) == 0)
	{
		return false;
	}
	
	$name25_48779 = $_POST['name25_48779'];
	$email25_48779 = $_POST['email25_48779'];
	$message25_48779 = $_POST['message25_48779'];
	$optin25_48779 = $_POST['optin25_48779'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name25_48779: $name25_48779 \nEmail25_48779: $email25_48779 \nMessage25_48779: $message25_48779 \nOptin25_48779: $optin25_48779 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email25_48779";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>