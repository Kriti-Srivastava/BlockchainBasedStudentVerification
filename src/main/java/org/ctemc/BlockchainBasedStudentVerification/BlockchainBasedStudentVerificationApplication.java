package org.ctemc.BlockchainBasedStudentVerification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;


@SpringBootApplication
public class BlockchainBasedStudentVerificationApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(BlockchainBasedStudentVerificationApplication.class, args);
		System.out.println("Welcome to this novel Blockchain Based Student Verification System!");
		//Scanner consoleReader = new Scanner(System.in);

		//System.out.println("Are you a school or a college? ");
		//String userType = consoleReader.nextLine();


//		//student identifier concat
//		System.out.println("Please enter the student's graduating class (yyyy format):");
//		String gradYear = consoleReader.nextLine();
//		gradYear = (gradYear != null) ? gradYear.trim() : "-";
//
//		System.out.println("Please enter the country in which the student's high school is located (print in abbreviations (e.g US for United States)) :");
//		String country = consoleReader.nextLine();
//		country = (country != null) ? country.toUpperCase().trim() : "-";
//
//		System.out.println("Please enter the state in which the student's high school is located (print in abbreviations (e.g NJ for New Jersey)):");
//		String state = consoleReader.nextLine();
//		state = (state != null) ? state.toUpperCase().trim() : "-";
//
//		System.out.println("Please enter the high schools ID:");
//		String school = consoleReader.nextLine();
//		school = (school != null) ? school.toUpperCase().trim() : "-";
//
//		System.out.println("Please enter the student's school ID:");
//		String ID = consoleReader.nextLine();
//		ID = (ID != null) ? ID.toUpperCase().trim() : "-";
//
//		System.out.println("Please enter the document type:");
//		String artifact = consoleReader.nextLine();
//		artifact = (artifact != null) ? artifact.toUpperCase().trim() : "-";


//		String gradYear = "2025";
//		String country = "US";
//		String state = "NJ";
//		String school = "HTHS";
//		String ID = "07751";
//		String artifact = "REPORTCARD";

//		String uniqueStudentIdentifier = gradYear + "-" + country + "-" + state  + "-" + school + "-" + ID + "-" + artifact;
//		System.out.println(uniqueStudentIdentifier);

		//artifact hash

//		System.out.println("\nEnter the document's location: ");
//		String  artifactLocation = consoleReader.nextLine();
//		artifactLocation = (artifactLocation != null) ? artifactLocation.trim() : "-";
//		System.out.println("Artifact location is: " + artifactLocation);

//		Path filePath = Path.of(artifactLocation);
//		String artifactContent = Files.readString(filePath);
////		System.out.println("File contents are: " + artifactContent);

//		String artifactHash = DigestUtils.sha256Hex(artifactContent);
//		System.out.println("The artifactHash is: " + artifactHash);
//--------------------------------------------------------------------------------------------

		// done with user
		BlockchainService blockchainService = new BlockchainService();
//
//		if (userType.equalsIgnoreCase("SCHOOL")){
//			blockchainService.addArtifact(uniqueStudentIdentifier, artifactHash);
//			System.out.println("*************************************************");
//			System.out.println("Document has been added to the blockchain network");
//			System.out.println("*************************************************");
//		}
//		else{
//			String returnedHash = blockchainService.getArtifact(uniqueStudentIdentifier);
//			if(returnedHash.equalsIgnoreCase(artifactHash)){
//				System.out.println("****************************************************");
//				System.out.println("Blockchain validation SUCCESSFUL. Document is VALID.");
//				System.out.println("****************************************************");
//			}
//			else{
//				System.out.println("**************************************************");
//				System.out.println("Blockchain validation FAILED. Document is INVALID.");
//				System.out.println("**************************************************");
//			}
//		}
	}

}
