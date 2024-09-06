<?php	
	if (empty($_POST['name14']) && strlen($_POST['name14']) == 0 || empty($_POST['email14']) && strlen($_POST['email14']) == 0)
	{
		return false;
	}
	
	$name14 = $_POST['name14'];
	$email14 = $_POST['email14'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name14: $name14 \nEmail14: $email14 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email14";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>