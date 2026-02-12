
inherit dnf-bridge

PN = "guava"
PE = "0"
PV = "32.1.3"
PR = "6.el10"
PACKAGES = "guava guava-javadoc guava-testlib"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/guava-32.1.3-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_guava = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/guava-32.1.3-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_guava}"
RDEPENDS:guava = " \
 jsr-305 \
 javapackages-filesystem \
"

URI_guava-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guava-javadoc-32.1.3-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_guava-javadoc}"
RDEPENDS:guava-javadoc = " \
 javapackages-filesystem \
"

URI_guava-testlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guava-testlib-32.1.3-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_guava-testlib}"
RDEPENDS:guava-testlib = " \
 jsr-305 \
 junit \
 javapackages-filesystem \
 guava \
"
