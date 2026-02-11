
PN = "javapackages-tools"
PE = "0"
PV = "6.4.0"
PR = "1.el10"
PACKAGES = "javapackages-filesystem javapackages-tools javapackages-common javapackages-compat javapackages-generators javapackages-local-openjdk21 maven-local-openjdk21 python3-javapackages"


URI_javapackages-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/javapackages-filesystem-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-filesystem = ""

URI_javapackages-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/javapackages-tools-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-tools = " \
 coreutils \
 bash \
 findutils \
 javapackages-filesystem \
"

URI_javapackages-common = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-common-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-common = " \
 javapackages-generators \
"

URI_javapackages-compat = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-compat-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-compat = " \
 javapackages-local-openjdk21 \
"

URI_javapackages-generators = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-generators-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-generators = " \
 python3 \
 python3-javapackages \
 javapackages-tools \
"

URI_javapackages-local-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javapackages-local-openjdk21-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:javapackages-local-openjdk21 = " \
 javapackages-common \
 java-21-openjdk-devel \
 xmvn-generator \
 ant-openjdk21 \
 xmvn-tools \
"

URI_maven-local-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-local-openjdk21-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-local-openjdk21 = " \
 maven-surefire-plugin \
 maven-jar-plugin \
 javapackages-tools \
 javapackages-local-openjdk21 \
 maven-compiler-plugin \
 java-21-openjdk-devel \
 maven-resources-plugin \
 xmvn-minimal \
 xmvn-mojo \
 xmvn-toolchain-openjdk21 \
"

URI_python3-javapackages = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-javapackages-6.4.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-javapackages = " \
 python3 \
 python3-lxml \
"
