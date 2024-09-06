<?php	
	if (empty($_POST['name25_48779_42267_10759']) && strlen($_POST['name25_48779_42267_10759']) == 0 || empty($_POST['email25_48779_42267_10759']) && strlen($_POST['email25_48779_42267_10759']) == 0 || empty($_POST['message25_48779_42267_10759']) && strlen($_POST['message25_48779_42267_10759']) == 0)
	{
		return false;
	}
	
	$name25_48779_42267_10759 = $_POST['name25_48779_42267_10759'];
	$email25_48779_42267_10759 = $_POST['email25_48779_42267_10759'];
	$message25_48779_42267_10759 = $_POST['message25_48779_42267_10759'];
	$optin25_48779_42267_10759 = $_POST['optin25_48779_42267_10759'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name25_48779_42267_10759: $name25_48779_42267_10759 \nEmail25_48779_42267_10759: $email25_48779_42267_10759 \nMessage25_48779_42267_10759: $message25_48779_42267_10759 \nOptin25_48779_42267_10759: $optin25_48779_42267_10759 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email25_48779_42267_10759";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>