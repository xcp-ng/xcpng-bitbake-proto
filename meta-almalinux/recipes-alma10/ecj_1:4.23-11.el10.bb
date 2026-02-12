
inherit dnf-bridge

PN = "ecj"
PE = "1"
PV = "4.23"
PR = "11.el10"
PACKAGES = "ecj"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ecj-4.23-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ecj = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ecj-4.23-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ecj}"
RDEPENDS:ecj = " \
 java-21-openjdk-headless \
 bash \
 javapackages-filesystem \
 javapackages-tools \
"
