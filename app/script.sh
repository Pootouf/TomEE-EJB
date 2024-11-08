mkdir /build
for d in */ ; do
    cd $d
    mvn clean package -DskipTests
    cp target/*.{jar,war} /build/
    cd ../
done