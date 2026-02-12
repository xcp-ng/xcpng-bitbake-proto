
inherit dnf-bridge

PN = "weldr-client"
PE = "0"
PV = "35.11"
PR = "4.el10"
PACKAGES = "weldr-client weldr-client-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/weldr-client-35.11-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_weldr-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/weldr-client-35.11-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_weldr-client}"
RDEPENDS:weldr-client = " \
 glibc \
 diffutils \
"

URI_weldr-client-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/weldr-client-tests-35.11-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_weldr-client-tests}"
RDEPENDS:weldr-client-tests = " \
 glibc \
 createrepo_c \
"
