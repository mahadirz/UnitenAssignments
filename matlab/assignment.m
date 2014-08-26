%% Coded by Mahadir Ahmad
%% mahadir@madet.my


h=0.1;
T=0;
v =0;
s =10;




%Init variables
k1v = -9.81 + 0.5428*v^2;
k1s = v;
vbar = v + ((1/2) * k1v * h);
k2v = -9.81 + (0.5428*vbar^2);
k2s = vbar;
sbar = s + ((1/2) * k1s * h);

vmatrix = [v];
tmatrix = [T];

while s >= 0
    
    fprintf('T = %.4f\n',T);
    fprintf('V = %.4f \n',v);
    fprintf('S = %.4f \n',s);      
    fprintf('Vbar = %.4f \n',vbar);
    fprintf('Sbar = %.4f \n',sbar);
    fprintf('k1v = %.4f \n',k1v);
    fprintf('k1s = %.4f \n',k1s);
    fprintf('k2v = %.4f \n',k2v);
    fprintf('k2s = %.4f \n\n',k2s);    
    T = T + h;
    
    
    
    %second row onwards
    v = v + (k2v * h);
    s = s + (k2s * h);
    
    k1v = -9.81 + 0.5428*v^2;
    k1s = v;
    vbar = v + ((1/2) * k1v * h);
    k2v = -9.81 + (0.5428*vbar^2);
    k2s = vbar;
    sbar = s + ((1/2) * k1s * h);
    

    vmatrix = [vmatrix,v];
    tmatrix = [tmatrix,T];
    
 
end
%display(tmatrix);
plot(tmatrix,vmatrix);