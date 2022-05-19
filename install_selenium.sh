wget https://chromedriver.storage.googleapis.com/101.0.4951.41/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
sudo cp chromedriver /usr/bin/chromedriver
sudo chown root /usr/bin/chromedriver
sudo chmod +x /usr/bin/chromedriver
sudo chmod 755 /usr/bin/chromedriver
echo "ChromeDriver was successfully installed !"