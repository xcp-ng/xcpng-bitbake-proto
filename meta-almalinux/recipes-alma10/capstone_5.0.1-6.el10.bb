
inherit dnf-bridge

PN = "capstone"
PE = "0"
PV = "5.0.1"
PR = "6.el10"
PACKAGES = "capstone capstone-devel capstone-java python3-capstone"


URI_capstone = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/capstone-5.0.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:capstone = " \
 glibc \
"

URI_capstone-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/capstone-devel-5.0.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:capstone-devel = " \
 capstone \
 pkgconf-pkg-config \
"

URI_capstone-java = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/capstone-java-5.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:capstone-java = " \
 capstone \
"

URI_python3-capstone = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-capstone-5.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-capstone = " \
 python3 \
 capstone \
"
