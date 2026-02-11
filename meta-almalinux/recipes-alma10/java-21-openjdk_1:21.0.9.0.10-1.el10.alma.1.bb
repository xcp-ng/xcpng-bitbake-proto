
PN = "java-21-openjdk"
PE = "1"
PV = "21.0.9.0.10"
PR = "1.el10.alma.1"
PACKAGES = "java-21-openjdk java-21-openjdk-demo java-21-openjdk-devel java-21-openjdk-headless java-21-openjdk-javadoc java-21-openjdk-javadoc-zip java-21-openjdk-jmods java-21-openjdk-src java-21-openjdk-static-libs java-21-openjdk-demo-fastdebug java-21-openjdk-demo-slowdebug java-21-openjdk-devel-fastdebug java-21-openjdk-devel-slowdebug java-21-openjdk-fastdebug java-21-openjdk-headless-fastdebug java-21-openjdk-headless-slowdebug java-21-openjdk-jmods-fastdebug java-21-openjdk-jmods-slowdebug java-21-openjdk-slowdebug java-21-openjdk-src-fastdebug java-21-openjdk-src-slowdebug java-21-openjdk-static-libs-fastdebug java-21-openjdk-static-libs-slowdebug"


URI_java-21-openjdk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk = " \
 libXi \
 libXcomposite \
 fontconfig \
 xorg-x11-fonts-Type1 \
 libX11 \
 libXrender \
 bash \
 libXtst \
 java-21-openjdk-headless \
 glibc \
 libXext \
"

URI_java-21-openjdk-demo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-demo-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-demo = " \
 java-21-openjdk \
"

URI_java-21-openjdk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-devel-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-devel = " \
 glibc \
 alternatives \
 java-21-openjdk \
 bash \
"

URI_java-21-openjdk-headless = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-headless-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-headless = " \
 alsa-lib \
 nss \
 crypto-policies \
 javapackages-filesystem \
 ca-certificates \
 cups-libs \
 tzdata-java \
 bash \
 glibc \
 alternatives \
 lksctp-tools \
"

URI_java-21-openjdk-javadoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-javadoc-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-javadoc = " \
 alternatives \
 bash \
 javapackages-filesystem \
 java-21-openjdk-headless \
"

URI_java-21-openjdk-javadoc-zip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-javadoc-zip-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-javadoc-zip = " \
 alternatives \
 bash \
 javapackages-filesystem \
 java-21-openjdk-headless \
"

URI_java-21-openjdk-jmods = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-jmods-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-jmods = " \
 java-21-openjdk-devel \
"

URI_java-21-openjdk-src = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-src-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-src = " \
 java-21-openjdk-headless \
"

URI_java-21-openjdk-static-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/java-21-openjdk-static-libs-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-static-libs = " \
 java-21-openjdk-devel \
"

URI_java-21-openjdk-demo-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-demo-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-demo-fastdebug = " \
 java-21-openjdk-fastdebug \
"

URI_java-21-openjdk-demo-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-demo-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-demo-slowdebug = " \
 java-21-openjdk-slowdebug \
"

URI_java-21-openjdk-devel-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-devel-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-devel-fastdebug = " \
 alternatives \
 java-21-openjdk-fastdebug \
 bash \
"

URI_java-21-openjdk-devel-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-devel-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-devel-slowdebug = " \
 alternatives \
 java-21-openjdk-slowdebug \
 bash \
"

URI_java-21-openjdk-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-fastdebug = " \
 java-21-openjdk-headless-fastdebug \
 xorg-x11-fonts-Type1 \
 fontconfig \
 bash \
 libXcomposite \
"

URI_java-21-openjdk-headless-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-headless-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-headless-fastdebug = " \
 nss \
 crypto-policies \
 javapackages-filesystem \
 ca-certificates \
 cups-libs \
 tzdata-java \
 bash \
 alternatives \
 lksctp-tools \
"

URI_java-21-openjdk-headless-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-headless-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-headless-slowdebug = " \
 nss \
 crypto-policies \
 javapackages-filesystem \
 ca-certificates \
 cups-libs \
 tzdata-java \
 bash \
 alternatives \
 lksctp-tools \
"

URI_java-21-openjdk-jmods-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-jmods-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-jmods-fastdebug = " \
 java-21-openjdk-devel-fastdebug \
"

URI_java-21-openjdk-jmods-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-jmods-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-jmods-slowdebug = " \
 java-21-openjdk-devel-slowdebug \
"

URI_java-21-openjdk-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-slowdebug = " \
 java-21-openjdk-headless-slowdebug \
 xorg-x11-fonts-Type1 \
 fontconfig \
 bash \
 libXcomposite \
"

URI_java-21-openjdk-src-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-src-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-src-fastdebug = " \
 java-21-openjdk-headless-fastdebug \
"

URI_java-21-openjdk-src-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-src-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-src-slowdebug = " \
 java-21-openjdk-headless-slowdebug \
"

URI_java-21-openjdk-static-libs-fastdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-static-libs-fastdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-static-libs-fastdebug = " \
 java-21-openjdk-devel-fastdebug \
"

URI_java-21-openjdk-static-libs-slowdebug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java-21-openjdk-static-libs-slowdebug-21.0.9.0.10-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:java-21-openjdk-static-libs-slowdebug = " \
 java-21-openjdk-devel-slowdebug \
"
