import SelectCharacter from "./Components/SelectCharacter";
import React, { useEffect, useState } from "react";
import twitterLogo from "./assets/twitter-logo.svg";
import "./App.css";
import myEpicGame from './utils/MyEpicGame.json';
import { ethers } from 'ethers';
import { CONTRACT_ADDRESS, transformCharacterData } from './constants';
import Arena from './Components/Arena';
import LoadingIndicator from './Components/LoadingIndicator';

// Constants
const TWITTER_HANDLE = "_buildspace";
const TWITTER_LINK = `https://twitter.com/${TWITTER_HANDLE}`;

const App = () => {
  const [currentAccount, setCurrentAccount] = useState(null);

  const [characterNFT, setCharacterNFT] = useState(null);

  const [isLoading, setIsLoading] = useState(false);

 // Actions
 const checkIfWalletIsConnected = async () => {
  try {
    const { ethereum } = window;

    if (!ethereum) {
      console.log('Make sure you have MetaMask!');
      /*
       * We set isLoading here because we use return in the next line
       */
      setIsLoading(false);
      return;
    } else {
      console.log('We have the ethereum object', ethereum);

      const accounts = await ethereum.request({ method: 'eth_accounts' });

      if (accounts.length !== 0) {
        const account = accounts[0];
        console.log('Found an authorized account:', account);
        setCurrentAccount(account);
      } else {
        console.log('No authorized account found');
      }
    }
  } catch (error) {
    console.log(error);
  }
  /*
   * We release the state property after all the function logic
   */
  setIsLoading(false);
};

  
  /*
   * Implement your connectWallet method here
   */
  const connectWalletAction = async () => {
    try {
      const { ethereum } = window;

      if (!ethereum) {
        alert("Get MetaMask!");
        return;
      }

      /*
       * Fancy method to request access to account.
       */
      const accounts = await ethereum.request({
        method: "eth_requestAccounts",
      });

      /*
       * Boom! This should print out public address once we authorize Metamask.
       */
      console.log("Connected", accounts[0]);
      setCurrentAccount(accounts[0]);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    const checkNetwork = async () => {
      try { 
        if (window.ethereum.networkVersion !== '4') {
          alert("Please connect to Rinkeby!")
        }
      } catch(error) {
        console.log(error)
      }
    }
    checkIfWalletIsConnected();
  }, []);

  const renderContent = () => {

    if(isLoading){
      return <LoadingIndicator />;
    }

    if (!currentAccount) {
      return (
        <div className="connect-wallet-container">
          <img
            src="https://64.media.tumblr.com/8ea4112feba777fe1aeec821dbbe46fc/tumblr_nnsxihHSk61ramnmyo1_400.gifv"
            alt="Samurai Jack Gif"
          />
          <button
            className="cta-button connect-wallet-button"
            onClick={connectWalletAction}
          >
            Connect Wallet To Get Started
          </button>
        </div>
      );
    } else if (currentAccount && !characterNFT) {
      return <SelectCharacter setCharacterNFT={setCharacterNFT} />;	
    /*
    * If there is a connected wallet and characterNFT, it's time to battle!
    */
    } else if (currentAccount && characterNFT) {
      return  <Arena characterNFT={characterNFT} setCharacterNFT={setCharacterNFT} />;
    }
  }; 

  /*
 * Add this useEffect right under the other useEffect where you are calling checkIfWalletIsConnected
 */
// UseEffects
useEffect(() => {
  /*
   * Anytime our component mounts, make sure to immiediately set our loading state
   */
  setIsLoading(true);
  checkIfWalletIsConnected();
}, []);

useEffect(() => {
  const fetchNFTMetadata = async () => {
    console.log('Checking for Character NFT on address:', currentAccount);

    const provider = new ethers.providers.Web3Provider(window.ethereum);
    const signer = provider.getSigner();
    const gameContract = new ethers.Contract(
      CONTRACT_ADDRESS,
      myEpicGame.abi,
      signer
    );

    const characterNFT = await gameContract.checkIfUserHasNFT();
    if (characterNFT.name) {
      console.log('User has character NFT');
      setCharacterNFT(transformCharacterData(characterNFT));
    }

    /*
     * Once we are done with all the fetching, set loading state to false
     */
    setIsLoading(false);
  };

  if (currentAccount) {
    console.log('CurrentAccount:', currentAccount);
    fetchNFTMetadata();
  }
}, [currentAccount]);
  

  return (
    <div className="App">
      <div className="container">
        <div className="header-container">
          <p className="header gradient-text">⚔️ The Future! ⚔️</p>
          <p className="sub-text">Team up to protect the Metaverse!</p>
          {/* This is where our button and image code used to be!
           *	Remember we moved it into the render method.
           */}
          {renderContent()}
        </div>
        <div className="footer-container">
          <img alt="Twitter Logo" className="twitter-logo" src={twitterLogo} />
          <a
            className="footer-text"
            href={TWITTER_LINK}
            target="_blank"
            rel="noreferrer"
          >{`built with @${TWITTER_HANDLE}`}</a>
        </div>
      </div>
    </div>
  );
};
export default App;
