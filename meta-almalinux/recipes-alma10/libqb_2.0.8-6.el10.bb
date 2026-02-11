
inherit dnf-bridge

PN = "libqb"
PE = "0"
PV = "2.0.8"
PR = "6.el10"
PACKAGES = "libqb doxygen2man"


URI_libqb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libqb-2.0.8-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqb = " \
 glibc \
"

URI_doxygen2man = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/doxygen2man-2.0.8-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:doxygen2man = " \
 glibc \
 libxml2 \
 libqb \
"
