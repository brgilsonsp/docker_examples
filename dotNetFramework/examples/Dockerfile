FROM mcr.microsoft.com/dotnet/framework/aspnet:4.8  
SHELL [powershell]

COPY app.msi /  
RUN Start-Process msiexec.exe -ArgumentList '/i', 'C:\app.msi', '/quiet', '/norestart' -NoNewWindow -Wait
