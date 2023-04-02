package org.ctemc.BlockchainBasedStudentVerification;

import org.ctemc.BlockchainBasedStudentVerification.contract.ArtifactValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;

import javax.annotation.PostConstruct;
import java.math.BigInteger;

import static org.web3j.tx.Transfer.GAS_LIMIT;
import static org.web3j.tx.gas.DefaultGasProvider.GAS_PRICE;

@Configuration
@PropertySource("classpath:application.properties")
public class BlockchainService {

    private Web3j web3j;
    @Value("${BLOCKCHAIN_ADDRESS}")
    private String BLOCKCHAIN_ADDRESS = "HTTP://127.0.0.1:7545";
    private TransactionManager txmManager;
    private Credentials credentials;

    @Value("${PRIVATE_KEY}")
    private String PRIVATE_KEY = "589bd50066b412503b601946c0602bbf780be2713c3243cea91189943c0e84ea";
    @Value("${CONTRACT_ADDRESS}")
    private String CONTRACT_ADDRESS = "0x56e3996Eb62C2Ab624BCf2056F1aE93394bf2F36";
    private ArtifactValidator artifactValidator;

    private BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);
    private BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);


    public BlockchainService() {
        //Step 1: connect to blockchain
        System.out.println("Contract Address is " + this.CONTRACT_ADDRESS);
        this.web3j = Web3j.build(new HttpService(BLOCKCHAIN_ADDRESS));//Web3j now knows where to connect and where the blockchain service is running
//        System.out.println("Step 1: Connected to Blockchain. Web3j instance is: " + this.web3j);

        //Step 2: Create Credential Object From Private Key
        this.credentials = Credentials.create(this.PRIVATE_KEY);
//        System.out.println("Step 2: Credentials created object is: " + this.credentials);

        //Step 3: Create Transaction Manager
        this.txmManager = new RawTransactionManager(this.web3j, this.credentials);
//        System.out.println("Step 3: Create a Transaction Manager: " + this.txmManager);

        //Step 4: Load Contract
        this.artifactValidator = ArtifactValidator.load(this.CONTRACT_ADDRESS, this.web3j, this.credentials, GAS_PRICE, GAS_LIMIT);
//        System.out.println("Step 4: Contract Loaded: " + this.artifactValidator);

    }

    public void addArtifact(String studentIdentifier, String hash) throws Exception {
        //Step 5: Add Artifact
        this.artifactValidator.setArtifact(studentIdentifier,hash).send();
        Thread.sleep(1000);
//        System.out.println("Step 5: Artifact Added to Blockchain" );
    }
    public String getArtifact(String studentIdentifier) throws Exception {
        //Step 6: Get Artifact Hash
        String hashFromBlockchain = this.artifactValidator.getArtifact(studentIdentifier).send();
        return hashFromBlockchain;

    }



}
