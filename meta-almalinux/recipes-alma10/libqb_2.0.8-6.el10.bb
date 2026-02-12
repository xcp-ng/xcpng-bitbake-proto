
inherit dnf-bridge

PN = "libqb"
PE = "0"
PV = "2.0.8"
PR = "6.el10"
PACKAGES = "libqb doxygen2man"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libqb-2.0.8-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libqb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libqb-2.0.8-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libqb}"
RDEPENDS:libqb = " \
 glibc \
"

URI_doxygen2man = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/doxygen2man-2.0.8-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_doxygen2man}"
RDEPENDS:doxygen2man = " \
 glibc \
 libxml2 \
 libqb \
"
