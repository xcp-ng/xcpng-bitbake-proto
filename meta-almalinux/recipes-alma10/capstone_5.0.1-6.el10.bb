
inherit dnf-bridge

PN = "capstone"
PE = "0"
PV = "5.0.1"
PR = "6.el10"
PACKAGES = "capstone capstone-devel capstone-java python3-capstone"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/capstone-5.0.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_capstone = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/capstone-5.0.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_capstone}"
RDEPENDS:capstone = " \
 glibc \
"

URI_capstone-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/capstone-devel-5.0.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_capstone-devel}"
RDEPENDS:capstone-devel = " \
 capstone \
 pkgconf-pkg-config \
"

URI_capstone-java = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/capstone-java-5.0.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_capstone-java}"
RDEPENDS:capstone-java = " \
 capstone \
"

URI_python3-capstone = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-capstone-5.0.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-capstone}"
RDEPENDS:python3-capstone = " \
 python3 \
 capstone \
"
