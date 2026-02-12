
inherit dnf-bridge

PN = "jackson-annotations"
PE = "0"
PV = "2.16.1"
PR = "3.el10"
PACKAGES = "jackson-annotations jackson-annotations-javadoc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jackson-annotations-2.16.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jackson-annotations = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-annotations-2.16.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jackson-annotations}"
RDEPENDS:jackson-annotations = " \
 javapackages-filesystem \
 java-21-openjdk-headless \
"

URI_jackson-annotations-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-annotations-javadoc-2.16.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jackson-annotations-javadoc}"
RDEPENDS:jackson-annotations-javadoc = " \
 javapackages-filesystem \
"
