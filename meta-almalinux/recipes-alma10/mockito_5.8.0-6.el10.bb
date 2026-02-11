
inherit dnf-bridge

PN = "mockito"
PE = "0"
PV = "5.8.0"
PR = "6.el10"
PACKAGES = "mockito mockito-javadoc mockito-junit-jupiter"


URI_mockito = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mockito-5.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mockito = " \
 junit \
 javapackages-filesystem \
 opentest4j \
 byte-buddy \
 byte-buddy-agent \
 objenesis \
"

URI_mockito-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mockito-javadoc-5.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mockito-javadoc = " \
 javapackages-filesystem \
"

URI_mockito-junit-jupiter = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mockito-junit-jupiter-5.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mockito-junit-jupiter = " \
 junit5 \
 javapackages-filesystem \
 mockito \
"
