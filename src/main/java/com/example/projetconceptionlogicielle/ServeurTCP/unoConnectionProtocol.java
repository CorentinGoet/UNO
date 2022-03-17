package com.example.projetconceptionlogicielle.ServeurTCP;

import com.example.projetconceptionlogicielle.UNO_game.GameServer;

import java.io.*;

/**
 * Protocol used by the {@link com.example.projetconceptionlogicielle.UNO_game} package to connect the clients to the game servers
 */
public class unoConnectionProtocol implements IProtocole{
    @Override
    public void execute(IContext aContext, InputStream anInputStream, OutputStream anOutputStream) {
        GameServer gameServer = (GameServer) aContext;
        BufferedReader is = new BufferedReader(new InputStreamReader(anInputStream));
        PrintStream os = new PrintStream(anOutputStream);
        String inputReq;
        try{
            if((inputReq = is.readLine()) != null){
                String name = inputReq.split("")[0];
                System.out.println("Received : " + inputReq);
                int ind = gameServer.addPlayer(name);
                os.println(ind);
            }else{
                os.println("Connection Impossible");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
