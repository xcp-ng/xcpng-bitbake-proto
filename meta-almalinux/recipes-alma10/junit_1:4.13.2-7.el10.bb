
inherit dnf-bridge

PN = "junit"
PE = "1"
PV = "4.13.2"
PR = "7.el10"
PACKAGES = "junit junit-javadoc junit-manual"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/junit-4.13.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_junit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/junit-4.13.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_junit}"
RDEPENDS:junit = " \
 hamcrest \
 javapackages-filesystem \
"

URI_junit-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/junit-javadoc-4.13.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_junit-javadoc}"
RDEPENDS:junit-javadoc = " \
 javapackages-filesystem \
"

URI_junit-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/junit-manual-4.13.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_junit-manual}"
RDEPENDS:junit-manual = ""
