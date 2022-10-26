#See https://aka.ms/containerfastmode to understand how Visual Studio uses this Dockerfile to build your images for faster debugging.

FROM mcr.microsoft.com/dotnet/aspnet:6.0 AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
WORKDIR /src
COPY ["TesteDois/TesteDois.csproj", "TesteDois/"]
RUN dotnet restore "TesteDois/TesteDois.csproj"
COPY . .
WORKDIR "/src/TesteDois"
RUN dotnet build "TesteDois.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "TesteDois.csproj" -c Release -o /app/publish /p:UseAppHost=false

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "TesteDois.dll"]