<?php	
	if (empty($_POST['name13']) && strlen($_POST['name13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0 || empty($_POST['email13']) && strlen($_POST['email13']) == 0)
	{
		return false;
	}
	
	$name13 = $_POST['name13'];
	$email13 = $_POST['email13'];
	$email13 = $_POST['email13'];
	$email13 = $_POST['email13'];
	$email13 = $_POST['email13'];
	$email13 = $_POST['email13'];
	$email13 = $_POST['email13'];
	$email13 = $_POST['email13'];
	$textarea_265 = $_POST['textarea_265'];
	
	$to = 'receiver@yoursite.com'; // Email submissions are sent to this email

	// Create email	
	$email_subject = "Message from a Blocs website.";
	$email_body = "You have received a new message. \n\n".
				  "Name13: $name13 \nEmail13: $email13 \nEmail13: $email13 \nEmail13: $email13 \nEmail13: $email13 \nEmail13: $email13 \nEmail13: $email13 \nEmail13: $email13 \nTextarea_265: $textarea_265 \n";
	$headers = "MIME-Version: 1.0\r\nContent-type: text/plain; charset=UTF-8\r\n";	
	$headers .= "From: contact@yoursite.com\n";
	$headers .= "Reply-To: $email13";	
	
	mail($to,$email_subject,$email_body,$headers); // Post message
	return true;			
?>