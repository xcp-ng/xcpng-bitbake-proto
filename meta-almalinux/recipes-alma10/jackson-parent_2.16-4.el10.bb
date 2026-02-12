
inherit dnf-bridge

PN = "jackson-parent"
PE = "0"
PV = "2.16"
PR = "4.el10"
PACKAGES = "jackson-parent"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jackson-parent-2.16-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jackson-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-parent-2.16-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jackson-parent}"
RDEPENDS:jackson-parent = " \
 fasterxml-oss-parent \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
