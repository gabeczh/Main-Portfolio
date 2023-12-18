const main = async () => {
    const gameContractFactoryBaxie = await hre.ethers.getContractFactory('NotAxie');
    const gameContractFactoryMap = await hre.ethers.getContractFactory('NotAxieMap');
    const gameContractBaxie = await gameContractFactoryBaxie.deploy(
      ["Player 1"],       // Names
      ["https://i.imgur.com/pKd5Sdk.png"], //Images
      [100],                    // HP values
      [100]                       // Attack damage values
    );
    await gameContractBaxie.deployed();
    const gameContractMap = await gameContractFactoryMap.deploy(
        ["Map 1"],       // Names
        ["https://i.imgur.com/JPabP.png"] //Images
      );
    await gameContractMap.deployed();
    console.log("Contract deployed to:", gameContractBaxie.address);
    console.log("Contract deployed to:", gameContractMap.address);
    let txn;
// We only have three characters.
// an NFT w/ the character at index 2 of our array.
txn = await gameContractBaxie.mintCharacterNFT(0);
await txn.wait();

// Get the value of the NFT's URI.
let returnedPlayerTokenUri = await gameContractBaxie.tokenURI(1);
console.log("Token URI:", returnedPlayerTokenUri);

txn = await gameContractMap.mintMapNFT(0);
await txn.wait();

// Get the value of the NFT's URI.
let returnedMapTokenUri = await gameContractMap.tokenURI(1);
console.log("Token URI:", returnedMapTokenUri);

  };

  
  
  const runMain = async () => {
    try {
      await main();
      process.exit(0);
    } catch (error) {
      console.log(error);
      process.exit(1);
    }
  };
  
  runMain();