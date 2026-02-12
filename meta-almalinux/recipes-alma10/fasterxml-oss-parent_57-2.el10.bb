
inherit dnf-bridge

PN = "fasterxml-oss-parent"
PE = "0"
PV = "57"
PR = "2.el10"
PACKAGES = "fasterxml-oss-parent"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/fasterxml-oss-parent-57-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fasterxml-oss-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fasterxml-oss-parent-57-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fasterxml-oss-parent}"
RDEPENDS:fasterxml-oss-parent = " \
 maven-surefire-plugin \
 maven-jar-plugin \
 javapackages-filesystem \
 maven-bundle-plugin \
 maven-compiler-plugin \
 build-helper-maven-plugin \
 java-21-openjdk-headless \
"
