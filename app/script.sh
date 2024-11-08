for d in */ ; do
    cd $d
    mvn clean package -DskipTests
    cd ../
done