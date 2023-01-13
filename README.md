# BlockchainBasedStudentVerification
Using a blockchain based web-system to optimize the efficiency and validity of the college application process.

## How to deploy smart contract in Ganache

Prerequisites: 
1. Install node.js as this is a prerequisite to install the truffle suite (this includes Ganache and other truffle tools)
2. By installing node.js npm (node package manager) also is installed 
3. npm can be used to download and install any javascript based package like the truffle suite 

Installing Truffle and Ganache:
1. In the command prompt run the following commands 
   2. npm install -g truffle 
   3. validate installation by running the truffle version 
   4. the output should say:
      Truffle v5.7.2 (core: 5.7.2)
      Ganache v7.6.0
      Solidity v0.5.16 (solc-js)
      Node v18.13.0
      Web3.js v1.8.1
   5. 


Setting up solidity structure, compilation, and deployment 
2. Create and navigate to blockchain directory (C:\home\git-repose\BlockchainBasedStudentVerification\src\main\blockchain)
2. In the console run following commands
   3. truffle init -- this will create the project structure for the blockchain development e.g. folders like contracts, 
      migrations and test - only ONCE 
      4. contract will store all the smart contract files 
      5. migration will store all deployment scripts 
      6. tests will create and store the test files
   7. update truffle-config.js to update local blockchain (ganache) address and port
   8. add migration scripts under the migration folder
   9. truffle migrate -- deploy the contract to the blockchain 
       - run from blockchain (C:\home\git-repose\BlockchainBasedStudentVerification\src\main\blockchain) 


C:\home\git-repos\web3j-3.3.1\bin>web3j truffle generate 
C:\home\git-repos\college-blockchain\src\main\blockchain\build\contracts\ArtifactValidator.json -o 
C:\home\git-repos\college-blockchain\src\main\java -p org.ctemc.collegeblockchain.contract
1. use Web3j utility to generate contract specific java code ^ this is the command
2. 


to do + questions:
- understand abi and binary of smart contract
- 
   
   