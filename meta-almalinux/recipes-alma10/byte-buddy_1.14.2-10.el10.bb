
PN = "byte-buddy"
PE = "0"
PV = "1.14.2"
PR = "10.el10"
PACKAGES = "byte-buddy byte-buddy-agent byte-buddy-javadoc byte-buddy-maven-plugin"


URI_byte-buddy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byte-buddy-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy = " \
 objectweb-asm \
 javapackages-filesystem \
"

URI_byte-buddy-agent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/byte-buddy-agent-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy-agent = " \
 javapackages-filesystem \
"

URI_byte-buddy-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/byte-buddy-javadoc-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy-javadoc = " \
 javapackages-filesystem \
"

URI_byte-buddy-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/byte-buddy-maven-plugin-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy-maven-plugin = " \
 maven-resolver \
 plexus-build-api0 \
 javapackages-filesystem \
 byte-buddy \
"
