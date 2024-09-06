<?php	
	if (empty($_POST['name12']) && strlen($_POST['name12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0 || empty($_POST['email12']) && strlen($_POST['email12']) == 0)
	{
		return false;
	}
	
	$name12 = $_POST['name12'];
	$email12 = $_POST['email12'];
	$email12 = $_POST['email12'];
	$email12 = $_POST['email12'];
	$email12 = $_POST['email12'];
	$email12 = $_POST['email12'];
	$email12 = $_POST['email12'];
	$email12 = $_POST['email12'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name12: $name12 \nEmail12: $email12 \nEmail12: $email12 \nEmail12: $email12 \nEmail12: $email12 \nEmail12: $email12 \nEmail12: $email12 \nEmail12: $email12 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email12";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>